.PHONY: bootstrap setup update run console clean build test cibuild
.DEFAULT_GOAL := help

help:
	echo "Primary goals are build, run, test, verify. 'make run' to execute"

clean:
	./gradlew clean
	rm -rf levelup-reports

bootstrap:
	echo "'Bootstrap' works"

build: 
	./gradlew build -x test
	
package:
	./gradlew assemble

test: 
	echo "Running unit tests"
	./gradlew test

test-acceptance: 
	echo "Running cucumber tests"
	- ./gradlew cucumberCli
	- mkdir -p ./output
	- cp -R src/test/resources/images output

test-all: test test-acceptance

run: build
	java -jar ./build/libs/LevelUpGame-0.0.1-SNAPSHOT.jar