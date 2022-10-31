@Library("tpac-pkg-library@main") _

<<<<<<< HEAD
pkgdefPipeline {
    branch = "dev"
    node = "master"
    prodtype = "PRO"
=======
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
>>>>>>> 5d4d91424c0fa5020f6f0f528ff3d61ffac5376e
}
