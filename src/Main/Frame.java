package Main;
/*
 * NAME : GROUP 23
 * Nguyễn Quang Tâm-ITITIU21304
 * Trần Khánh Huy-ITITIU21185
 * Ng Huỳnh Minh Thông-ITITIU21321
 * PURPOSE OF PROGRAM: CREATE A TETRIS GAME
 */
import java.applet.Applet;

import javax.swing.JFrame;


public class Frame extends Applet{

	private static final long serialVersionUID = 7628012482200969792L;
	static JFrame window = new JFrame();
	public static void main(String[] args) {	
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(new Controller());
		window.pack();	
		window.setSize(StartingMenu.WIDTH, StartingMenu.HEIGHT);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setTitle("Tetris");
		window.setVisible(true);	
	}
}