package JWT;

import JWT.filters.AuthenticationFilter;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);
	}

	FilterRegistrationBean<AuthenticationFilter> authenticationFilter() {
		FilterRegistrationBean<AuthenticationFilter> regbean = new FilterRegistrationBean<AuthenticationFilter>();
		regbean.setFilter(new AuthenticationFilter());
		regbean.addUrlPatterns("/api/*");
		return regbean;
	}

//	@Bean
//	OpenAPI customAPI()

}
