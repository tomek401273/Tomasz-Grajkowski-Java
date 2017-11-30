package com.kodilla.good.patterns.challenges.exercise9_2.exapample;

import com.kodilla.good.patterns.challenges.exercise9_2.exapample.rental.carRental.CarRentalRepository;
import com.kodilla.good.patterns.challenges.exercise9_2.exapample.rental.carRental.CarRentalService;
import com.kodilla.good.patterns.challenges.exercise9_2.exapample.rental.carRental.MailService;
import com.kodilla.good.patterns.challenges.exercise9_2.exapample.processor.RentalProcessor;
import com.kodilla.good.patterns.challenges.exercise9_2.exapample.data.RentRequeset;
import com.kodilla.good.patterns.challenges.exercise9_2.exapample.data.RentalRequestRetriver;

public class Application {
    public static void main(String[] args) {
      RentalRequestRetriver rentalRequestRetriver = new RentalRequestRetriver();
      RentRequeset rentRequeset = rentalRequestRetriver.retrive();

      RentalProcessor rentalProcessor = new RentalProcessor(
              new MailService(), new CarRentalService(), new CarRentalRepository());
      rentalProcessor.process(rentRequeset);
    }
}
