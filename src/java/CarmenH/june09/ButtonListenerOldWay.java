package CarmenH.june09;
import java.awt.*;
import java.awt.event.*;

public class ButtonListenerOldWay {
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {

        Frame frame=new Frame("ActionListener Before Java8");

        Button b=new Button("Click Here");// this creates a button with text
        b.setForeground(Color.blue); // changed the color of the text to be more visible
        b.setBounds(50,100,80,50); // button  dimensions

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ //action performed = click - it prints the text
                System.out.println( ANSI_RED + "Hello World!");
            }
        });
        frame.add(b);

        frame.setSize(200,200);
        frame.setLayout(null);
        frame.setVisible(true);
        

    }

}
