package Main;

/*
 * NAME : GROUP 23
 * Nguyễn Quang Tâm-ITITIU21304
 * Trần Khánh Huy-ITITIU21185
 * Ng Huỳnh Minh Thông-ITITIU21321
 * PURPOSE OF PROGRAM: CREATE A TETRIS GAME
 */
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;


public class ImageLoader {
	
	private BufferedImage img;
	public static String squarePath = "/Squares.png";
	public static String logoPath = "/Logo.png";
	public static String tetrisPath = "/TetrisLogo.png";
	
	public ImageLoader(String path) {
		try {
			img = ImageIO.read(ImageLoader.class.getResourceAsStream(path));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public BufferedImage getImage() {
		return img;
	}
	public BufferedImage getSubImage(int section) {
		return img.getSubimage(section*50, 0, 50, 50);
	}
	
}

