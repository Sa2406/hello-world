import java.io.*;
import java.util.HashMap;

public class AdressBook {

    private HashMap<String,String> contact = new HashMap<String, String>();

    File file = new File("contactos.txt");

    //Constructor
    public AdressBook(){

        load();

    }

    //Metodo para leer el archivo y pasarlo a la hash
    public void load(){

        try{

            FileReader fileReader = new FileReader("contactos.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String str = "";
            String cadena = bufferedReader.readLine();

            //While que crea una cadena con las lineas de texto
            while (cadena!=null){

                str = str + cadena;
                cadena = bufferedReader.readLine();

            }

            //Divide un array
            String []array = str.split(",");

            int aux=1;

            //Llenamos la hashmap
            for (int i=0;i<array.length;i+=2){

                contact.put(array[i],array[aux]);
                aux+=2;

            }

        }catch (Exception e){

            System.out.println("No se encontró el archivo");

        }

    }

    //Metodo para añadir contactos
    public void añadirContacto(String tel, String nombre){

        contact.put(tel,nombre);

        try {

            BufferedWriter añadir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));

            añadir.write(tel+","+contact.get(tel)+",");
            añadir.write("\n");

            System.out.println("Se creao el contacto");
            añadir.close();


        }catch (Exception e){

            System.out.println(e.getMessage());

        }


    }

    //Metodo para ver todos los contactos
    public void list(){

        for(String i:contact.keySet()){

            System.out.println("{"+i+"}{"+contact.get(i)+"}");

        }

    }

    //Metodo para buscar un contacto especifico
    public void buscar(String id){

        System.out.println(contact.get(id));

    }

}
