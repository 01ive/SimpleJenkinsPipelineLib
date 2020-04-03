#!/usr/bin/env groovy

def call(String test='none') {
  bat 'cmake --build .\\build\\'
}
