def call('build)
         {
           sh 'mvn --version'
                    sh 'mvn clean install'
         }
