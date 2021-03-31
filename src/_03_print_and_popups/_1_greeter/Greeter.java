package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
	System.out.println("Hello wOrLd");
	System.out.print("This \'is a' test\n");
	System.out.println("Im a pro lOl");
	
	String hellotext = "Hello World";
	
	String input = JOptionPane.showInputDialog("What is your name");
	
	JOptionPane.showMessageDialog(null, "hello "+ input);
	}

}
