pipeline {

    agent any

    tools {
<<<<<<< HEAD
=======
        jdk 'JDK21'
>>>>>>> bdb1ca6f2669fe2311098c526af32818b9eee013
        maven 'Maven3'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
<<<<<<< HEAD
                    url: 'https://github.com/Debadyuty/ParaBankAutomation.git'
=======
                url: 'https://github.com/Debadyuty/ParaBankAutomation.git'
>>>>>>> bdb1ca6f2669fe2311098c526af32818b9eee013
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
