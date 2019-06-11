package Adapter;

import java.util.Arrays;

public class RectangleClassAdapter extends Rectangle implements Polygon{

    private String id;

    public RectangleClassAdapter(String color){
        super(color);
    }

    @Override
    public void define(double x0, double y0, double x1, double y1) {
        super.setShap(x0, y0,y1 - y0,  x1 - x0);
    }

    @Override
    public double[] getCoordinates() {
        return new double[]{this.getOriginX(), this.getOriginY(), this.getOppositeX(), this.getOppositeY()};
    }

    @Override
    public double getSurface() {
        return super.surface();
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public void test(){
        System.out.println("Class : " + getClass());
        System.out.println("surface : " + getSurface());
        System.out.println("Color : " + getColor());
        System.out.println("Array coordinates " + Arrays.toString(getCoordinates()));
        System.out.println("ID : " + getId());
    }

    public static void main(String[] args) {

        RectangleClassAdapter rectangleClassAdapter = new RectangleClassAdapter("red");
        rectangleClassAdapter.define(4,1, 7, 5);
        rectangleClassAdapter.test();
        rectangleClassAdapter.setId("ousmane");
        rectangleClassAdapter.setColor("blue");
        System.out.println("-----------------------------------");
        rectangleClassAdapter.test();
    }
}
