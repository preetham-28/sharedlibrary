def gitdownload(repo)
{
    git "https://github.com/intelliqittrainings/${repo}.git"
}

def build()
{
     sh "mvn package"
}

def tomcatdeploy(ip,contextpath)
{
     "deploy adapters: [tomcat9(credentialsId: '6568a0c6-613f-4317-84fb-685ed86709da', path: '', url: ${ip})], contextPath: ${contextpath}, war: '**/*.war"
}
