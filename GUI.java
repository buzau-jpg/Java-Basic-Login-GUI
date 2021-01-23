package denme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener  {
	
	private static  JLabel Userlabel;
	private static JLabel PasswordLabel;
	private static JLabel succsess;
	private static JTextField UserText;
	private static JButton button;
	private static JPasswordField PasswordText;
	

	public static void main(String[] args) {
		JPanel panel = new JPanel();
		
		JFrame frame = new JFrame();
		frame.setSize(350, 200); // Size of frame 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("BMI Calculator");
		frame.add(panel);
		
		panel.setLayout(null);
		
		
		
		
		
		Userlabel = new JLabel("User");
		Userlabel.setBounds(10, 20, 80, 25);
		panel.add(Userlabel);
		
		
		UserText = new JTextField(20);
		UserText.setBounds(100, 20, 165, 25);
		panel.add(UserText);
		
		
		PasswordLabel = new JLabel("Password");
		PasswordLabel.setBounds(10, 50, 80, 25);
		panel.add(PasswordLabel);
		
		
		PasswordText = new JPasswordField(20);
		PasswordText.setBounds(100, 50, 165, 25);
		panel.add(PasswordText);
		
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		panel.add(button);
		button.addActionListener(new GUI());
		
		
		succsess = new JLabel("");
		succsess.setBounds(10 ,110, 300, 25);
		panel.add(succsess);
		
		
		
		
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = UserText.getText();
		String password = PasswordText.getText();
		
		
		if(user.equals("admin") && password.equals("admin123")) {	
			succsess.setText("Login Succsessful");	
		}
			
		
	}

}
