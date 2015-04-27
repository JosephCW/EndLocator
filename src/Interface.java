import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Interface extends JPanel implements ActionListener {

	private static final long serialVersionUID = 4858854401818292748L;
	
	private JTextField EP1Sx;
	private JTextField EP1Sz;
	private JTextField EP1Ex;
	private JTextField EP1Ez;
	private JTextField EP2Sx;
	private JTextField EP2Sz;
	private JTextField EP2Ex;
	private JTextField EP2Ez;
	private JButton btnCalculate;
	private JLabel LabelxCord;
	private JLabel LabelzCord;
	private JButton btnHelp;

	public Interface() {
		setupLayout();
		
		btnCalculate.addActionListener(this);
		btnHelp.addActionListener(this);
		
		
	}
	public void calculate() {
		List<Double> xyCords = new ArrayList<Double>();
		xyCords = Math.doMath(
				Integer.parseInt(EP1Sx.getText()),
				Integer.parseInt(EP1Ex.getText()),
				Integer.parseInt(EP1Sz.getText()),
				Integer.parseInt(EP1Ez.getText()),
				Integer.parseInt(EP2Sx.getText()),
				Integer.parseInt(EP2Ex.getText()),
				Integer.parseInt(EP2Sz.getText()),
				Integer.parseInt(EP2Ez.getText())
				);
		
		LabelxCord.setText(String.valueOf(xyCords.get(0)));
		LabelzCord.setText(String.valueOf(xyCords.get(1)));
	}
	
	private void setupLayout() {
		setLayout(null);
		
		EP1Sx = new JTextField();
		EP1Sx.setText("EP1Sx");
		EP1Sx.setBounds(6, 5, 134, 28);
		add(EP1Sx);
		EP1Sx.setColumns(10);
		
		EP1Sz = new JTextField();
		EP1Sz.setText("EP1Sz");
		EP1Sz.setBounds(152, 5, 134, 28);
		add(EP1Sz);
		EP1Sz.setColumns(10);
		
		EP1Ex = new JTextField();
		EP1Ex.setText("EP1Ex");
		EP1Ex.setBounds(6, 32, 134, 28);
		add(EP1Ex);
		EP1Ex.setColumns(10);
		
		EP1Ez = new JTextField();
		EP1Ez.setText("EP1Ez");
		EP1Ez.setBounds(152, 32, 134, 28);
		add(EP1Ez);
		EP1Ez.setColumns(10);
		
		EP2Sx = new JTextField();
		EP2Sx.setText("EP2Sx");
		EP2Sx.setBounds(6, 72, 134, 28);
		add(EP2Sx);
		EP2Sx.setColumns(10);
		
		EP2Sz = new JTextField();
		EP2Sz.setText("EP2Sz");
		EP2Sz.setBounds(152, 72, 134, 28);
		add(EP2Sz);
		EP2Sz.setColumns(10);
		
		EP2Ex = new JTextField();
		EP2Ex.setText("EP2Ex");
		EP2Ex.setBounds(6, 99, 134, 28);
		add(EP2Ex);
		EP2Ex.setColumns(10);
		
		EP2Ez = new JTextField();
		EP2Ez.setText("EP2Ez");
		EP2Ez.setBounds(152, 99, 134, 28);
		add(EP2Ez);
		EP2Ez.setColumns(10);
		
		btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(6, 131, 134, 13);
		add(btnCalculate);
		
		btnHelp = new JButton("Help");
		btnHelp.setBounds(6, 152, 134, 13);
		add(btnHelp);
		
		JLabel lblX = new JLabel("X:");
		lblX.setBounds(155, 128, 12, 16);
		add(lblX);
		
		JLabel lblZ = new JLabel("Z:");
		lblZ.setBounds(155, 151, 17, 16);
		add(lblZ);
		
		LabelxCord = new JLabel("123");
		LabelxCord.setBounds(176, 128, 93, 16);
		add(LabelxCord);
		
		LabelzCord = new JLabel("123");
		LabelzCord.setBounds(176, 151, 93, 16);
		add(LabelzCord);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnCalculate)) {
			calculate();
		}
		else if(e.getSource().equals(btnHelp)) {
			JOptionPane.showMessageDialog(
				    null, "All you need is 2 Eyes of Ender. \n"
				    		+ "Type in to EP1Sx your Starting X Position. \n"
				    		+ "Type into EP1Sz your Starting Z Position. \n"
				    		+ "Throw your first Eye of Ender and put where it lands in EP1Ex and EP1Ez. \n"
				    		+ "\n"
				    		+ "Run ~250 blocks away, to the right or left of where the stronghold will be (Don't run straight in the direction that the Eye of Ender went.) \n"
				    		+ "Type into EP2Sx your Starting X Position. \n"
				    		+ "Type into EP2Sz your starting Z Position. \n"
				    		+ "Throw your second Eye of Ender and put where it lands in EP2Ex and EP2Ez.\n"
				    		+ "Hit the calculate button. \n"
				    		+ "???\n"
				    		+ "Profit.",
				    "Help",
				    JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
