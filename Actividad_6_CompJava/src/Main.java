
public class Main{


    public static void main(String args[]){

        //Array predefinido
        double array[] = {100, 95, 88, 95, 86};
        //Nombre predefinido
        String nombre = "Saul Omar Lamas Yañez";

        //Creamos el Objeto de la Clase Calificacion
        Calificacion alm = new Calificacion(nombre,array);


        //Llamamos el metodo Imprimir Calificacion
        alm.imprimirCalificacion();



    }

}
