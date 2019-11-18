package restservice.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class application {

		public static void main(String[] args) {
//			SpringApplication.run(application.class, args);
		
		ConfigurableApplicationContext context = 	SpringApplication.run(application.class, args);
		
		AppConfiguration ap = context.getBean(AppConfiguration.class);
		ap.display();
		
		
		}
}
