package com.luv4code.beerservice.events;

import com.luv4code.beerservice.web.model.BeerDto;

public class NewInventoryEvent extends BeerEvent {

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
