public class Triangulo implements Shape {

    private double base;
    private double altura;

    public Triangulo(){

    }

    public Triangulo(double base, double altura){

        this.base = base;

        this.altura = altura;

    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double getArea() {
        return ((this.base*this.altura)/2);
    }

    @Override
    public double getPerimetro() {
        return ((this.altura*2)+base);
    }
}
