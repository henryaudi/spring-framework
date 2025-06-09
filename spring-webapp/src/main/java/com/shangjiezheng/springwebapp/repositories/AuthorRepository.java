package com.shangjiezheng.springwebapp.repositories;


import com.shangjiezheng.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
