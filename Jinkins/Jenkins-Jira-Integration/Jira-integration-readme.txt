#This is a guide to set-up Jenkins Integration with Jira-Cloud

Set up a Jenkinsfile to explicitly send build events to Jira
A Jenkins server will send build events (“success” or “failure”) to Jira whenever it runs a pipeline stage containing a jiraSendBuildInfo instruction.

To receive build events from a server:

Open the Jenkinsfiles(s) defining the pipelines you want to receive build data from

Add a jiraSendBuildInfo step to the end of any build stages you would like to send data to Jira

(Optional) Add Jira site names to jiraSendBuildInfo instructions to specify which Jira site Jenkins should send build events to

Example Jenkinsfile
If your server runs a pipeline defined by the following Jenkinsfile:

pipeline {
     agent any
     stages {
         stage('Build') {
             steps {
                 echo 'Building...'
             }
             post {
                 always {
                     jiraSendBuildInfo 
                 }
             }
         }
     }
 }
The server will send build events (“success” or “failure”) to any connected Jira site when the stage containing jiraSendBuildInfo is run.

If your server is connected to multiple Jira sites, you can specify a particular site to send build data in the jiraSendBuildInfo instruction. For example:

jiraSendBuildInfo site: 'example.atlassian.net'

Alternate method
Some Jenkins servers support an additional method of choosing what build data is sent to Jira. If this server supports the stage name method, 
it will be detailed in its set up guide.