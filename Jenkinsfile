def gv

pipeline {
    agent any 
    tools {
        maven 'maven-3.9.9'
    }
    stages {

        stage ("Init"){
            steps {
                script {
                   gv = load "script.groovy"
                }
             
            }
        }
        stage ("build jar"){
            steps {
                script {
                    gv.buildJar()
                }
             
            }
        }
        stage ("build image"){
            steps {
                script {
                    gv.buildImage()
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
