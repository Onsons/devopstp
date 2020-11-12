

build:
	mvn -B package --file pom.xml
start: build
	mvn spring-boot:run
test:
	mvn test FactTest
clean:
	mvn clean install
benchmark:
	mvn test BenchMark
