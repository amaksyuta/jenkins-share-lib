def call(body) 
{
    // evaluate the body block, and collect configuration into the object
    def pipelineParams= [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()

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
                sayHello(pipelineParams.node)
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sayHello(pipelineParams.prodtype)
            }
        }
    }
}
}