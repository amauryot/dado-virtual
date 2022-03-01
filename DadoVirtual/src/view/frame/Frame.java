package view.frame;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame extends JFrame {

	private static final long serialVersionUID = 8296914021670968846L;

	private final String FRAME_TITLE = "Dado Virtual";
	private final String MENU_TITLE = "Menu";
	private final int FRAME_WIDTH = 310;
	private final int FRAME_HEIGHT = 320;
	
	public Frame() {
		super();
		initialize();
	}
	
	private void initialize() {
		
		/* FRAME */
		
		this.setTitle(FRAME_TITLE);
		this.getContentPane().setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		/* MENU */
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu(MENU_TITLE);
		menuBar.add(menu);
		
		JMenuItem menuItemAbout = new JMenuItem("Sobre");
		menu.add(menuItemAbout);
		
		JMenuItem menuItemExit = new JMenuItem("Sair");
		menu.add(menuItemExit);
	}
}
