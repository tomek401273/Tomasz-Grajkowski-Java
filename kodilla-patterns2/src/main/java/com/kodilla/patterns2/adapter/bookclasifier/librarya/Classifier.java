package com.kodilla.patterns2.adapter.bookclasifier.librarya;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.Map;
import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<BookA> bookSet);
    int publicationYearAverage(Set<BookA> bookSet);
}
