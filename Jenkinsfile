pipeline {
    agent any

    environment {
        DOCKER_COMPOSE_FILE = 'APP.yaml'
    }

    stages {
        stage('Checkout') {
            steps {
                // Clone your repository
                checkout scm
            }
        }
        stage('Build') {
            steps {
                script {
                    // Build the Docker images
                    bat "docker-compose -f ${DOCKER_COMPOSE_FILE} build"
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    // Start the containers
                    bat "docker-compose -f ${DOCKER_COMPOSE_FILE} up -d"
                }
            }
        }
    }

    post {
        success {
            echo 'Déploiement réussi !'
        }
        failure {
            echo 'Le déploiement a échoué.'
        }
    }
}



