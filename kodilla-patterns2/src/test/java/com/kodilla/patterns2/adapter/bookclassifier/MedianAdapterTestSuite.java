package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedian() {
        Set<BookA> bookSet = new HashSet<>();
        BookA book1 = new BookA("Roman", "Baśnie i Ballady", 2000, "234dsdsf");
        BookA book2 = new BookA("Zennon", "Baśnie i Ballady2", 2001, "das3dadd");
        BookA book3 = new BookA("Gotfryd", "Baśnie i Ballady3", 2002, "dsfsfwe");
        BookA book4 = new BookA("Genowefa", "Baśnie i Ballady4", 2003, "fdijfids");
        BookA book5 = new BookA("Jadwiga", "Baśnie i Ballady5", 2004, "fdijfids");
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(bookSet);
        Assert.assertEquals(2002, median);
    }
}
