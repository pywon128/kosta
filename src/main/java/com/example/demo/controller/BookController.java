package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/book/insert")
	public void insertForm() {
		
	}
	
	@PatchMapping("/book/insert")
	public String insertSubmit(Book book) {
		
		bookService.insert(book);
		
		return "redirect:/book/list";
	}
	
	@GetMapping("/book/list")
	public void list(Model model) {
		model.addAttribute("list", bookService.findAll());
	}
}
