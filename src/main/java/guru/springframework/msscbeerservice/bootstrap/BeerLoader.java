package guru.springframework.msscbeerservice.bootstrap;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.repositories.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    BeerRepository beerRepository;

    @Autowired
    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loanBeerObject();
    }

    private void loanBeerObject() {
        beerRepository.save(Beer.builder()
                .beerName("Mango Bobs")
                .beerStyle("IPA")
                .quantityToBrew(200)
                .minOnHand(12)
                .upc(33701000001L)
                .price(new BigDecimal("12.95"))
                .build());

        beerRepository.save(Beer.builder()
                .beerName("Galaxy Cat")
                .beerStyle("PALE_ALE")
                .quantityToBrew(200)
                .minOnHand(12)
                .upc(33701000002L)
                .price(new BigDecimal("11.95"))
                .build());

        System.out.println("Loaded Beers:"+ beerRepository.count());
    }
}
