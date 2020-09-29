
public class Calificacion {

    //Variables Necesarias String y Array
    private String alumno;
    private double cal[];

    //Constructor
    public Calificacion(String nombre,double array[]){

        this.alumno = nombre;
        this.cal = array;

    }


    //Metodo Calcular Promedio
    public double calcularPromedio(double array[]){

        this.cal = array;

        //Variable a retornar promedio
        double prom = 0;

        //Suma el array y lo guarda en prom
        for(int i=0;i<this.cal.length;i++){
            prom += array[i];
        }

        //Refresa el promedio
        return (prom/this.cal.length);
    }

    //Metodo para ver la Cal final
    public char calificacionFinal(double promedio){

        //Vriable a retornar
        char res=' ';

        //Ifs para asignar el distinto Caracter
        if(promedio<=50){ res = 'F';}
        else if (promedio>50&&promedio<60){res = 'E';}
        else if (promedio>60&promedio<70){res = 'D';}
        else if (promedio>70&promedio<80){res = 'C';}
        else if (promedio>80&promedio<90){res = 'B';}
        else { res = 'A';}

        //Regresa res
        return res;
    }

    //Metodo para imprimir
    public void imprimirCalificacion(){

        //Imprime el estudiante
        System.out.println("Nombre Estudiante: "+this.alumno);

        //Recorre e Imprime el array
        for (int i=0;i<this.cal.length;i++){
            System.out.println("Calificacion "+(i+1)+": "+this.cal[i]);
        }

        //Imprime el Promedio
        System.out.println("Promedio: "+calcularPromedio(this.cal));
        //Imprime la Calificacion
        System.out.println("Calificación: "+calificacionFinal(calcularPromedio(this.cal)));

    }

}
