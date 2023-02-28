import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main_1 {

	public static void main(String[] args) {

		// GUI Intro

		/*
		 * String name = JOptionPane.showInputDialog("Enter Your Name");
		 * JOptionPane.showMessageDialog(null, "Hello " + name);
		 */

		// Math Class

		/*
		 * double x, y, z;
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Enter side x"); x=scanner.nextDouble();
		 * System.out.println("Enter side y"); y=scanner.nextDouble();
		 * 
		 * z=Math.sqrt((x*x)+(y*y));
		 * 
		 * System.out.println("Z is "+z);
		 * 
		 * scanner.close();
		 */

		// Random numbers
		Random random = new Random();
		int x = random.nextInt();
		System.out.println(x);

	}

}
