pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Checkout the repository code
                checkout scm
            }
        }
        stage('Run Python Script') {
            steps {
                // Run the Helloworld.py script
                script {
                    sh "python3 hello_world.py"
                }
            }
        }
    }
}
