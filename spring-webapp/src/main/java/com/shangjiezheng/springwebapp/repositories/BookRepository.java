package com.shangjiezheng.springwebapp.repositories;

import com.shangjiezheng.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>{

}
