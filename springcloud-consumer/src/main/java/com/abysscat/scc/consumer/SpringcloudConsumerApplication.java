package com.abysscat.scc.consumer;

import com.abysscat.scc.contract.HelloApiServiceClient;
import com.abysscat.scc.contract.UserApiServiceClient;
import com.abysscat.springcloudapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients("com.abysscat.scc")
public class SpringcloudConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConsumerApplication.class, args);
	}

	@Autowired
	HelloApiServiceClient helloService;

	@Autowired
	UserApiServiceClient userService;

	@Autowired
	ApplicationContext context;

	@Bean
	ApplicationRunner runner() {
		return args -> {
			System.out.println("helloService-consumer started");

			for (int i = 0; i < 10; i++) {
				test();
			}

		};
	}

	private void test() {
		String hello = helloService.hi();
		System.out.println("==> helloService.hello : " + hello);

		hello = helloService.a("abysscat");
		System.out.println("==> helloService.a : " + hello);

		hello = helloService.b("21212");
		System.out.println("==> helloService.b : " + hello);

		hello = helloService.c("abysscat");
		System.out.println("==> helloService.c : " + hello);

		User user123 = userService.findById(123);
		System.out.println("==> helloService.list : " + user123);
	}

}
