<h3> Here are Steps which I used to <b>Integrate Jenkins-Selenium-Maven-Github</b>.</h3>

<b> Prerequistes: </b>

JDK (1.6), 

Maven (3.1.0), 

Git Bash(1.8.3),

Eclipse IDE ,

Jenkins War file (jenkins.war).

<b> Installation Steps to Start </b>

  1) <b>Install Java </b>
  
  All steps are specified in the following link : http://www3.ntu.edu.sg/home/ehchua/programming/howto/JDK_Howto.html

  2) <b>Install Maven </b>
  
  All steps are specified in the following link : http://www.mkyong.com/maven/how-to-install-maven-in-windows/

  3) <b>Install Git </b>

  All steps are specified in the following link : http://git-scm.com/book/en/Getting-Started-Installing-Git"

  4) Download the <b>latest Jenkins war file </b>from http://jenkins-ci.org/


<b>You can create your own mavenize project using below steps or You can take git clone my project too.
   or find the link http://www.mkyong.com/maven/how-to-create-a-project-with-maven-template/ </b>

  1) Create Directory C:\ > mkdir project_name

  2) Go into directory C:\ > cd project_name
  
  3) Create a Maven Instance by command C:\project_name>mvn archetype:generate

  4)  
      Define value for groupId : <b>com.project</b><br>
      Define value for artifactId : <b>project_name</b><br>
      Define value for version : <b>1.0-SNAPSHOT: : 1.0</b><br>
      Define value for package : <b>com.mkyong: : testing</b><br>

  5) Maven Project is now created.To import that project in Eclipse run following command : 

	C:\project_name>cd project_name 

	C:\project_name\project_name>mvn eclipse:eclipse

  6) This will add .classpath file in project.Now import that project in Eclipse IDE
  
  7) Set path for .m2 variable in eclipse (http://www.mkyong.com/maven/how-to-configure-m2_repo-variable-in-eclipse-ide/)link for details 
  
Now you are doen with Maven Project. Now move on Jenkins Settup as below.

  1) Download Jenkins war file from http://jenkins-ci.org/
  
  2) Run that war file as standalone server as C:\>java -jar jenkins.war (as I save that war file in C drive )
  
  3) Jenkins up will be running at default http://localhost:8080/ url
  
  4) Install GitHub plugin from navigating from Jenkins->Manage Jenkins->Manage Plugins
  
  5) Now navigate to Jenkins->Configure System and Do setting for maven as Install automatically with variable name mention as in Enviroment Variable.(like M2_Repo in my case) 
 
  6) Apply and Save all setting made in configuration.
  
We all are done with Jenkins Setup.Now We look into Jenkins job

  1) Create New job with click (Build a maven2/3 project) option.
  
  2) In Source Code Management Check git option
  
  3) Provide your github repository URL where you have hosted your project.
  
  4) give branch name for Branches to build (i.e.master)
  
  5) In Build section give relative path for pom.xml from repo name present in github
  
  6) Give goal as test to run the project
  
  7) Now apply the changes, save the settings and build the project.
  
Hope this will you to build Jenkins with Selenium.This not covers selenium grid integration with Jenkins. May be in next version I will add it
	

  
    






