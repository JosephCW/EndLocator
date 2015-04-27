import javax.swing.JFrame;

public class Frame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5151041547543472432L;
	
	JFrame myFrame;
	
	public Frame() {
		myFrame = new JFrame("End Portal Locator by JosephWG");
		
		myFrame.add(new Interface());
		
		setProperties();
		setVisibility(true);
	}
	
	
	public void setVisibility(boolean visibility) {
		myFrame.setVisible(visibility);
	}
	public boolean isVisible() {
		return myFrame.isVisible();
	}
	public void setProperties() {
		myFrame.setSize(290, 200);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setResizable(false);
		myFrame.setLocationRelativeTo(null);
	}

}
