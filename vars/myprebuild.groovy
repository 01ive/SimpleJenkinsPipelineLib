#!/usr/bin/env groovy

def call() {
  bat 'cmake -S . -B .\\build -G "MinGW Makefiles"'
}
