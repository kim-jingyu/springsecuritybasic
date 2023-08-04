package com.eazybytes.repository;

import com.eazybytes.model.Cards;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardsRepository extends JpaRepository<Cards, Long> {
    List<Cards> findByCustomerId(int customerId);
}
