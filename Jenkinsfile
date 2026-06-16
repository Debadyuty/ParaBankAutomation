pipeline {

    agent any

    tools {
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

        stage('Execute Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Archive Reports') {
            steps {

                archiveArtifacts artifacts: 'reports/**/*',
                                 allowEmptyArchive: true

                archiveArtifacts artifacts: 'screenshots/**/*',
                                 allowEmptyArchive: true
            }
        }
    }

    post {

        success {
            echo 'ParaBank Automation Framework Executed Successfully'
        }

        failure {
            echo 'ParaBank Automation Framework Execution Failed'
        }

        always {

            publishHTML(target: [
                allowMissing: true,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'reports',
                reportFiles: 'ExtentReport.html',
                reportName: 'ParaBank Automation Report'
            ])
        }
    }
}