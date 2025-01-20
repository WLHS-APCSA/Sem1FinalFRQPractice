package Quadratic;

public class QuadraticKey {
    //instance variables
    private int a;
    private int b;
    private int c;


    //constructors
    public QuadraticKey(){
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }
    public QuadraticKey(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //getters

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    //setters

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }


    //other methods

    public double discriminant(){
        return Math.pow(b,2) - 4*a*c;
    }

    public boolean hasRealSolutions(){
        return this.discriminant() >= 0.0;
    }

    public double[] roots(){
        double[] realRoots = new double[2];
        double discriminantRoot = Math.sqrt(this.discriminant());
        if (hasRealSolutions()){
            realRoots[0] = (-1*this.getB() + discriminantRoot)/(2*this.getA());
            realRoots[1] = (-1*this.getB() - discriminantRoot)/(2*this.getA());
        }
        return realRoots;
    }
}
