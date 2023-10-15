node {
    // agent any // You can specify a specific agent based on your environment
    // agent {
    //     docker {
    //         image 'maven:3.6-jdk-11'
    //         args '-v /path/to/your/source/code:/app'
    //     }
    // }
    tools {
        maven 'Maven 3.8.6'
    }
    stage('Checkout') {
            // Check out the source code from your Git repository
            // git url: 'https://github.com/soufiayyoub/hello-world.git'
            checkout scm
    }

    stage('Build') {
            // Build the Spring Boot application
            sh 'mvn clean install'
    }

    stage('Test') {
            // Run tests if any
            sh 'mvn test'
    }

    stage('Deploy') {
            // Deploy the Spring Boot application
            sh 'java -jar target/your-app-name.jar'
    }

    // post {
    //     success {
    //         // You can add post-build actions here
    //     }
    // }
}
