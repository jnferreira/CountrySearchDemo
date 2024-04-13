# Use a imagem base do Java 11
FROM openjdk:11

# Defina a versão do Tomcat
ARG TOMCAT_VERSION=9.0.50

# Baixe e instale o Tomcat
RUN wget https://downloads.apache.org/tomcat/tomcat-9/v${TOMCAT_VERSION}/bin/apache-tomcat-${TOMCAT_VERSION}.tar.gz -O /tmp/tomcat.tar.gz
RUN cd /opt && tar zxf /tmp/tomcat.tar.gz && rm /tmp/tomcat.tar.gz
RUN mv /opt/apache-tomcat-${TOMCAT_VERSION} /opt/tomcat

# Defina as variáveis de ambiente
ENV CATALINA_HOME /opt/tomcat
ENV PATH $PATH:$CATALINA_HOME/bin

# Exponha a porta 8080
EXPOSE 8080

# Inicie o Tomcat
CMD ["catalina.sh", "run"]