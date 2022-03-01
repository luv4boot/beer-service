package com.luv4code.beerservice.events;

import com.luv4code.beerservice.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@RequiredArgsConstructor
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -7978665075289821915L;

    private final BeerDto beerDto;


}
