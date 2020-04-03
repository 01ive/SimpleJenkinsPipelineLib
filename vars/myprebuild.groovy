#!/usr/bin/env groovy

def call(String test='none') {
  bat 'cmake -S . -B .\\build -G "MinGW Makefiles"'
}
