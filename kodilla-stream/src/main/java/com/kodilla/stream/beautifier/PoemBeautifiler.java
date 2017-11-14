package com.kodilla.stream.beautifier;

public class PoemBeautifiler {
    public void beautify(String text, PoemDecorator poemDecorator) {
        String beautified = poemDecorator.decorate(text);
        System.out.println(beautified);
    }
}
