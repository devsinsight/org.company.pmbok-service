FROM orgcompany/orgcompany.pmbok
VOLUME /tmp
ADD org.company.pmbok-service.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.edockergd=file:/dev/./urandom -jar /app.jar" ]