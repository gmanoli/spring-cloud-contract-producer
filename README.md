# Swagger Template Service

1. Define contract in http://editor.swagger.io/
    - TODO add yml file as base example
    
2. Once is finished, go to Generate Server --> Spring

3. Copy generated files:
    - the API interface and the API Controller into the 'controller' package
    - the Model class into de 'model' package. 
    (e.g. PetApi, PetApiController and Pet)
    
    NOTE that in this step you should solve the import issues due to the swagger auto generation

## Plugins

The template contains the following plugins:

  * jacoco

    https://mvnrepository.com/artifact/org.jacoco/jacoco-maven-plugin

    Provides code coverage metrics for Java code via integration with JaCoCo.
    You can create the report by running the following command:

    ```bash
      $ mvn clean test
    ```

    The report will be created in target/site/jacoco/index.html subdirectory in your project directory.
