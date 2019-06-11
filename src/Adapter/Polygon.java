package Adapter;

public interface Polygon {

    public void define(double x0, double y0, double x1, double y1);
    public double[] getCoordinates();
    public double getSurface();
    public void setId(String id);
    public String getId();
    public String getColor();
}
