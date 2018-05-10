package fr.greenwin.voixlibre;

import fr.greenwin.voixlibre.config.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class VoixlibreApplication implements CommandLineRunner {

	@Resource
	StorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(VoixlibreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	    storageService.deleteAll();
		storageService.init();
	}

}
