import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args){

        //Lista
        List<String> lista = new ArrayList<String>();

        //Los 10 nombres que uso como cadena
        lista.add("saul");
        lista.add("roberto");
        lista.add("manuel");
        lista.add("andres");
        lista.add("rodrigo");
        lista.add("fernando");
        lista.add("jorge");
        lista.add("ricardo");
        lista.add("mauricio");
        lista.add("javier");


        System.out.println("Alfabetico ---- Clase Anonima");

        System.out.print(lista);
        System.out.println();

        //Comparato, Clase anonima usando metodo compareTo
        Comparator<String> orden = new Comparator<String>() {
            @Override
            public int compare(String nombreA, String nombreB) {
                return nombreA.compareTo(nombreB);
            }
        };
        //Ordena la lista usando la variable COMPARATOR
        lista.sort(orden);
        //Imprime Lista
        System.out.print(lista);
        System.out.println();
        //Mezcla la lista
        Collections.shuffle(lista);

        //---------------------------------------------------------------------------------

        System.out.println();
        System.out.println("Alfabetico ---- Lambda");

        System.out.print(lista);
        System.out.println();

        //Lambda dentro del metodo sort usando 2 parametros String, y compara con compareTo
        lista.sort((nom1,nom2) -> nom1.compareTo(nom2) );

        //Imrime Lista
        System.out.println(lista);

        //Mezcla la Lista
        Collections.shuffle(lista);

        //----------------------------------------------------------------------------------------

        System.out.println();
        System.out.println("Alfabetico ---- Metodos de Referencia");

        System.out.print(lista);
        System.out.println();

        //Metodo sort desde su clase Collections y dentro se le pasa la lista y su metodo referencia compareTo
        Collections.sort(lista,String::compareTo);
        //Imprime Lista
        System.out.println(lista);

        //Mezcla la lista
        Collections.shuffle(lista);

        //-----------------------------------------------------------------------------------

        System.out.println();
        System.out.println("Longitud ---- Clase Anonima");

        System.out.print(lista);
        System.out.println();

        //Comparato, Clase anonima usando metodo compare de la clase Integer y compara las longitudes de las cadenas
        Comparator<String> orden2 = new Comparator<String>() {
            @Override
            public int compare(String nombreA, String nombreB) {
                return Integer.compare(nombreA.length(),nombreB.length());
            }
        };
        //Ordena la lista
        lista.sort(orden2);
        //Imprime Lista
        System.out.print(lista);
        System.out.println();
        //Mezcla la lista
        Collections.shuffle(lista);

        //---------------------------------------------------------------------------------------

        System.out.println();
        System.out.println("Longitud ---- Lambda");

        System.out.print(lista);
        System.out.println();

        //Metodo sort con una Lambda, 2 parametros String y realiza el metodo compare de la clase Integer
        lista.sort((nom1,nom2) -> Integer.compare(nom1.length(),nom2.length()) );

        //Imprime Lista
        System.out.println(lista);

        //Mezcla la lista
        Collections.shuffle(lista);

        //----------------------------------------------------------------------------------------

        System.out.println();
        System.out.println("Longitud ---- Metodos de Referencia");

        System.out.print(lista);
        System.out.println();

        //Metodo sort de la clase Collections y dentro le pasamos la lista
        // y el metodo comparingInt de la clase Comparator con el metodo de referencia length
        Collections.sort(lista,Comparator.comparingInt(String::length));
        //Imprime Lista
        System.out.println(lista);

    }


}
