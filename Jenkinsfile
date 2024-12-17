pipeline {
    agent any 
    tools {
        maven 'maven-3.9.9'
    }
    stages {

        stage ("build jar"){
            steps {
                script {
                    sh "mvn package"
                }
             
            }
        }
        stage ("build image"){
            steps {
                script {
                    echo "building the docker image..."
                    withCredentials([credentialType(credentialsId: 'dockerhub-creds', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                        sh 'docker build -t marv254/demo-app:jma-2.0 .'
                        sh 'echo $PASS | docker login -u $USER  --password-stdin'
                        sh 'docker push marv254/demo-app:jma-2.0'
}

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
