package com.therealdanvega.repository;

import com.therealdanvega.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author fatu
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
