package com.book.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.demo.model.BookDetails;
@Repository
public interface bookRepository extends JpaRepository<BookDetails,Integer>{

}
