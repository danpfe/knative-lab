FROM docker.io/library/maven:3-eclipse-temurin-17 AS builder

WORKDIR /build

COPY src ./src
COPY pom.xml ./pom.xml
COPY settings.xml ./settings.xml

RUN mvn -B -Duser.home=/tmp -s settings.xml package

FROM docker.io/library/eclipse-temurin:17

COPY --from=builder /build/target/knative-runner.jar /deployments/

CMD ["java", "-jar", "/deployments/knative-runner.jar"]
