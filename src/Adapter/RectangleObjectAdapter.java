package Adapter;

import java.util.Arrays;

public class RectangleObjectAdapter implements Polygon{

    private Rectangle rectangle;
    private String ID;

    public RectangleObjectAdapter(Rectangle rectangle){
        this.rectangle = rectangle;
    }

    @Override
    public void define(double x0, double y0, double x1, double y1) {
        this.rectangle.setShap(x0, y0, y1 - y0, x1 - x0);
    }

    @Override
    public double[] getCoordinates() {
        return new double[]{this.rectangle.getOriginX(), this.rectangle.getOriginY(), this.rectangle.getOppositeX(), this.rectangle.getOppositeY()};
    }

    @Override
    public double getSurface() {
        return this.rectangle.surface();
    }

    @Override
    public void setId(String id) {
        this.ID = id;
    }

    @Override
    public String getId() {
        return this.ID;
    }

    @Override
    public String getColor() {
        return this.rectangle.getColor();
    }

    public void test(){
        System.out.println("Class : " + getClass());
        System.out.println("surface : " + getSurface());
        System.out.println("Color : " + getColor());
        System.out.println("Array coordinates " + Arrays.toString(getCoordinates()));
        System.out.println("ID : " + getId());
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("red");
        RectangleObjectAdapter rectangleObjectAdapter = new RectangleObjectAdapter(rectangle);
        rectangleObjectAdapter.define(4,1, 7, 5);
        rectangleObjectAdapter.test();
        rectangleObjectAdapter.setId("ousmane");
        rectangle.setColor("blue");
        System.out.println("-----------------------------------");
        rectangleObjectAdapter.test();
    }
}
