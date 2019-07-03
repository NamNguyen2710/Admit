pipeline
{
    agent any
    stages
    {
        stage('Build')
        {
            steps
            {
                cd src/
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
        //stage('Package')
        //{
            //steps
            {
                //jar cfve Read.jar Read Read.class
                //java -jar Read.jar
            //}
        //}
    }
}