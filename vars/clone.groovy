#!/usr/bin/env groovy

def clone(String mybranch = "master", String myurl) {
	git branch: mybranch, url: myurl
}
	

//def call(String name = 'human') {
//  echo "Clone , ${name}."
//}
