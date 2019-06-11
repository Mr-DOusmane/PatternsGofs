package Adapter;

public class Rectangle {


    private double x0, y0, height, width;
    private String color;

    public Rectangle(String color){
        this.color = color;
    }

    public void setShap(double x0, double y0, double height, double width){
        this.x0 = x0;
        this.y0 = y0;
        this.height = height;
        this.width = width;
    }

    public double surface(){
        return this.height * this.width;
    }

    public double getOriginX(){
        return this.x0;
    }

    public double getOriginY(){
        return this.y0;
    }

    public double getOppositeX(){
        return this.x0 + this.width;
    }

    public double getOppositeY(){
        return this.y0 + this.height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
