pipeline{
    agent  any 

    stages {

        stage("test"){
      
            steps {
                echo "testing the application..."
                echo "executing pipeline for branch ${BRANCH_NAME} "
            }
            
        }
        stage("build"){
            when {
                expression{
                    BRANCH_NAME == 'master'
                }
            }
            steps {
                echo "building the application..."
            }

        }
        stage("deploy"){
            steps {
                echo "deploying the application..."
            }
        }
    }

}
