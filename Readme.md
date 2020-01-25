1. Install Tomcat :

For Mac, brew install tomcat.
To start the server - catalina start
To stop the server - catalina stop
Web console for tomcat - http://localhost:8080

2. Register and configure the servlet in Tomcat.
run mvn clean install to generate the class files.

cd /usr/local/Cellar/tomcat/x.x.x/libexec/webapps/
mkdir myexample
cd myexample
mkdir WEB-INF
cd WEB-INF
copy the web.xml file here (from src/main/WEB-INF/)
mkdir classes
cd classes
copy the PingServlet.class file here (from target/classes/)

stop and start catalina
hit http://localhost:8080/myexample/ping
