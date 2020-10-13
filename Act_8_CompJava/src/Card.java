public class Card {

    private String palo;
    private String color;
    private String valor;

    //Constructor
    public Card(String palo, String valor){

        this.palo = palo;

        if(this.palo.equals("Trebol") || this.palo.equals("Picas")){

            this.color = "Negro";

        }else {

            this.color = "Rojo";
        }

        this.valor = valor;

    }

    //Get Cadena
    public String getCard() {
        return "{"+palo+"} "+"{"+color+"} "+"{"+valor+"}";
    }


}
