@Library('tpac-pkg-library') _

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		sayHello('AAAAAA')
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
