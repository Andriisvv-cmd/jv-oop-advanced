package core.basesyntax;

public abstract class Figure implements Drawble {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();

    @Override
    public abstract void draw();

    public String getColor() {
        return color;
    }
}
