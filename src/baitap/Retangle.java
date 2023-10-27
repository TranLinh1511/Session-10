package baitap;

public class Retangle extends Shape{
    private double width;
    private double height;

    public Retangle() {
    }

    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Retangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea() {
        return height * width;
    }
}
