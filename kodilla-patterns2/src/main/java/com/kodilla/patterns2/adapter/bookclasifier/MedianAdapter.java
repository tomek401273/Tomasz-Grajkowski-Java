package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<BookA> bookSet) {
        Map<BookSignature, BookB> bookMap = bookSet.stream()
                .collect(Collectors.toMap(
                        bookA -> new BookSignature(bookA.getSignature()),
                        bookA -> new BookB(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear())));
        return medianPublicationYear(bookMap);
    }

    @Override
    public int publicationYearAverage(Set<BookA> bookSet) {
        Map<BookSignature, BookB> bookMap = bookSet.stream()
                .collect(Collectors.toMap(
                        bookA -> new BookSignature(bookA.getSignature()),
                        bookA -> new BookB(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear())
                ));
        return averagePublicationYear(bookMap);
    }
}
