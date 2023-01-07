package com.example.dsl;

import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@SpringBootApplication
public class DslApplication {

	public static void main(String[] args) {

		SpringApplication.run(DslApplication.class, args);

	}

}
