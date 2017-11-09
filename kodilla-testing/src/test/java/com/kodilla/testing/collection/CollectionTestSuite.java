package com.kodilla.testing.collection;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin ");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite before");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> t = new ArrayList<>();
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
        t.add(6);


        ArrayList<Integer> t2 = oddNumbersExterminator.exterminate(t);

        ArrayList<Integer> t3 = new ArrayList<>();
        t3.add(2);
        t3.add(4);
        t3.add(6);

        Assert.assertArrayEquals(t3.toArray(), t2.toArray());

    }


}


//    testOddNumbersExterminatorEmptyList (sprawdzi czy klasa zachowuje się poprawnie gdy lista jest pusta)
//    testOddNumbersExterminatorNormalList (sprawdzi czy klasa zachowuje się poprawnie gdy lista zawiera liczby parzyste i nieparzyste)