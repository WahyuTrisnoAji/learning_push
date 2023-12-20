package javafol;

import javax.swing.JOptionPane;

public class course_5 {
    public static void main(String[] args) {

        // GUI = Graphicasl User Interface

        String name = JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null, "hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null, "your are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("enter your height "));
        JOptionPane.showMessageDialog(null, "your are " + height + " cm tall");

        String data = JOptionPane.showInputDialog("your  data is correct? ");
        JOptionPane.showMessageDialog(null,
                "name: " + name + " your are " + age + " years old " + " your height " + height + " cm tall");
    }
}
