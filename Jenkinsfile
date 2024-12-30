
@Library('jenkins-shared-lib')

def gv

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
                    buildImage()
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
