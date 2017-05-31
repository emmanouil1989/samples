Camel - Swagger
	http://localhost:8080/camel/api-doc
	
Camel - Rest
	http://localhost:8080/camel/chat/hello

Camel - ActiveMQ
	file://C://temp//cameltest2?move=.done
	activemq start
		http://localhost:8161/admin/
		
Spring Boot - Actuator
	http://localhost:8080/health
	http://localhost:8080/metrics
	etc
	
Spring Boot - Security
	withUser("user").password("password").roles("USER","ACTUATOR");
	http://localhost:8080/login
	
Spring Boot - MVC
	http://localhost:8080
	http://localhost:8080/hello
	http://localhost:8080/home
	
Spring JPA Data with REST
	http://localhost:8080/people
	https://spring.io/guides/gs/accessing-data-rest/