package com.kodilla.good.patterns.challenges.exercise9_2.exapample.processor;

import com.kodilla.good.patterns.challenges.exercise9_2.exapample.rental.InformationService;
import com.kodilla.good.patterns.challenges.exercise9_2.exapample.rental.RentalRepository;
import com.kodilla.good.patterns.challenges.exercise9_2.exapample.rental.RentalService;
import com.kodilla.good.patterns.challenges.exercise9_2.exapample.data.RentRequeset;
import com.kodilla.good.patterns.challenges.exercise9_2.exapample.data.RentalDto;

public class RentalProcessor {
    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;

    public RentalProcessor(final InformationService informationService,
                           final RentalService rentalService,
                           final RentalRepository rentalRepository) {
        this.informationService =  informationService;
        this.rentalService =  rentalService;
        this.rentalRepository = rentalRepository;
    }

    public RentalDto process(final RentRequeset rentRequeset) {
        boolean isRented = rentalService.createRental(rentRequeset.getUser(), rentRequeset.getFrom(), rentRequeset.getTo());
        if (isRented) {
            informationService.inform(rentRequeset.getUser());
            rentalRepository.createRental(rentRequeset.getUser(), rentRequeset.getFrom(), rentRequeset.getTo());
            return new RentalDto(rentRequeset.getUser(), true);
        } else {
            System.out.println("ins NOT Rented");
            return new RentalDto(rentRequeset.getUser(), false);
        }

    }

}
