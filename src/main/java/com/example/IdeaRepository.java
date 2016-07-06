package com.example;

import java.math.BigInteger;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(exported = true, path = "idea")
//@CrossOrigin(origins = "http://localhost:5000")
public interface IdeaRepository extends PagingAndSortingRepository<Idea, BigInteger>{

}
