node {
  stage("Clone project") {
    git branch: 'main', url: 'https://github.com/jnferreira/CountrySearchDemo.git'
  }

  stage("Change permissions") {
    sh "chmod +x ./mvnw"
  }

  stage("Build project with test execution") {
    sh "./mvnw clean install -Dspring.profiles.active=prod"
  }
}