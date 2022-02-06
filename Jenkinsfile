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
                    sh 'aws ecr get-login-password — region ${AWS_DEFAULT_REGION} | docker login — username AWS — password-stdin ${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_DEFAULT_REGION}.amazonaws.com'
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
        stage('Deploy'){
             steps{
                  script{
                    docker.withDockerRegistry('https://976676792625.dkr.ecr.us-east-2.amazonaws.com','ecr:us-east-2:my.aws.credentials')
                        def myImage = docker.build('test')
                        myImage.push('latest')
                  }
             }
        }

    }
}