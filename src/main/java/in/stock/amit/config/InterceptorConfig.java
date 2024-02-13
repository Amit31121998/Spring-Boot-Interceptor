package in.stock.amit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import in.stock.amit.interceptor.ProductInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer{

	@Autowired
	private ProductInterceptor interceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor);
	}

	
	
}
