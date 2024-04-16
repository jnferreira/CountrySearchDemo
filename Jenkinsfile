node {
  stage("Clone project") {
    git branch: 'main', url: 'https://github.com/jnferreira/CountrySearchDemo.git'
  }

  stage("Build project with test execution") {
    sh "./mvnw clean install -Dspring.profiles.active=prod"
  }
}