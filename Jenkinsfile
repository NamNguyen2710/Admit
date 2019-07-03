pipeline
{
    agent any
    stages
    {
        stage('Build')
        {
            steps
            {
                dir src/
                javac Read.java
            }
        }
        stage('Run')
        {
            steps
            {
                java Read
            }
        }
    }
}