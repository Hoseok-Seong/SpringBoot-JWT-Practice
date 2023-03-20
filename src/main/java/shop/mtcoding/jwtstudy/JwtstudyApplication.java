package shop.mtcoding.jwtstudy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import shop.mtcoding.jwtstudy.model.User;
import shop.mtcoding.jwtstudy.model.UserRepository;

@SpringBootApplication
public class JwtstudyApplication {

	// 스프링이 UserRepository가 ioc에 있으면 자동 주입해준다
	@Bean
	CommandLineRunner initDatabase(UserRepository userRepository) {
		return (args) -> {
			userRepository
					.save(User.builder()
							.username("ssar")
							.password("1234")
							.email("ssar@nate.com")
							.role("user").build());
			userRepository
					.save(User.builder()
							.username("admin")
							.password("1234")
							.email("admin@nate.com")
							.role("admin").build());
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(JwtstudyApplication.class, args);
	}

}
