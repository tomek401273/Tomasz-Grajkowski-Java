package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    @Before
    public void before() {
        System.out.println("Test case begin !!!");
    }

    @After
    public void after() {
        System.out.println("Test case after!!!");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Test suite begin!!!");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Test suite end!!!");
    }

    @Test
    public void testAddFiggure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square squere = new Square("Squere1", 2);
        shapeCollector.addFigure(squere);

        int size = shapeCollector.schapelist.size();
        Assert.assertEquals(1, size);
    }

    @Test
    public void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square squere1 = new Square("Squere1", 2);
        Square squere2 = new Square("Squere1", 2);
        shapeCollector.addFigure(squere1);
        shapeCollector.addFigure(squere2);
        shapeCollector.removeFigure(squere1);

        int size = shapeCollector.schapelist.size();
        Assert.assertEquals(1, size);
    }

    @Test
    public void testGetFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square squere1 = new Square("Squere1", 2);
        Square squere2 = new Square("Squere1", 2);
        shapeCollector.addFigure(squere1);
        shapeCollector.addFigure(squere2);
        String shaapeName1 = "Squere1";
        String shapeName2 = shapeCollector.getFigure(0).getShapeName();

        Assert.assertEquals(shaapeName1, shapeName2);
    }

    @Test
    public void testShowFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square squere1 = new Square("Squere1", 2);
        Square squere2 = new Square("Squere1", 2);
        shapeCollector.addFigure(squere1);
        shapeCollector.addFigure(squere2);
        int figure1 = 10;
        int figure2 =shapeCollector.showFigure().getField();

        Assert.assertEquals(figure1, figure2);
    }

}
