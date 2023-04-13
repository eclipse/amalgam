pipeline {
  agent { label 'migration' }
  tools {
        maven 'apache-maven-latest'
        jdk 'openjdk-jdk11-latest'
  }
  parameters { 
    choice(name: 'PLATFORM', choices: ['capella', 'oxygen'], description: 'Platform to use')
  }
  environment {
    FROM_PR = "${BRANCH_NAME}".contains("PR-");
    BUILD_KEY = "${BRANCH_NAME}-${BUILD_ID}".replaceFirst(/^v/, "").replaceAll('/','-');

    SSH_ACCOUNT = "genie.amalgam@projects-storage.eclipse.org"
    TARGET_DIR = "/home/data/httpd/download.eclipse.org/modeling/amalgam/updates/nightly/${BUILD_KEY}/${params.PLATFORM}"
    NIGHTLY_KEY = "${BRANCH_NAME}".replaceFirst(/^v/, "").replaceAll('/','-');
    NIGHTLY_DIR = "/home/data/httpd/download.eclipse.org/modeling/amalgam/updates/nightly/${NIGHTLY_KEY}/${params.PLATFORM}"
  }
  stages {
    stage('Package Amalgam') {
      steps {
        sh "env"
        sh "mvn clean package -Psign -DPLATFORM=${params.PLATFORM} -Dmaven.test.failure.ignore=true  --fail-at-end -f releng/org.eclipse.amalgam.releng/pom.xml"
      }
    }
    stage('Publish artifacts') {
      steps {
        script {    
          currentBuild.description = "${BUILD_KEY} - <a href=\"https://download.eclipse.org/modeling/amalgam/updates/nightly/${BUILD_KEY}\">site</a>"         
        }
        sshagent ( ['projects-storage.eclipse.org-bot-ssh']) {
          sh "ssh $SSH_ACCOUNT mkdir -p $TARGET_DIR"
          sh "scp -rp $WORKSPACE/features/org.eclipse.amalgam.update/target/repository/* $SSH_ACCOUNT:$TARGET_DIR"
        }
      }
    }
    stage('Publish nightly') {
      when {
        expression { return "${env.FROM_PR}".contains("false") } 
      }
      steps {
        sshagent ( ['projects-storage.eclipse.org-bot-ssh']) {
          sh "ssh $SSH_ACCOUNT rm -rf $NIGHTLY_DIR"
          sh "ssh $SSH_ACCOUNT mkdir -p $NIGHTLY_DIR"
          sh "scp -rp $WORKSPACE/features/org.eclipse.amalgam.update/target/repository/* $SSH_ACCOUNT:$NIGHTLY_DIR"
        }
      }
    }
  }
}