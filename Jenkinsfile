pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                echo 'Checkout'
                git 'https://github.com/smpkl/OTP_week5.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Build App'
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo 'Test App'
                bat 'mvn test'
            }
        }

        stage('Code coverage') {
            steps {
                echo 'Code coverage'
                bat 'mvn jacoco:report'
            }
        }

        stage('Publish test result') {
            steps {
                echo 'Publish test result'
                junit '**/target/surefire-reports/*.xml'
            }
        }

        stage('Publish coverage report') {
            steps {
                echo 'Publish coverage report'
                jacoco()
            }
        }
    }
}