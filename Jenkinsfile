@Library("tpac-pkg-library@main") _

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		sayHello('MAIN')
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
