pipeline
{
    agent any
    stages
    {
        stage('Build')
        {
            steps
            {
                bat "cd src/"
                bat "javac Read.java" 
            }
        }
        stage('Run')
        {
            steps
            {
                bat "java Read"
            }
        }
        stage('Package')
        {
            steps
            {
                bat "jar cfve Read.jar Read Read.class"
                bat "java -jar Read.jar"
            }
        }
    }
}