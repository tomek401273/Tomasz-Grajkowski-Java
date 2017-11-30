package com.kodilla.good.patterns.challenges.exercise9_2.exercise.buying.computer;

import com.kodilla.good.patterns.challenges.exercise9_2.exercise.buying.InformationService;
import com.kodilla.good.patterns.challenges.exercise9_2.exercise.data.Buyer;

public class MailService implements InformationService {
    @Override
    public void inform(Buyer buyer) {
        System.out.println("Mail send to buyer: "+buyer.getName()+" "+buyer.getSurname());
    }
}
