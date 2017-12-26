package com.kodilla.patterns.builder.bigmac;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum  Sauce {
    saucestandard("Sauce Standard"), sauce1000Inlands("Sauce 1000 Inlands"), sauceBarbecue("Sauce Barbecue");
    final String sauce;
}
