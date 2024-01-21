
def git(repo)
{
   echo "https://github.com/intelliqittrainings/${repo}.git"
}

def maven()
{
   echo sh "mvn package"
}
