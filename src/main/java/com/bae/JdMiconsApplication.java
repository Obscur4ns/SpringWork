package com.bae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bae.rest.JDMController;
import com.bae.service.JDMServiceList;

@SpringBootApplication
public class JdMiconsApplication {

	public static void main(String[] args) {
		ApplicationContext beanBag = SpringApplication.run(JdMiconsApplication.class, args);
		JDMController controller = beanBag.getBean(JDMController.class);
		System.out.println(controller);

		JDMServiceList service = beanBag.getBean(JDMServiceList.class);
		System.out.println(service);
	}

}
