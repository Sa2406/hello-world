public class Rectangulo implements Shape {

    private double base;
    private double altura;

    public Rectangulo(){

    }

    public Rectangulo(double base, double altura){

        this.base = base;
        this.altura = altura;

    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return this.base*this.altura;
    }

    @Override
    public double getPerimetro() {
        return (2*(this.base+this.altura));
    }
}
