pipeline {
    agent any // You can specify a specific agent based on your environment

    stages {
        stage('Checkout') {
            steps {
                // Check out the source code from your Git repository
                // git url: 'hhttps://github.com/soufiayyoub/hello-world.git'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Build the Spring Boot application
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run tests if any
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Deploy the Spring Boot application
                sh 'java -jar target/your-app-name.jar &'
            }
        }
    }

    // post {
    //     success {
    //         // You can add post-build actions here
    //     }
    // }
}
