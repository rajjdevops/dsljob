job('job_dsl3') {

description('simple job')

parameters {
  string defaultValue: 'world', description: 'This is Hell', name: 'Planet'
  choice choices: ['INDIA', 'AUSTRALIA', 'USA'], description: 'Welcome u shithead', name: 'COUNTRY OF BIRTH'
}

scm {
    git('https://github.com/rajjdevops/javaSpringBoot.git', 'master')
}

triggers {
    cron('H 5 * * 7')
}

}
