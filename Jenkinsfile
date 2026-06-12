pipeline {

    agent any

    tools {
        jdk 'JDK21'
        maven 'Maven3'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                url: 'https://github.com/Debadyuty/ParaBankAutomation.git'
            }
        }

        stage('Clean Project') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Compile Project') {
            steps {
                bat 'mvn compile'
            }
        }

        stage('Execute TestNG Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Archive Reports') {
            steps {
                archiveArtifacts artifacts: 'reports/**', fingerprint: true
            }
        }
    }

    post {

        success {
            echo 'Automation Execution Successful'
        }

        failure {
            echo 'Automation Execution Failed'
        }

        always {

            publishHTML(target: [
                allowMissing: true,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'reports',
                reportFiles: 'ExtentReport.html',
                reportName: 'Extent Report'
            ])

        }
    }
}
