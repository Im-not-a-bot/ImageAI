package webcamAI;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.Graphics;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Frame f=new Frame("image test");
		Scanner amongus = new Scanner(System.in);
		//f.setSize(, 0);
		f.setVisible(true);
		
		System.out.println("open your webcam and type \"start\"");
		String stringT=null;
		while(stringT!="start") {
			stringT=amongus.nextLine();
		}
	}

}
