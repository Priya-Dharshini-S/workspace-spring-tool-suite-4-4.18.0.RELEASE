package com.book.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.demo.Service.BookService;
import com.book.demo.model.BookDetails;

@RestController
public class BookController {
@Autowired
BookService bs;
@GetMapping(value="/fetchBooks")

public List<BookDetails>getAllBooks()
{
	List<BookDetails>bookList=bs.getAllBooks();
	return bookList;
}
//http://localhost:8080/saveStudent

@PostMapping(value="/saveBooks")
public BookDetails saveBooks(@RequestBody BookDetails s)
{
	return bs.saveBooks(s);
}
@PutMapping(value="/updateBooks")
public BookDetails updateBooks(@RequestBody BookDetails s)
{
	return bs.saveBooks(s);
}
@DeleteMapping(value="/deleteBooks/{bookno}")
public void deleteSBooks(@PathVariable("bookno")int bookno)
{
	 bs.deleteBooks(bookno);
}
}