job('First-Maven-Project') {
    
  description("First maven job generated by DSL")

  scm {
        git ("https://github.com/rajjdevops/myweb.git",'master')
    }
    
  triggers {
        scm ('* * * * *')
    }
    
  steps {
        maven('clean package', 'pom.xml')
  }
    
  publishers {
        archiveArtifacts '*.war'
    }
}
