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

    //Devuelve Size
    public int getBarajaSize(){

        return baraja.size();

    }

    //Metodo shuffle
    public void shuffle(){
        Collections.shuffle(baraja);

    }

    //Retorna la cabeza de la lista
    public String head(){

        String aux;

        aux = baraja.get(0).getCard();

        baraja.remove(0);

        return aux;

    }

    //Metodo pick random
    public String pick(){

        int rand = new Random().nextInt(baraja.size());

        String aux;

        aux = baraja.get(rand).getCard();

        baraja.remove(rand);

        return aux;

    }

    //Devuelve una mano random
    public String[] hand(){

        int rand;
        String array[] = new String[5];

        for(int i=0;i<array.length;i++){
            rand = new Random().nextInt(baraja.size());

            array[i] = baraja.get(rand).getCard();
            baraja.remove(rand);

        }

        return array;

    }

}
