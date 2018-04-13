# HelloJava10
Used for testing of Java10 semantic and code coverage for SonarJava

### build command
The following command will also generate coverage report and trigger SonarQube analysis

    mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install sonar:sonar
