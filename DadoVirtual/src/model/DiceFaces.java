package model;

import javax.swing.ImageIcon;

public class DiceFaces {

	private final String[] DICE_FACES_FILES = {
		"diceFace1.png",
		"diceFace2.png",
		"diceFace3.png",
		"diceFace4.png",
		"diceFace5.png",
		"diceFace6.png"
	};
	
	private ImageIcon[] diceFaceArray;
	
	public DiceFaces() {
		diceFaceArray = new ImageIcon[DICE_FACES_FILES.length];
		
		for (int face = 0; face < DICE_FACES_FILES.length; face++) {
			diceFaceArray[face] = new ImageIcon(ClassLoader.getSystemResource(DICE_FACES_FILES[face]));
		}
	}
	
	public ImageIcon getFace(int face) {
		return diceFaceArray[face];
	}
}
