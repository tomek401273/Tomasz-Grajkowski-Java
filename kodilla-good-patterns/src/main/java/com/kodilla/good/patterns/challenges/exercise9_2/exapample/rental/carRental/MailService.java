package com.kodilla.good.patterns.challenges.exercise9_2.exapample.rental.carRental;

import com.kodilla.good.patterns.challenges.exercise9_2.exapample.data.User;
import com.kodilla.good.patterns.challenges.exercise9_2.exapample.rental.InformationService;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Mail send to user: "+user.getName()+" "+user.getSurname());
    }
}
