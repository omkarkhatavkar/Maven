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



  
    






