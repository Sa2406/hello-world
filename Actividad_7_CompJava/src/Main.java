public class Main {


    public static void main(String args[]){

        //Creamos Objeto
        Main ejm = new Main();


        System.out.println("Numeros Primos: ");
        //Llamamos metodo para obtener los primeros 10 numeros primos
        ejm.getPrimos(10);

        System.out.println();

        System.out.println("Serie Fibonacci: ");
        //Llamamos metodo para obtener la serie fibonacci hasta el 10
        ejm.getFibonacci(10);

    }

    //Metodo para verificar si es Primo
    public boolean isPrimo(int num) {

        int cont = 0;
        for (int i = 1; i <= num; i++){

            if (num % i == 0) {
                cont++;

            }
        }

        if(cont == 2){
            return true;
        }

        return false;

    }

    //Metodo para obtener n Numeros Primos
    public void getPrimos(int num) {

        int[] array = new int[num];
        int cont = 0;

        for (int i = 1; cont != num; i++) {

                if (isPrimo(i)) {

                    array[cont] = i;
                    System.out.print(array[cont]+", ");
                    cont++;

                }
        }

    }

    //Metodo para calcular la serie Fibonacci
    public int calcularFibonacci(int num) {

        if (num > 0) {
            return calcularFibonacci(num - 1) + calcularFibonacci(num - 2);
        }
        else if(num == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    //Metodo para imprimir la serie fibonacci
    public void getFibonacci(int num){

        for(int i=0;i<num;i++){

            System.out.print(calcularFibonacci(i)+", ");

        }
    }

}
