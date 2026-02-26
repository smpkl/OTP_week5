pipeline {
    agent any
    environment {
        PATH = "${env.PATH};C:\\Windows\\System32"
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/smpkl/OTP_week5.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Code coverage') {
            steps {
                bat 'mvn jacoco:report'
            }
        }

        stage('Publish test result') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }

        stage('Publish coverage report') {
            steps {
                jacoco(execPattern: '**/target/jacoco.exec')
            }
        }
    }
}