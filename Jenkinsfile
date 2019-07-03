pipeline
{
    agent any
    stages
    {
        stage('Build')
        {
            steps
            {
                dir 'src/'
                bat 'javac Read.java'
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