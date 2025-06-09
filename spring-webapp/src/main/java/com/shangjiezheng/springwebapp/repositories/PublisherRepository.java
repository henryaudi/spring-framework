package com.shangjiezheng.springwebapp.repositories;

import com.shangjiezheng.springwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
