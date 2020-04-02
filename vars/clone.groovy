#!/usr/bin/env groovy

def call(String branch = 'master', String url = '') {
  git branch: ${branch}, url: ${url}
}
