public class Circulo implements Shape {

    private double radio;
    private static final double PI = 3.1416;

    public Circulo(){

    }

    public Circulo(double radio){

        this.radio = radio;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return ((this.radio*this.radio)*PI);
    }

    @Override
    public double getPerimetro() {
        return ((this.radio*2)*PI);
    }
}
