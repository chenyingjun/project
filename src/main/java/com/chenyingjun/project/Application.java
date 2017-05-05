package com.chenyingjun.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author chenyingjun
 * @since 1.0
 * @version 2017年3月20日 chenyingjun
 */
@SpringBootApplication
//@EnableSwagger2
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

/*	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage("com.chenyingjun.project")).paths(PathSelectors.any()).build();
	}

	private ApiInfo apiInfo() {
		Contact contact=new Contact("comtop",
				"","");
		return new ApiInfoBuilder()
				.title("Spring Boot中使用Swagger2")
				.description("Hello Swagger2")
				//.termsOfServiceUrl("http://www.jianshu.com/u/f192766abeab")
				//.contact("作者名")
				.contact(contact)
				.version("1.0")
				.build();
//		return new ApiInfoBuilder().title("springBoot1.4.4 RESTful API").description("").termsOfServiceUrl("").version("1.0").build();
	}*/
}
