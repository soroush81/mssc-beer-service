package guru.springframework.msscbeerservice.web.service;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import guru.springframework.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{

    public BeerServiceImpl() {
    }

    @Override
    public BeerDto getBeerById(UUID id) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .bearName("GalaxyCat")
                .bearStyle(BeerStyleEnum.ALE)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .bearName("GalaxyCat")
                .bearStyle(BeerStyleEnum.ALE)
                .build();
    }

    @Override
    public void updateBeer(UUID id, BeerDto beerDto) {
        //todo impl
    }
}
