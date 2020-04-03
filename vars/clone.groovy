#!/usr/bin/env groovy

def clone(String mybranch = "master", String myurl) {
	git branch: mybranch, url: myurl
}