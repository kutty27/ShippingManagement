pipeline {
    agent any

    stages {
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
