package CarmenH.June.june09;

import java.awt.*;

public class ButtonListenerNewWay {
  public static final String ANSI_RED = "\u001B[31m";

  public static void main(String[] args) {
    Frame frame = new Frame("ActionListener java8");

    Button b = new Button("Click Here");
    b.setBounds(50, 100, 80, 50);

    /**
     * b.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent e){
     * //action performed = click - it prints the text System.out.println( ANSI_RED + "Hello
     * World!"); } });
     */
    b.addActionListener(e -> System.out.println(ANSI_RED + "Hello World!"));
    frame.add(b);

    frame.setSize(200, 200);
    frame.setLayout(null);
    frame.setVisible(true);
  }
}
