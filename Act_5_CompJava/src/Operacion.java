public class Operacion {

    private int a;
    private int b;

    public Operacion(){


    }

    public Operacion(int a, int b){

        this.a = a;
        this.b = b;

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int suma(int a, int b){
        return (this.a = a) + (this.b = b);
    }

    public int resta(int a, int b){
        return (this.a = a) - (this.b = b);
    }

    public int multiplicacion(int a, int b){
        return (this.a = a) * (this.b = b);
    }

    public double division(int a, int b){
        return (this.a = a) / (this.b = b);
    }

    public int modulo(int a, int b){
        return (this.a = a) / (this.b = b);
    }



}
