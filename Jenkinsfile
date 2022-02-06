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
        stage('build and push to ECR') {
             steps {
                  script {
                        sh 'echo $HOME'
                        sh 'build_push.sh'
                        // Script will use the
                        //'aws ecr get-login-password --region ${AWS_DEFAULT_REGION} | docker login --username AWS --password-stdin 976676792625.dkr.ecr.us-east-2.amazonaws.com'
                  }
             }
        }


    }
}