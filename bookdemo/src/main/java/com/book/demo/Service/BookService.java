package com.book.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.demo.Repository.bookRepository;
import com.book.demo.model.BookDetails;


import java.util.List;
@Service
public class BookService {
	@Autowired
	bookRepository repo;
	
	public List<BookDetails>getAllBooks()
	{
		List<BookDetails>bookList=repo.findAll();
		return bookList;
	}

	public BookDetails saveBooks(BookDetails s) {
		
		BookDetails obj=repo.save(s);
		return obj;
	}
	public BookDetails updateBooks(BookDetails s) {
		
		BookDetails obj=repo.save(s);
		return obj;
	}
	public void deleteBooks(int bookno)
	{
		repo.deleteById(bookno);
	}
	

}
