FROM bellsoft/liberica-runtime-container:jdk-21-slim-musl
COPY target/thalaforreason-0.0.1-SNAPSHOT.jar /opt/app/
EXPOSE 8080
CMD ["java", "-showversion", "-jar", "/opt/app/thalaforreason-0.0.1-SNAPSHOT.jar"]