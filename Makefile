

build:
	mvn -B package --file pom.xml
start: build
	mvn spring-boot:run
test:
	mvn test
clean:
	mvn clean install
benchmark:
	mvn clean -Dtest=BenchMark test
