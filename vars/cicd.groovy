
def git(repo)
{
   echo "https://github.com/intelliqittrainings/${repo}.git"
}

def mavenbuild()
{
   echo sh "mvn package"
}
