
Here are Steps which I used to Integrate Jenkins-Selenium-Maven-Github.

# Prerequistes:

JDK (1.6), Maven (3.1.0), Git(1.8.3),Eclipse IDE ,Jenkins War file.

# Installation Steps to Start

  1) Install Java 

	* All Steps are Written Here http://www3.ntu.edu.sg/home/ehchua/programming/howto/JDK_Howto.html

  2) Install Maven 

	* All Steps are written Here http://www.mkyong.com/maven/how-to-install-maven-in-windows/

  3) Install Git 

  	* All Steps are written here http://git-scm.com/book/en/Getting-Started-Installing-Git

  4) Get Download Jenkins war file from http://jenkins-ci.org/


# You can create your own mavionize project using below Steps or You can take git clone my project too.
   or find the link http://www.mkyong.com/maven/how-to-create-a-project-with-maven-template/

  1) Create Directory my c:\>mkdir project_name

  2) Go into directory c:\>cd project_name
  
  3) Create an Maven Instance by command c:\project_name>mvn archetype:generate

  4)  Define value for groupId: : com.project
      Define value for artifactId: : project_name
      Define value for version:  1.0-SNAPSHOT: : 1.0
      Define value for package:  com.mkyong: : testing

  5) Maven Project is created but to import that project in Eclipse run below command

	c:\project_name>cd project_name 

	c:\project_name\project_name>mvn eclipse:eclipse

  6) This will add .classpath file in project.Now import that project in Eclipse IDE



  
    






