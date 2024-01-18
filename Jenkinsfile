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
stage('Run JAR Locally'){
        steps {
            sh 'java -jar /home/slave4/workspace/bus_booking_develop/target/bus-booking-app-1.0-SNAPSHOT.jar'
    }
}
        stage('deploy') {
            steps {
                    sh 'scp /home/slave4/workspace/bus_booking_develop/target/bus-booking-app-1.0-SNAPSHOT.jar root@172.31.8.32:/opt/apache-tomcat-8.5.98/webapps'
}
}
    }
}

