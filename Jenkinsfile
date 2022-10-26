@Library("tpac-pkg-library@${env.BRANCH_NAME}") _

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		sayHello('DEVVV')
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
