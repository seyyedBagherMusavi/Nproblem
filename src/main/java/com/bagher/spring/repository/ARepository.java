package com.bagher.spring.repository;


import com.bagher.spring.model.A;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ARepository extends JpaRepository<A, Long> {
    @Override
//    @EntityGraph(attributePaths = {"bSet","cSet","dSet"})
    List<A> findAll();
}
