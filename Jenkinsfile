pipeline {
    agent { label 'slave4'}

    stages {
        stage('checkout') {
            steps {
                sh 'rm -rf bus_booking'
                sh 'git clone https://github.com/Chaitraradha/bus_booking.git'
            }
        }
stage('build') {
            steps {
                    sh 'mvn --version'
                    sh 'mvn clean install'
                  }
       }
    }
}
