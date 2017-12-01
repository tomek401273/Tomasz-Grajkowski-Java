package com.kodilla.good.patterns.challenges.exercise9_2.exercise.processor;

import com.kodilla.good.patterns.challenges.exercise9_2.exercise.buying.AvailableService;
import com.kodilla.good.patterns.challenges.exercise9_2.exercise.buying.BuyingRepository;
import com.kodilla.good.patterns.challenges.exercise9_2.exercise.buying.InformationService;
import com.kodilla.good.patterns.challenges.exercise9_2.exercise.data.BoughtDto;
import com.kodilla.good.patterns.challenges.exercise9_2.exercise.data.BuyRequest;

public class BuyingProcessor {
    private AvailableService availableService;
    private BuyingRepository buyingRepository;
    private InformationService informationService;

    public BuyingProcessor(final AvailableService availableService,
                           final BuyingRepository buyingRepository,
                           final InformationService informationService) {
        this.availableService = availableService;
        this.buyingRepository = buyingRepository;
        this.informationService = informationService;
    }

    public BoughtDto process(final BuyRequest buyRequest){
        boolean isBought = availableService.createTransaction(buyRequest.getBuyer(),buyRequest.getTransactionDate(), buyRequest.getPrice());
        if(isBought) {
            informationService.inform(buyRequest.getBuyer());
            buyingRepository.createSale(buyRequest.getBuyer(), buyRequest.getTransactionDate(), buyRequest.getPrice());
            return new BoughtDto(buyRequest.getBuyer(), true);
        } else {
            return new BoughtDto(buyRequest.getBuyer(), false);
        }
    }

}
