pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from Git repository
                git url: 'https://github.com/kutty27/ShippingManagement.git', branch: 'main'
            }
        }
        stage('Compile') {
            steps {
                // Compile the Java code
                sh 'javac *.java'
            }
        }
        stage('Run') {
            steps {
                // Run the Main class
                sh 'java Main'
            }
        }
    }
}
