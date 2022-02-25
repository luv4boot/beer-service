package com.luv4code.beerservice.web.mapper;

import com.luv4code.beerservice.domain.Beer;
import com.luv4code.beerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}