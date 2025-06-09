package com.shangjiezheng.springwebapp.services;

import com.shangjiezheng.springwebapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();

}
