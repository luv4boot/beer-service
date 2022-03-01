package com.luv4code.beerservice.events;

import com.luv4code.beerservice.web.model.BeerDto;

public class BrewBeerEvent extends BeerEvent{

    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
