package guru.springframework.msscbeerservice.web.service;


import guru.springframework.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    public BeerDto getBeerById(UUID id);

    public BeerDto saveNewBeer(BeerDto beerDto);

    public void updateBeer(UUID id,BeerDto beerDto);
}
