# Hero Service
This service is developed for angular tour of heros sample app.

**Development Frameworks**
* [AdoptOpenJDK 11 LTS](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot)
* [Gradle](https://docs.gradle.org)
* [Sprint Boot 2.2.2](https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/gradle-plugin/reference/html/)

    
Docker Support
-----------------------------------

1. Under home directory of the project run the following command to build docker image:
   ```
   ./gradlew buildImage
    ```
2. Run the docker at any port(e.g., 8080):   
   ```
   docker run --env ENV_VAR=anyvalue --name=heros-container -d -p 8080:8080  springboot/heros:0.0.1
   ```
3. Access the home page of app via the following url    
    ```
    http://localhost:8080
    ```

Reference
---------
