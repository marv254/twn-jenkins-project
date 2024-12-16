def buildApp(){
    echo "building the application..."
}

def testApp(){
    echo 'tesing the application...'
}
def deployApp(){
    echo 'deploying the application...'
    echo "deploying version ${VERSION}"
}

return this
