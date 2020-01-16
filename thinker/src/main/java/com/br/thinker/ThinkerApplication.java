package com.br.thinker;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ImportResource(locations = {"classpath:application-rpc.xml"})
@EnableTransactionManagement
@EnableCaching// 开启缓存，需要显示的指定
@EnableApolloConfig
public class ThinkerApplication {

	public static void main(String[] args) {

		SpringApplication.run(ThinkerApplication.class, args);
	}
}
