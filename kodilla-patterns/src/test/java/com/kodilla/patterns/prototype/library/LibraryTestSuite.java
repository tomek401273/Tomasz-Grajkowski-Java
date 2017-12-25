package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBook() throws CloneNotSupportedException {
        //given
        Library lib = new Library("myLib");

        IntStream.iterate(1, n -> n + 1)
                .limit(19)
                .forEach(n -> lib.getBooks().add(new Book("Title " + n, "Author ", LocalDate.of(1999+2*n, 11, 1+n))));
        Library shallowCloneLibrary = null;
        Book book = new Book("Tilte20","Author",LocalDate.now());
        lib.getBooks().add(book);
        shallowCloneLibrary= lib.shallowCopy();
        shallowCloneLibrary.setName("Project number 2");

        Library deepCloneLibrary =null;

        deepCloneLibrary = lib.deepCopy();
        deepCloneLibrary.setName("Project 3");

        //When
        lib.getBooks().remove(book);
        //Then
        System.out.println("lib: " + lib.getBooks());
        System.out.println("shallowClone: "+shallowCloneLibrary.getBooks());
        System.out.println("deepClone: "+deepCloneLibrary.getBooks());
        Assert.assertEquals(19,lib.getBooks().size());
        Assert.assertEquals(19,shallowCloneLibrary.getBooks().size());
        Assert.assertEquals(20,deepCloneLibrary.getBooks().size());
        Assert.assertEquals(lib.getBooks(),shallowCloneLibrary.getBooks());
        Assert.assertNotEquals(deepCloneLibrary.getBooks(),lib.getBooks());
    }
}
