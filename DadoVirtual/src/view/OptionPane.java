package view;

import javax.swing.JOptionPane;

public class OptionPane {

	private final String MESSAGE_TITLE = "Sobre Dado Virtual";
	private final String MESSAGE_ABOUT = 
		"Dado Virtual"
		+ "\nCopyright © Mar 2022"
		+ "\n\nVersão: 1.0.2"
		+ "\n\nAmaury Tavares"
		+ "\namauryot@gmail.com\n\n";
	
	public void showMessageAbout() {
		JOptionPane.showMessageDialog(null, MESSAGE_ABOUT, MESSAGE_TITLE, JOptionPane.INFORMATION_MESSAGE);
	}
}
