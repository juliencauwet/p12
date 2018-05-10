package fr.greenwin.voixlibre;

import fr.greenwin.voixlibre.config.StorageProperties;
import fr.greenwin.voixlibre.config.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class VoixlibreApplication{

	public static void main(String[] args) {
		SpringApplication.run(VoixlibreApplication.class, args);
	}

    @Bean
    CommandLineRunner init(StorageService storageService) {
        return (args) -> {
            storageService.deleteAll();
            storageService.init();
        };
    }

}
