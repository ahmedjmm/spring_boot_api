package com.example.cashcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CashcardApplication {

	public static void main(String[] args) {

		SpringApplication.run(CashcardApplication.class, args);

//		CashCardController cashCardController = new CashCardController();
//		ResponseEntity<CashCard> cashCard = cashCardController.findById(99L);
//
//		System.out.println(cashCard.getBody());
	}
}
