import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int opc;
        String tel,nombre;
        AdressBook adressBook = new AdressBook();

        do {


            System.out.println("1. Crear Contacto\n2. Mostrar Contactos\n3. Buscar Contacto\n4. Salir");
            opc = Integer.parseInt(in.readLine());

            switch (opc) {

                case 1:

                    System.out.print("Ingresa el Telefono: ");
                    tel = in.readLine();

                    System.out.print("\nIngresa el Nombre: ");
                    nombre = in.readLine();

                    adressBook.añadirContacto(tel, nombre);


                    break;

                case 2:

                    adressBook.list();

                    break;

                case 3:

                    System.out.print("Ingresa el Telefono: ");
                    tel = in.readLine();

                    adressBook.buscar(tel);

                    break;

                case 4:

                    break;

                default:

                    System.out.println("No es una opción");

                    break;

            }
        }while (opc!=4);

    }




}
