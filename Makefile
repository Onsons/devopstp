

build:
	mvn -B package --file pom.xml
start: build
	mvn spring-boot:run
test:
	mvn test
clean:
	mvn clean install
benchmark: clean
	java -jar target/test-classes/com/example/demo/controllers
