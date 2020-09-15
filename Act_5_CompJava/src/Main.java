import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    private JTextField obtA, obtB;
    private JLabel suma, resta, mult, div, mod;
    private JLabel getA, getB,A,B;
    private JButton boton;
    private Container window;


    public static void main(String args[]){


        Main demo = new Main();

        demo.setSize(300,300);
        demo.crearInterfaz();
        demo.setVisible(true);

    }

    public void crearInterfaz(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        window = getContentPane();
        window.setLayout(null);

        getA = new JLabel("Numero: ");
        window.add(getA).setBounds(90,0,70,20);

        obtA = new JTextField("0");
        window.add(obtA).setBounds(140,2,20,20);

        getB = new JLabel("Numero: ");
        window.add(getB).setBounds(90,25,70,20);;

        obtB = new JTextField("0");
        window.add(obtB).setBounds(140,25,20,20);

        boton = new JButton("Calcular");
        window.add(boton).setBounds(80,55,100,25);
        boton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent event){

        Operacion ejm = new Operacion();
        int a,b;

        a = Integer.parseInt(obtA.getText());
        b = Integer.parseInt(obtB.getText());

        A = new JLabel("Valor X: "+a);
        window.add(A).setBounds(90,70,1000,50);
        B = new JLabel("Valor Y: "+b);
        window.add(B).setBounds(90,82,1000,50);

        suma = new JLabel("Suma: "+ejm.suma(a,b));
        window.add(suma).setBounds(90,94,1000,50);

        resta = new JLabel("Resta: "+ejm.resta(a,b));
        window.add(resta).setBounds(90,108,1000,50);

        mult = new JLabel("Multiplicación: "+ejm.multiplicacion(a,b));
        window.add(mult).setBounds(90,122,1000,50);

        div = new JLabel("División: "+ejm.division(a,b));
        window.add(div).setBounds(90,134,1000,50);

        mod = new JLabel("Modulo: "+ejm.modulo(a,b));
        window.add(mod).setBounds(90,148,1000,50);

    }


}
