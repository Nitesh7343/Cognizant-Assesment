package com.cognizant.spring_learn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication implements CommandLineRunner {

	public void run(String... args) throws Exception {
		displayDate();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
	}

	public void displayDate() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat",SimpleDateFormat.class);

		Date date = format.parse("31/12/2026");
		System.out.println(date);
	}

}
