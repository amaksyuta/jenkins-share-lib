@Library("tpac-pkg-library@dev") _

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		sayHello('DEVWWWV')
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
