package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;

import controller.Controller;
import view.frame.Frame;
import view.frame.MenuItem;
import view.panel.PanelMain;
import view.subpanel.button.Button;
import view.subpanel.button.SubPanelButton;
import view.subpanel.image.SubPanelImage;

public class Window {

	private Frame frame;
	private PanelMain panelMain;
	private SubPanelImage subPanelImage;
	private SubPanelButton subPanelButton;
	
	public Window() {
		initialize();
	}

	public JMenuItem getMenuItem(MenuItem menuItem) {
		return frame.menuItemList().get(menuItem.index());
	}
	
	public JButton getButton(Button button) {
		return subPanelButton.buttonList().get(button.index());
	}
	
	public void setImage(ImageIcon imageFile) {
		subPanelImage.labelImage().setIcon(imageFile);
	}
	
	public void addController(Controller controller) {
		frame.menuItemList().forEach(menuItem -> menuItem.addActionListener(controller));
		subPanelButton.buttonList().forEach(button -> button.addActionListener(controller));
	}
	
	public void show() {
		frame.setVisible(true);
	}
	
	public void close() {
		frame.dispose();
	}
	
	private void initialize() {
		frame = new Frame();
		
		panelMain = new PanelMain();
		frame.getContentPane().add(panelMain);
		
		subPanelImage = new SubPanelImage();
		panelMain.add(subPanelImage);
		
		subPanelButton = new SubPanelButton();
		panelMain.add(subPanelButton);
	}
}
