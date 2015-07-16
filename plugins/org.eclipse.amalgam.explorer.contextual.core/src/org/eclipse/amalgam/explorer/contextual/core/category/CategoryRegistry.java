/******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *****************************************************************************/
package org.eclipse.amalgam.explorer.contextual.core.category;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.amalgam.explorer.contextual.core.ExplorerActivator;
import org.eclipse.amalgam.explorer.contextual.core.ext.AbstractExtensionPointManager;
import org.eclipse.amalgam.explorer.contextual.core.provider.IExplorerContentProvider;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.ecore.EObject;

/**
 * Category Registry. Responsibility of initialize and cache all categories on loading. Gathering categories in session.
 */
public class CategoryRegistry extends AbstractExtensionPointManager{
  /**
   * Singleton.
   */
  protected static CategoryRegistry _categoryRegistry = null;
  private static final String CONTENT_PROVIDER_CATEGORY = Messages.getString("CategoryRegistry.ContentProvider"); //$NON-NLS-1$
  /**
   * Cache of category
   */
  protected List<ICategory> categoriesCache = new ArrayList<ICategory>(0);
  /**
   * CategoryMap<Category Id, Category>
   */
  protected HashMap<String, ICategory> currentElementRegistry = null;
  protected HashMap<String, ICategory> diagramElementRegistry = null;

  protected HashMap<String, ICategory> referencedElementRegistry = null;

  protected HashMap<String, ICategory> referencingElementRegistry = null;

  /**
   * Singleton constructor.
   */
  private CategoryRegistry() {
    initRegister();
  }

  /**
   * @param viewerId_p
   * @param currentElement_p
   * @return
   */
  public Set<ICategory> gatherCategories(String viewerId_p, EObject currentElement_p) {
    Set<ICategory> result = gatherCategoriesInternal(currentElement_p, getRegistry(viewerId_p));
    return result;
  }

  /**
   * @param currentElement_p_p
   * @param viewerId_p_p
   * @param elementRegistry_p
   * @return
   */
  private Set<ICategory> gatherCategoriesInternal(Object element_p, HashMap<String, ICategory> elementRegistry_p) {
    Set<ICategory> categories = new HashSet<ICategory>(0);
    Set<Entry<String, ICategory>> entrySet = elementRegistry_p.entrySet();
    for (Entry<String, ICategory> entry : entrySet) {
      ICategory category = entry.getValue();
      // type matching.
      if (category.isAvailableForType(element_p)) {
        // top level category.
        if (category.isTopLevel()) {
          categories.add(category);
        }
      }
    }
    return categories;
  }

  /**
   * @param viewerId_p
   * @param category_p
   * @return
   */
  public List<ICategory> gatherSubCategories(String viewerId_p, EObject currentElement_p, ICategory category_p) {
    List<ICategory> result = gatherSubCategoriesInternal(currentElement_p, category_p, getRegistry(viewerId_p));
    return result;
  }

  /**
   * @param category_p
   * @param elementRegistry_p
   * @param categories
   * @param category
   */
  private List<ICategory> gatherSubCategoriesInternal(Object element_p, ICategory category_p, HashMap<String, ICategory> elementRegistry_p) {
    List<ICategory> subCategories = new ArrayList<ICategory>(0);
    for (String subCategoryId : category_p.getSubCategoryIds()) {
      ICategory subCategory = elementRegistry_p.get(subCategoryId);
      if ((subCategory != null) && subCategory.isAvailableForType(element_p)) {
        subCategories.add(subCategory);
      }
    }
    return subCategories;
  }

  protected HashMap<String, ICategory> getRegistry(String viewerId_p) {
    if (viewerId_p.equalsIgnoreCase(IExplorerContentProvider.ID_CURRENT_CP)) {
      return currentElementRegistry;
    } else if (viewerId_p.equalsIgnoreCase(IExplorerContentProvider.ID_REFERENCED_CP)) {
      return referencedElementRegistry;
    } else if (viewerId_p.equalsIgnoreCase(IExplorerContentProvider.ID_REFERENCING_CP)) {
      return referencingElementRegistry;
    } else {// ID_DIAGRAM_CP Statement.
      return diagramElementRegistry;
    }
  }

