pipeline {
    agent any
    environment {
        AWS_ACCOUNT_ID='976676792625'
        AWS_DEFAULT_REGION='us-east-2'
        IMAGE_REPO_NAME='test'
        IMAGE_TAG='latest'
        REPOSITORY_URI = '${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_DEFAULT_REGION}.amazonaws.com/${IMAGE_REPO_NAME}'
    }

    stages{
        stage('Logging into AWS ECR') {
            steps {
                script {
                    sh 'echo Inside logging into AWS ECR'
                    sh 'aws configure set aws_access_key_id AKIA6GZTZFEYW7CKCPPG'
                    sh 'aws configure set aws_secret_access_key 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'
                    sh 'aws configure set region us-east-2'
                    sh 'aws ecr get-login-password --region ${AWS_DEFAULT_REGION}'
                }
            }
        }
        stage('Build'){
            steps{
                  sh 'mvn clean package'
            }
        }
        stage('mid'){
            steps{
                  sh 'ls -ltr'
            }
        }
        stage('Build Image'){
            steps{
                script{
                    dockerImage = docker.build '${IMAGE_REPO_NAME}:${IMAGE_TAG}'
                }
            }
        }


    }
}