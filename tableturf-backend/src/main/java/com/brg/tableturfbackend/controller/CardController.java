package com.brg.tableturfbackend.controller;

import com.brg.tableturfbackend.model.Card;
import com.brg.tableturfbackend.model.MapSquare;
import com.brg.tableturfbackend.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path="/card")
public class CardController {
    @Autowired
    private CardRepository cardRepository;

    @PostMapping(path="/add")
    public void addCard(@RequestParam String name) {
        Card newCard = new Card();
        newCard.setName(name);
        newCard.setSpecialCost(0);
        newCard.setPattern(new MapSquare[][]{});
        System.out.println("LOG: Card \'" + name + "\' added");
    }

}
