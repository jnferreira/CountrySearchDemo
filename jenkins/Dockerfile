# Use the official Jenkins image as a base
FROM jenkins/jenkins:lts

# Skip the setup wizard
ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false"

# Expose the default Jenkins port
EXPOSE 8080

# Expose the default Jenkins agent port
EXPOSE 50000