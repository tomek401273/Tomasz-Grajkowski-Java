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
        // Given
        Set<BookA> bookSet = new HashSet<>();
        BookA book1 = new BookA("Roman", "Baśnie i Ballady", 2000, "234dsdsf");
        BookA book2 = new BookA("Zennon", "Baśnie i Ballady2", 2001, "das3dadd");
        BookA book3 = new BookA("Gotfryd", "Baśnie i Ballady3", 2002, "dsfsfwe");
        BookA book4 = new BookA("Genowefa", "Baśnie i Ballady4", 2003, "fdijfids");
        BookA book6 = new BookA("Jadwiga", "Baśnie i Ballady5", 2004, "fdijfids");
        BookA book7 = new BookA("Jadwiga", "Baśnie i Ballady5", 2010, "fdijfids");
        BookA book8 = new BookA("Jadwiga", "Baśnie i Ballady5", 2011, "fdijfids");
        BookA book9 = new BookA("Jadwiga", "Baśnie i Ballady5", 2013, "fdijfids");
        BookA book10 = new BookA("Jadwiga", "Baśnie i Ballady5", 2018, "fdijfids");
        BookA book11 = new BookA("Jadwiga", "Baśnie i Ballady5", 1999, "fdijfids");
        BookA book12 = new BookA("Jadwiga", "Baśnie i Ballady5", 1999, "fdijfids");
        BookA book13 = new BookA("Jadwiga", "Baśnie i Ballady5", 2000, "fdijfids");
        BookA book14 = new BookA("Jadwiga", "Baśnie i Ballady5", 2010, "fdijfids");
        BookA book5 = new BookA("Jadwiga", "Baśnie i Ballady5", 2011, "fdijfids");

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);
        bookSet.add(book7);
        bookSet.add(book8);
        bookSet.add(book9);
        bookSet.add(book10);
        bookSet.add(book11);
        bookSet.add(book12);
        bookSet.add(book13);
        bookSet.add(book14);

        // When
        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(bookSet);
        int average = medianAdapter.publicationYearAverage(bookSet);
        // Then
        Assert.assertEquals(2004, median);
        Assert.assertEquals(2005, average);
    }
}
