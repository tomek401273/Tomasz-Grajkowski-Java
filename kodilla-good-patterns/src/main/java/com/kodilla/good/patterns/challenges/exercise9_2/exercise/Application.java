package com.kodilla.good.patterns.challenges.exercise9_2.exercise;

import com.kodilla.good.patterns.challenges.exercise9_2.exercise.buying.BuyingRepository;
import com.kodilla.good.patterns.challenges.exercise9_2.exercise.buying.computer.ComputerAvailableService;
import com.kodilla.good.patterns.challenges.exercise9_2.exercise.buying.computer.ComputerButingRepository;
import com.kodilla.good.patterns.challenges.exercise9_2.exercise.buying.computer.MailService;
import com.kodilla.good.patterns.challenges.exercise9_2.exercise.data.BuyRequest;
import com.kodilla.good.patterns.challenges.exercise9_2.exercise.data.BuyRequestRetriever;
import com.kodilla.good.patterns.challenges.exercise9_2.exercise.processor.BuyingProcessor;

public class Application {

    public static void main(String[] args) {
        BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();
        BuyRequest buyRequest = buyRequestRetriever.retrive();

        BuyingProcessor buyingProcessor = new BuyingProcessor(
                 new ComputerAvailableService(), new ComputerButingRepository(), new MailService());
        buyingProcessor.process(buyRequest);

    }
}