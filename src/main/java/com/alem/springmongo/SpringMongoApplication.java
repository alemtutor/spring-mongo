package com.alem.springmongo;

import com.alem.springmongo.entity.*;
import com.alem.springmongo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class SpringMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoApplication.class, args);

	}
	@Bean
	CommandLineRunner runner(StudentRepository repository){
		String email = "daniel@gmail.com";
		return args->{
			Student student = new Student(
					"Daniel",
					"Woubshet",
					Gender.Male,
					email,
					new Address("647 Garden walk dr.","Stone Mountain","30083",State.GA, Country.Ethiopia),
					LocalDateTime.now()

			);
			repository.findStudentByEmail(email).ifPresentOrElse(
					s->{
				System.out.printf(s.getEmail() + " email name is already taken");
			},()->{
						repository.insert(student);
						System.out.println(student + " is successfully inserted");
					});

		};
	}
}
