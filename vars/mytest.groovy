#!/usr/bin/env groovy

def call() {
  bat 'cd build && ctest'
}
