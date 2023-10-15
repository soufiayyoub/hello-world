node {
    // agent any // You can specify a specific agent based on your environment
    stage('Checkout') {
            // Check out the source code from your Git repository
            // git url: 'https://github.com/soufiayyoub/hello-world.git'
            checkout scm
    }

    stage('Build') {
        def mvnHome = tool name: 'maven', type: 'maven'
        sh "${mvnHome}/bin/mvn -version"
        // Build the Spring Boot application
        sh '${mvnHome}/bin/mvn -version'
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
