package priv.alvin.study.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import priv.alvin.study.spring.config.AppConfig;
import priv.alvin.study.spring.service.AService;

public class Application {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		AService bean = ac.getBean(AService.class);

		System.out.println(bean);
	}

}
