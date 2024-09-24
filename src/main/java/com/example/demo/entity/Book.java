package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="book")
@Data
public class Book {
	@Id
	private int no;
	private String title;
	private int price;
	private int qty;
	private String publisher;
	
}
