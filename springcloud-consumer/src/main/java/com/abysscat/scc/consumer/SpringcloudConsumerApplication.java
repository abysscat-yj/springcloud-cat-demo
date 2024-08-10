package com.abysscat.scc.consumer;

import com.abysscat.scc.contract.HelloServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients("com.abysscat.scc")
public class SpringcloudConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConsumerApplication.class, args);
	}

	@Autowired
	HelloServiceClient helloService;

	@Bean
	ApplicationRunner runner() {
		return args -> {
			System.out.println("helloService-consumer started");

			String hello = helloService.hello();
			System.out.println("==> helloService.hello : " + hello);

			hello = helloService.a("cat");
			System.out.println("==> helloService.a : " + hello);

			hello = helloService.b("cattt");
			System.out.println("==> helloService.b : " + hello);

			hello = helloService.find("abysscat");
			System.out.println("==> helloService.find : " + hello);

		};
	}

}
