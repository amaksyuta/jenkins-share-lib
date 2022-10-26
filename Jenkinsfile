<<<<<<< HEAD
@Library("tpac-pkg-library@main") _
=======
@Library("tpac-pkg-library@${env.BRANCH_NAME}") _
>>>>>>> 657dde067106b2ff264bdc0207058aeeabcc4f03

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
<<<<<<< HEAD
		sayHello('MAIN')
=======
		sayHello('DEVVV')
>>>>>>> 657dde067106b2ff264bdc0207058aeeabcc4f03
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
