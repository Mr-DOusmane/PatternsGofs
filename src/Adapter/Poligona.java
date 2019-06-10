package Adapter;

public class Poligona implements Figure{

    private double xa, xb, ya, yb;

    public Poligona(double xa, double xb, double ya, double yb){
        this.xa = xa;
        this.xb = xb;
        this.ya = ya;
        this.yb = yb;
    }

    @Override
    public double getSurface() {
        return 0;
    }

    @Override
    public double getPerimetre() {
        return 0;
    }
}
