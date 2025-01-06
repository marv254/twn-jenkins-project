
library identifier: 'jenkins-shared-library@master', retriever: modernSCM(
    [$class: 'GitSCMSource',
    remote: 'https://github.com/marv254/jenkins-shared-library.git',
    credentialsId: 'github-creds']
)
pipeline {
    agent any 
    tools {
        maven 'maven-3.9.9'
    }
    stages {

        stage ("build jar"){
            steps {
                script {
                    buildJar()
                }
             
            }
        }
        stage ("build image"){
            steps {
                script {
                    buildImage('marv254/demo-app:jma-3.0')
                    dockerLogin()
                    dockerPush ('marv254/demo-app:jma-3.0')

                }
             
            }
        }

          stage ("deploy"){
            steps {
                script{
                    echo "deploying the application..."
                }
            }
        }
    }
}
