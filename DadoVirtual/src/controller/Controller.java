package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Dice;
import model.DiceFaces;
import view.OptionPane;
import view.Window;
import view.frame.MenuItem;
import view.subpanel.button.Button;

public class Controller implements ActionListener {

	private Dice dice;
	private DiceFaces diceFaces;
	private OptionPane optionPane;
	private Window window;
	
	public Controller() {
		dice = new Dice();
		diceFaces = new DiceFaces();
		optionPane = new OptionPane();
		window = new Window();
	}
	
	public void run() {
		window.show();
		window.addController(this);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		/* MENU ITEM ABOUT */
		
		if (event.getSource() == window.getMenuItem(MenuItem.ABOUT)) {
			optionPane.showMessageAbout();
			return;
		}
		
		/* MENU ITEM EXIT */
		
		if (event.getSource() == window.getMenuItem(MenuItem.EXIT)) {
			window.close();
		}
		
		/* BUTTON ROLL */
		
		if (event.getSource() == window.getButton(Button.ROLL)) {
			int face = dice.roll();
			window.setImage(diceFaces.getFace(face));
			return;
		}
	}
}
