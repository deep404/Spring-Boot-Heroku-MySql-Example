package com.javatpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringHerokuMysqlExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHerokuMysqlExampleApplication.class, args);
	}
}

@Component
class DemoCommandLineRunner implements CommandLineRunner {
	@Autowired
	private BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {
		bookRepository.save(new Book(100, "Ziua razbunarii", "John Grisham", 5, "Istorie"));
		bookRepository.save(new Book(101, "Jamilia Cuisine", "Geanina Staicu-Avram", 8, "Gastronomie"));
		bookRepository.save(new Book(102, "Harrison - Manual de medicina", "Dan L.Longo", 45, "Medicina"));

		//bookRepository.deleteById(101);
	}
}
