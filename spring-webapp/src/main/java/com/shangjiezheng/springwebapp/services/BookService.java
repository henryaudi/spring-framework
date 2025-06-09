package com.shangjiezheng.springwebapp.services;

import com.shangjiezheng.springwebapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
