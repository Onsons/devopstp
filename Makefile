

build:
	mvn -B package --file pom.xml
start: build
	mvn spring-boot:run
test:
	mvn clean -Dtest=FactTest test
clean:
	mvn clean install
benchmark:
	mvn clean -Dtest=BenchMarkTest test
