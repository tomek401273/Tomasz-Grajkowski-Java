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
    public static void beforeClass() {
        System.out.println("Test suite begin!!!");
    }

    @AfterClass
    public static void afterClass() {
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
        double figure1 = 4;
        double figure2 = shapeCollector.showFigure(0);

        Assert.assertEquals(figure1, figure2, 0);
    }

    @Test
    public void testShowCircle() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle1 = new Circle("Circle1", 2);
        Circle circle2 = new Circle("Circle2", 2);
        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(circle2);
        double figure1 = 12.56;
        double figure2 = shapeCollector.showFigure(0);

        Assert.assertEquals(figure1, figure2, 0);
    }

    @Test
    public void testShowTriangle() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle("Triangle1", 2, 3);
        Triangle triangle2 = new Triangle("Triangle2", 3, 9);

        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(triangle2);
        double figure1 = 3;
        double figure2 = shapeCollector.showFigure(0);

        Assert.assertEquals(figure1, figure2, 0);
    }


}
