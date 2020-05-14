package com.raman.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerApplication {

	// Here Spring Cloud server helps in getting the Application Properties which we committed in 
	// (application).yml file in (Local) GIT repositiory accessed via REST API. We can easily update 
	// this .yml file, commit, refresh and have all the microservices talk to this Spring cloud 
	// Config Server and get the same application config properties.
	
	// Use this URL to launch this: http://localhost:8888/<file_name_without_extension>/<profile>
	// http://localhost:8888/application/default
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}

}
