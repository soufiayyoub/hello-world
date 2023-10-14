// Define a Jenkins job using the Job DSL

job('HelloWorldSpringApp') {
    // Configure the job's display name
    displayName('Hello World Spring App Job')

    // Define the build steps
    steps {
        maven {
            // Set the Maven version (you can customize this)
            mavenInstallation('Maven')
            goals('clean package')
            // Define the POM file path
            rootPOM('pom.xml')
        }
    }

    // Define the source code management (e.g., Git)
    scm {
        git {
            // Set the Git repository URL
            remote {
                url('https://github.com/soufiayyoub/hello-world.git')
            }
            branches('*/master') // Customize the branch name
        }
    }

    // Post-build actions
    publishers {
        extendedEmail {
            recipientList('soufiayyoub@gmail.com') // Replace with your email address
            contentType('text/html')
            defaultSubject('Build Notification for HelloWorldSpringApp')
            defaultContent('Build Status: $BUILD_STATUS\n\nCheck the build details at $BUILD_URL')
        }
    }
}
