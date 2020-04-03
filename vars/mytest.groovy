#!/usr/bin/env groovy

def call(String test='none') {
  bat 'cd build && ctest'
}
