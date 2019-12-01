package hu.nemethkmila.beadando;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.nemethkmila.beadando.controllers.JpaKonyvRepo;

@SpringBootApplication
@RestController
@EnableJpaRepositories("hu.nemethkmila.beadando") 
@EntityScan("hu.nemethkmila.beadando")
public class BeadandoApplication {

	@Autowired
	private JpaKonyvRepo repository;
	
	public static void main(String[] args) {
		SpringApplication.run(BeadandoApplication.class, args);
	}
}
