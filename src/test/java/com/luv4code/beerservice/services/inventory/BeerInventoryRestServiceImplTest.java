package com.luv4code.beerservice.services.inventory;

import com.luv4code.beerservice.bootstrap.BeerLoader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Disabled
@SpringBootTest
class BeerInventoryRestServiceImplTest {

    @Autowired
    BeerInventoryService beerInventoryService;

    @BeforeEach
    void setUp() {

    }

    @Test
    void getOnHandInventory() {
        Integer quantityOnHand = beerInventoryService.getOnHandInventory(BeerLoader.BEER_1_UUID);
        System.out.println("quantityOnHand = " + quantityOnHand);
    }
}