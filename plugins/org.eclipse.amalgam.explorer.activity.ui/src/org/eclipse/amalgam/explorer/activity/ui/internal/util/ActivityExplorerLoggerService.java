/*******************************************************************************
 * Copyright (c)  2006, 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.ui.internal.util;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.ILogListener;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.Bundle;

public class ActivityExplorerLoggerService implements ILog {
	
	private static final ILog delegate = ActivityExplorerActivator.getDefault().getLog();
	
	private static ActivityExplorerLoggerService loggerService = new ActivityExplorerLoggerService();
	
	public synchronized static ActivityExplorerLoggerService getInstance(){
		if (loggerService == null){
			loggerService = new ActivityExplorerLoggerService();
		}
		return loggerService;
	}

	@Override
	public void addLogListener(ILogListener listener) {
		delegate.addLogListener(listener);
	}

	@Override
	public Bundle getBundle() {
		return delegate.getBundle();
	}

	@Override
	public void log(IStatus status) {
		delegate.log(status);
	}
	
	public void log(int severity, String message, Throwable exception){
		IStatus status = null;
		
		if (exception == null) {
			status = new Status(severity, ActivityExplorerActivator.ID, message);
		} else {
			status = new Status(severity, ActivityExplorerActivator.ID, message, exception);
		}
		
		log(status);
	}

	@Override
	public void removeLogListener(ILogListener listener) {
		delegate.removeLogListener(listener);
	}

}
