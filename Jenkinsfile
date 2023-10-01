pipeline {
	agent any
	stages {
		
		stage('Compile') {
			steps {
				bat "gradlew compileJava"
			}
		}
		
		stage('Unit Test') {
			steps {
				bat "gradlew test"
			}
		}
	}
}