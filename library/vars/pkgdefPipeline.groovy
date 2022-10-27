def call(Map pipelineParams) 
{

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		        sayHello(pipelineParams.branch)
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
}