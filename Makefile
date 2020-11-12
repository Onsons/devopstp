

build:
	mvn -B package --file pom.xml
start: build
	mvn spring-boot:run
test:
	mvn test
clean:
	mvn clean install
benchmark:
	mvn test -pl maven-perf -Dtest=org.quickperf.maven.bench.MvnValidateAllocationByMaven3VersionTest -B
