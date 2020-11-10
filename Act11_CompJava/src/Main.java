import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[])throws java.io.IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int opcUno, opcDos;
        double radio, altura, base;
        Circulo circulo;
        Triangulo triangulo;
        Rectangulo rectangulo;

        System.out.println("Area o Perimetro?");
        System.out.println("1. Area\n2. Perimetro");
        System.out.print("Opcion: ");
        opcUno = Integer.parseInt(in.readLine());

        switch (opcUno) {

            case 1:

                System.out.println("Selecciona una Figura");
                System.out.println("1. Circulo\n2. Triangulo\n3. Rectangulo");
                System.out.print("Opcion: ");

                opcDos = Integer.parseInt(in.readLine());

                switch (opcDos){

                    case 1:

                        System.out.println("Circulo Area");

                        System.out.print("Ingresa el Radio: ");
                        radio = Double.parseDouble(in.readLine());

                        System.out.println();

                        circulo = new Circulo(radio);

                        System.out.println("Area de tu Circulo: "+circulo.getArea());

                        break;
                    case 2:

                        System.out.println("Triangulo Area");

                        System.out.print("Ingresa la Base: ");
                        base = Double.parseDouble(in.readLine());

                        System.out.println();

                        System.out.print("Ingresa la Altura: ");
                        altura = Double.parseDouble(in.readLine());

                        triangulo = new Triangulo(base, altura);

                        System.out.println("\nEl Area de tu Triangulo: "+triangulo.getArea());

                        break;

                    case 3:

                        System.out.println("Rectangulo Area");

                        System.out.print("Ingresa la Base: ");
                        base = Double.parseDouble(in.readLine());

                        System.out.println();

                        System.out.print("Ingresa la Altura: ");
                        altura = Double.parseDouble(in.readLine());

                        rectangulo = new Rectangulo(base, altura);

                        System.out.println("\nEl Area de tu Triangulo: "+rectangulo.getArea());

                        break;

                    default:

                        break;

                }

                break;

            case 2:

                System.out.println("Selecciona una Figura");
                System.out.println("1. Circulo\n2. Triangulo\n3. Rectangulo");
                System.out.print("Opcion: ");

                opcDos = Integer.parseInt(in.readLine());

                switch (opcDos){

                    case 1:

                        System.out.println("Circulo Perimetro");

                        System.out.print("Ingresa el Radio: ");
                        radio = Double.parseDouble(in.readLine());

                        System.out.println();

                        circulo = new Circulo(radio);

                        System.out.println("Area de tu Circulo: "+circulo.getPerimetro());

                        break;
                    case 2:

                        System.out.println("Triangulo Perimetro");

                        System.out.print("Ingresa la Base: ");
                        base = Double.parseDouble(in.readLine());

                        System.out.println();

                        System.out.print("Ingresa la Altura: ");
                        altura = Double.parseDouble(in.readLine());

                        triangulo = new Triangulo(base, altura);

                        System.out.println("\nEl Area de tu Triangulo: "+triangulo.getPerimetro());

                        break;

                    case 3:

                        System.out.println("Rectangulo Perimetro");

                        System.out.print("Ingresa la Base: ");
                        base = Double.parseDouble(in.readLine());

                        System.out.println();

                        System.out.print("Ingresa la Altura: ");
                        altura = Double.parseDouble(in.readLine());

                        rectangulo = new Rectangulo(base, altura);

                        System.out.println("\nEl Area de tu Triangulo: "+rectangulo.getPerimetro());

                        break;

                    default:

                        break;

                }


                break;

            default:

                System.out.println("No es Opcion, Bye");
                break;
        }




    }


}
