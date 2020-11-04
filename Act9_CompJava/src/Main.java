import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class Main extends JFrame implements ActionListener {

    private JButton shuffle, head, azar, mano;
    private JLabel intro, restantes, cartaMano;
    private Deck deck;


    public static void main(String args[]){

        Main gui = new Main();

        gui.setSize(750,150);
        gui.createGUI();
        gui.setVisible(true);

    }


    public void createGUI(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());


        shuffle = new JButton("Shuffle");

        shuffle.addActionListener(this::actionPerformed);

        head = new JButton("Sacar Carta");

        head.addActionListener(this::actionPerformed);

        azar = new JButton("Carta al Azar");

        azar.addActionListener(this::actionPerformed);

        mano = new JButton("Sacar Mano");

        mano.addActionListener(this::actionPerformed);

        deck = new Deck();

        intro = new JLabel("Bienvenido al Poker!");

        window.add(intro);
        window.add(shuffle);
        window.add(head);
        window.add(azar);
        window.add(mano);


        restantes = new JLabel();
        cartaMano = new JLabel();


        window.add(cartaMano);
        window.add(restantes);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(shuffle)){

            deck.shuffle();

            cartaMano.setText("Deck se Mezclo");
            restantes.setText("Cartas Restantes: "+deck.getBarajaSize());


        }else if (e.getSource().equals(head)){

            try {
                cartaMano.setText(deck.head());
            }catch (Exception vacio){

                JOptionPane.showMessageDialog(null,vacio.getMessage(),"Vacio",JOptionPane.ERROR_MESSAGE);
                System.exit(0);

            }finally {

                restantes.setText("Cartas Restantes: " + deck.getBarajaSize());

            }

        }else if(e.getSource().equals(azar)){

            try {
                cartaMano.setText(deck.pick());
            }catch (Exception vacio){

                JOptionPane.showMessageDialog(null,vacio.getMessage(),"Vacio",JOptionPane.ERROR_MESSAGE);
                System.exit(0);

            }finally {

                restantes.setText("Cartas Restantes: " + deck.getBarajaSize());

            }

        }else {


            try {
                List list = Arrays.asList(deck.hand());
                cartaMano.setText(list.toString());
            }catch (Exception vacio){

                JOptionPane.showMessageDialog(null,vacio.getMessage(),"Vacio",JOptionPane.ERROR_MESSAGE);
                System.exit(0);

            }finally {

                restantes.setText("Cartas Restantes: " + deck.getBarajaSize());
            }
        }


    }
}
