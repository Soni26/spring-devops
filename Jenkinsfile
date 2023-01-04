pipeline{
  agent{ label 'linux' }
  
  stages{
    stage('Scan') {
      steps{
        withSonarQubeEnv('server-sonar') {
          sh "mnv sonar:sonar"
        }
      }
    }
  }
}
