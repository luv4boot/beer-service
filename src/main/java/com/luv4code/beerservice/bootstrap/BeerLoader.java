package com.luv4code.beerservice.bootstrap;

import com.luv4code.beerservice.domain.Beer;
import com.luv4code.beerservice.repositories.BeerRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@AllArgsConstructor
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(
                    Beer.builder()
                            .beerName("Mongo Bobs")
                            .beerStyle("IPA")
                            .quantityToBrew(200)
                            .minOnHand(12)
                            .upc(33401000001L)
                            .price(new BigDecimal("12.95"))
                            .build());
            beerRepository.save(
                    Beer.builder()
                            .beerName("Galaxy Cat")
                            .beerStyle("PALE_ALE")
                            .quantityToBrew(200)
                            .minOnHand(12)
                            .upc(33401000002L)
                            .price(new BigDecimal("11.95"))
                            .build());
        }

        System.out.println("Loaded Beers: " + beerRepository.count());
    }
}