  /**
   * Initialize Register. One shot initialization. Spread the categories among right register.
   */
  private void initRegister() {
    currentElementRegistry = new HashMap<String, ICategory>(0);
    referencedElementRegistry = new HashMap<String, ICategory>(0);
    referencingElementRegistry = new HashMap<String, ICategory>(0);
    diagramElementRegistry = new HashMap<String, ICategory>(0);

    IConfigurationElement[] categories = getConfigurationElementsFor(ExplorerActivator.PLUGIN_ID, CONTENT_PROVIDER_CATEGORY);

    for (IConfigurationElement categoryConfigurationElement : categories) {
      // Create simple instance of category
      ICategory category = new CategoryImpl();

      /**
       * Fill category
       */
      // Retrieve id attribute.
      String categoryId = categoryConfigurationElement.getAttribute(DEFAULT_ID_ATTRIBUTE);
      category.setId(categoryId);

      // Retrieve name attribute.
      String categoryName = categoryConfigurationElement.getAttribute(DEFAULT_NAME_ATTRIBUTE);
      category.setName(categoryName);

      // Retrieve isTopLevel attribute.
      String isTopLevelCategory = categoryConfigurationElement.getAttribute(Messages.getString("CategoryRegistry.TopLevel")); //$NON-NLS-1$
      if ((isTopLevelCategory != null) && (isTopLevelCategory != "")) { //$NON-NLS-1$
        category.setIsTopLevel(Boolean.parseBoolean(isTopLevelCategory));
      } else {
        category.setIsTopLevel(false);
      }

      // Retrieve sub categories ids.
      IConfigurationElement[] subCategoriesNodes = categoryConfigurationElement.getChildren(Messages.getString("CategoryRegistry.SubCategory")); //$NON-NLS-1$
      if (subCategoriesNodes.length > 0) {
        IConfigurationElement[] subCategoryConfigurationElements = subCategoriesNodes[0].getChildren(Messages.getString("CategoryRegistry.Category")); //$NON-NLS-1$
        for (IConfigurationElement subCategoryConfigurationElement : subCategoryConfigurationElements) {
          // retrieve the id attribute and add it in the category.
          category.addSubCategoryId(subCategoryConfigurationElement.getAttribute(DEFAULT_ID_ATTRIBUTE));
        }
      }

      // Retrieve item queries
      IConfigurationElement[] itemQueriesNode = categoryConfigurationElement.getChildren(Messages.getString("ItemQueries")); //$NON-NLS-1$
      if (itemQueriesNode.length > 0) {
        IConfigurationElement[] itemQueries = itemQueriesNode[0].getChildren(Messages.getString("basicQuery")); //$NON-NLS-1$
        List<IConfigurationElement> basicQueryCollection = Arrays.asList(itemQueries);
        List<IConfigurationElement> navigationQueryCollection =
            Arrays.asList(itemQueriesNode[0].getChildren(Messages.getString("CategoryRegistry.NavigationQuery"))); //$NON-NLS-1$
        basicQueryCollection.addAll(navigationQueryCollection);
        itemQueries = (IConfigurationElement[]) basicQueryCollection.toArray();
        for (IConfigurationElement itemQueryConfigurationElement : itemQueries) {
          Object queryInstance = createInstance(itemQueryConfigurationElement, DEFAULT_CLASS_ATTRIBUTE);
          category.addItemQuery(queryInstance);
        }
      }

      // Retrieve category queries
      IConfigurationElement[] queryConfigurationElements = categoryConfigurationElement.getChildren(Messages.getString("CategoryRegistry.CategoryQuery")); //$NON-NLS-1$
      if (queryConfigurationElements.length > 0) {
        Object query = null;
        IConfigurationElement queryConfigurationElement = queryConfigurationElements[0];
        IConfigurationElement[] categoryQueries = queryConfigurationElement.getChildren(Messages.getString("basicQuery")); //$NON-NLS-1$
        if (categoryQueries.length == 0) {
          categoryQueries = queryConfigurationElement.getChildren(Messages.getString("CategoryRegistry.NavigationQuery")); //$NON-NLS-1$
        }

        if (categoryQueries.length > 0) {
          query = createInstance(categoryQueries[0], DEFAULT_CLASS_ATTRIBUTE);
        }
        category.setQuery(query);
      }

      // Retrieve type.
      IConfigurationElement[] typeConfigurationElement = categoryConfigurationElement.getChildren(Messages.getString("CategoryRegistry.AvailableForType")); //$NON-NLS-1$
      if (typeConfigurationElement.length > 0) {
        String qualifiedClassName = typeConfigurationElement[0].getAttribute(DEFAULT_CLASS_ATTRIBUTE);
        category.setTypeFullyQualifiedName(qualifiedClassName);
      }

      // Retrieve target explorer id : a category is specific to an explorer.
      IConfigurationElement[] targetExplorerIdNode = categoryConfigurationElement.getChildren(Messages.getString("CategoryRegistry.TargetExplorerId")); //$NON-NLS-1$
      if (targetExplorerIdNode.length > 0) {
        IConfigurationElement explorerIdConfigurationElement = targetExplorerIdNode[0];
        // Register the category in the proper cache.
        String id = explorerIdConfigurationElement.getAttribute(DEFAULT_ID_ATTRIBUTE);
        if (id.equalsIgnoreCase(IExplorerContentProvider.ID_CURRENT_CP)) {
          // index categories by ids.
          currentElementRegistry.put(categoryId, category);
        } else if (id.equalsIgnoreCase(IExplorerContentProvider.ID_REFERENCING_CP)) {
          referencingElementRegistry.put(categoryId, category);
        } else if (id.equalsIgnoreCase(IExplorerContentProvider.ID_REFERENCED_CP)) {
          referencedElementRegistry.put(categoryId, category);
        } else {
          // ID_DIAGRAM_CP Statement.
          diagramElementRegistry.put(categoryId, category);
        }
      }
    }
  }

  /**
   * Singleton accessor.
   * @return
   */
  public static CategoryRegistry getInstance() {
    if (_categoryRegistry == null) {
      _categoryRegistry = new CategoryRegistry();
    }
    return _categoryRegistry;
  }
}
