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
        stage('Deploy'){
            steps{
                  sh 'ls -ltr'
            }

        }

    }
}