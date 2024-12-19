def buildJar(){
    echo "building the application..."
    sh "mvn package"
}
def buildImage(){
    echo "building the docker image..."
    withCredentials([credentialType(credentialsId: 'dockerhub-creds', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t marv254/demo-app:jma-2.0 .'
        sh 'echo $PASS | docker login -u $USER  --password-stdin'
        sh 'docker push marv254/demo-app:jma-2.0'
}

}

def testApp(){
    echo 'testing the application...'
}
def deployApp(){
    echo 'deploying the application...'
    echo "deploying version ${VERSION}"
}

return this
