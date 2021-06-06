#!/usr/bin/env groovy

pipeline {
    agent any
    
    stages {
        stage('jobs') {
           steps {
                
                sh """
                   job2.groovy
                   maven.groovy
                   job3.groovy
               """
           }
            
        }
    }


}
