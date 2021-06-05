
job('job_dsl example ') {

description('simple job')

parameters {
  stringParam( defaultValue = 'world', description = 'This is Hell', name = 'Planet')
  choiceParam( 'COUNTRY',['INDIA', 'AUSTRALIA', 'USA'], 'Welcome u shithead' )
}

scm {
    git('https://github.com/rajjdevops/javaSpringBoot.git', 'master')
}

triggers {
    cron('H 5 * * 7')
}

}
