package com.book.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.demo.model.BookLoginModel;
@Repository
public interface BookLoginRepository extends JpaRepository<BookLoginModel, Integer>  {

	
	BookLoginModel findByUsername(String username);
}
