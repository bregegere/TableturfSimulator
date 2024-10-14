package com.brg.tableturfbackend.repository;

import com.brg.tableturfbackend.model.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, String> {
}
