pipeline{
    agent any
    tools{
        maven 'my-maven'
        jdk 'my-jdk'
    }
    stages{
        stage('Clone'){
            steps{
                git url:'https://github.com/gururaj-r123/department-service.git',branch:'main'
            }
        }
        stage('Build'){
            steps{
                bat "mvn clean install -DskipTests"
            }
        }
        stage('Test'){
            steps{
                bat "mvn test"
            }
        }
        stage('Deploy'){
            steps{
                bat "docker rm -f my-dep-container"
                bat "docker rmi -f my-dep-image"
                bat "docker build -t my-dep-image ."
                bat "docker run -p 8081:8081 -d --name my-dep-container my-dep-image"
            }
        }
    }
}
