pipeline {
    agent any

    environment {
        DOCKER_COMPOSE_FILE = 'APP.yaml'
    }

    stages {
        stage('Checkout') {
            steps {
                // Clone your repository
                git 'https://github.com/ihssoum/TESTT.git' // Update this URL to your repo
            }
        }
        stage('Build') {
            steps {
                script {
                    // Build the Docker images
                    sh "docker-compose -f ${DOCKER_COMPOSE_FILE} build"
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    // Start the containers
                    sh "docker-compose -f ${DOCKER_COMPOSE_FILE} up -d"
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



