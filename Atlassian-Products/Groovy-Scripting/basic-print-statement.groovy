//Basic Print Statement

println "Hello, Groovy!"

//Working with Variables:

def name = "Jira Admin"
def age = 30
println "User: ${name}, Age: ${age}"

//Looping Through a List:

def items = ["Jira", "Confluence", "Bitbucket"]
items.each { item -> println "Atlassian Tool: $item" }

//If-Else Condition:

def priority = "High"

if (priority == "High") {
    println "This issue needs immediate attention!"
} else {
    println "This issue can be resolved later."
}

//Defining a Condition:

def addNumbers(a, b) {
    return a + b
}

println addNumbers(10, 20)

//Reading USer Input Groovy Shell

print "Enter your name: "
def name = System.console().readLine()
println "Hello, $name!"


//Working with Jira REST API

import groovy.json.JsonSlurper

def jiraUrl = "https://your-jira-instance/rest/api/2/issue/JRA-123"
def response = new URL(jiraUrl).text
def json = new JsonSlurper().parseText(response)

println "Issue Summary: ${json.fields.summary}"
