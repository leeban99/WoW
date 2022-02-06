pipeline {
    agent any
    tools {
        terraform 'Terraform'
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