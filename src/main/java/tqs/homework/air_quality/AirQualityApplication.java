package tqs.homework.air_quality;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AirQualityApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirQualityApplication.class, args);
	}

}
