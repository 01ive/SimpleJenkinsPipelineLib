#!/usr/bin/env groovy

def call() {
  bat 'cmake --build ./build --config Debug --target myCoverage'
}
