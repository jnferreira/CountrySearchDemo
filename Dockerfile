# Stage 1: Build the application
FROM maven:3.8.1-openjdk-17-slim AS build

WORKDIR /app

# Copy the pom.xml file
COPY pom.xml .

# Download all required dependencies into one layer
RUN mvn dependency:go-offline -B

# Copy your other files
COPY src ./src

# Build the application
RUN mvn clean package -P prod

# Stage 2: Run the application
FROM openjdk:17

# Defina a versão do Tomcat
ARG TOMCAT_VERSION=10.1.20

# Baixe e instale o Tomcat usando curl
RUN curl -o /tmp/tomcat.tar.gz https://downloads.apache.org/tomcat/tomcat-10/v${TOMCAT_VERSION}/bin/apache-tomcat-${TOMCAT_VERSION}.tar.gz
RUN cd /opt && tar zxf /tmp/tomcat.tar.gz && rm /tmp/tomcat.tar.gz
RUN mv /opt/apache-tomcat-${TOMCAT_VERSION} /opt/tomcat

# Defina as variáveis de ambiente
ENV CATALINA_HOME /opt/tomcat
ENV PATH $PATH:$CATALINA_HOME/bin

# Exponha a porta 8080
EXPOSE 8080

# Copy the WAR file to the Tomcat webapps directory
COPY --from=build /app/target/*.war $CATALINA_HOME/webapps/

# Inicie o Tomcat
CMD ["catalina.sh", "run"]