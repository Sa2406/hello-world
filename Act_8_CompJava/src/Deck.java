import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private static final String palos[] = {"Trebol","Corazones","Picas","Diamante"};
    private static final String valores[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    private ArrayList<Card> baraja = new ArrayList<Card>();

    //Constructor
    public Deck(){

        getBaraja();

    }


    //Inicializar la baraja
    public ArrayList<Card> getBaraja() {

        for(int i=0;i<palos.length;i++){

            for(int j=0;j<valores.length;j++){

                Card carta = new Card(palos[i],valores[j]);
                baraja.add(carta);

            }

        }

        return baraja;
    }

    //Metodo shuffle
    public void shuffle(){
        Collections.shuffle(baraja);
        System.out.println("Se mezclo el Deck");
    }

    //Retorna la cabeza de la lista
    public void head(){

        System.out.println(baraja.get(0).getCard());
        baraja.remove(0);
        System.out.println("Quedan: "+baraja.size()+" cartas en el Deck");

    }

    //Metodo pick random
    public void pick(){

        int rand = new Random().nextInt(baraja.size());

        System.out.println(baraja.get(rand).getCard());

        baraja.remove(rand);

        System.out.println("Quedan: "+baraja.size()+" cartas en el Deck");

    }

    //Devuelve una mano random
    public void hand(){

        int rand;
        String array[] = new String[5];

        for(int i=0;i<array.length;i++){
            rand = new Random().nextInt(baraja.size());

            array[i] = baraja.get(rand).getCard();
            baraja.remove(rand);

        }

        for (int i=0;i<array.length;i++){

            System.out.println(array[i]);

        }

        System.out.println("Quedan: "+baraja.size()+" cartas en el Deck");

    }

}
