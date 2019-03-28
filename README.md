# spring_boot_demo
- Hello world with spring boot framework

# step 1 : Tools & environment
- Eclipse : https://www.eclipse.org/downloads/
- Jdk 8 : https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
- Spring tool suite (sts) : Eclipse -> Help -> Eclipse arketplace -> STS

# step 2 : Init project
- Eclipse -> File -> New -> Other -> Spring Starter Project
- ArtifactId : App name
- Dependencies : Web [Web Services]

# step 3 : Configuration JSP
- pom.xml : 
    org.apache.tomcat.embed
    javax.servlet
- src/main/resouses/application.properties :
    spring.mvc.view.prefix=/WEB-INF/jsp/
    spring.mvc.view.suffix=.jsp
- src/main/webapp/WEB-INF/jsp : Create jsp templates.

# step 4 : Request mapping
- src/main/java/controllers/MainController.java : use annotation
    @Controller
    class {
        @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
        function {
            return view'
        }
    }
    
