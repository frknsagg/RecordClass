package com.example.RecordClass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecordClassApplication {

	//Veri aktarma iletim
	//Değişmezlik =>Immutability
	//Kod tekrarını azaltmak ve Okunabilirlik
	// Record oto ctor bulundur.

	public static void main(String[] args) {
		SpringApplication.run(RecordClassApplication.class, args);
		Student student = new Student(1,"Ali","Veli");
		System.out.println(student.firstName);
		System.out.println(student.getFullName(student.firstName, student.lastName));



	}
	public record Student(int id,String firstName,String lastName){
		String getFullName(String firstName,String lastName){
			return firstName + " " + lastName;
		}
	}



}




