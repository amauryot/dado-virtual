package view.subpanel.button;

public enum Button {

	ROLL(0, "Jogar");
	
	private int index;
	private String title;
	
	private Button(int index, String title) {
		this.index = index;
		this.title = title;
	}
	
	public int index() {
		return index;
	}
	
	public String title() {
		return title;
	}
}
