package ryan.padroes_projeto_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadroesProjetoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetoSpringbootApplication.class, args);
	}

}
