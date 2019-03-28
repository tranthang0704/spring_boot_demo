# spring_boot_demo
- Hello world with spring boot framework

# Step 1 : Tools & environment
- Eclipse : https://www.eclipse.org/downloads/
- Jdk 8 : https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
- Spring tool suite (sts) : Eclipse -> Help -> Eclipse arketplace -> STS

# Step 2 : Init project
- Eclipse -> File -> New -> Other -> Spring Starter Project
- ArtifactId : App name
- Dependencies : Web [Web Services]

# Step 3 : Configuration JSP
1. pom.xml : 
- org.apache.tomcat.embed
- javax.servlet
2. src/main/resouses/application.properties :
- sprring.mvc.view.prefix=/WEB-INF/jsp/
- spring.mvc.view.suffix=.jsp
3. src/main/webapp/WEB-INF/jsp : Create jsp templates.

# Step 4 : Request mapping
src/main/java/controllers/MainController.java : use annotation
- class : @Controller
- function : @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
- return view.jsp
