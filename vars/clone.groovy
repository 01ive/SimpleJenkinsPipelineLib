#!/usr/bin/env groovy

def clone(String url ='none') {
	git branch: 'feature/jenkins', url: 'https://github.com/01ive/SimpleCppWorkflows.git'
}
	

//def call(String name = 'human') {
//  echo "Clone , ${name}."
//}
