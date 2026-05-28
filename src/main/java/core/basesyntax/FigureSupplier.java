package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int Number_Figures = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(Number_Figures);
        String color = colorSupplier.getRandomColor();
        double side = random.nextInt(50);
        double height = random.nextInt(50);
        double width = random.nextInt(50);
        double firstLeg = random.nextInt(50);
        double secondLeg = random.nextInt(50);
        double radius = random.nextInt(50);
        double base1 = random.nextInt(50);
        double base2 = random.nextInt(50);

        switch (figureNumber) {
            case 0 : return new Square(color, side);
            case 1 : return new Rectangle(color, height, width);
            case 2 : return new RightTriangle(color, firstLeg, secondLeg);
            case 3 : return new Circle(color, radius);
            case 4 : return new IsoscelesTrapezoid(color, base1, base2, height);
            default : return new IsoscelesTrapezoid(color, base1, base2, height);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
