# Use the official Jenkins image as a base
FROM jenkins/jenkins:lts

# Skip the setup wizard
ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false"

# Install any additional plugins
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

# Expose the default Jenkins port
EXPOSE 8080

# Expose the default Jenkins agent port
EXPOSE 50000