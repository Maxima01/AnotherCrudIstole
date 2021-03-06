
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import com.mysql.cj.jdbc.Driver;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;

public class CrudInfoSys {

	private JFrame frame;
	private JTextField textFirstName;
	private JTextField textMiddleName;
	private JTextField textFamilyName;
	private JTextField textDoB;
	private JTextField textSSN;
	private JTextField textNationality;
	private JTextField textCurrentAddress;
	private JTable table;

	
	/**
	 * Launch the application.
	 */
	public static void main (String[] args ) {
		// try{
		// 	String url = "jdbc:mysql://localhost:3306/demo";
		// 	String root = "root";
		// 	String pass = "";	
		// 	Class.forName("com.mysql.cj.jdbc.driver");
		// 	Connection con = DriverManager.getConnection(url,root,pass);
		// 	Statement stmt = con.createStatement();
		// 	}
		// 	catch(Exception e){
		// 		e.printStackTrace();
		//    }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrudInfoSys window = new CrudInfoSys();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}

	/**
	 * Create the application.
	 */
	public CrudInfoSys() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 592, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 556, 254);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("First Name\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 9, 68, 20);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Middle Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 36, 77, 20);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Family Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 59, 77, 20);
		panel.add(lblNewLabel_2);

		textFirstName = new JTextField();
		textFirstName.setBounds(90, 9, 146, 20);
		panel.add(textFirstName);
		textFirstName.setColumns(10);

		textMiddleName = new JTextField();
		textMiddleName.setColumns(10);
		textMiddleName.setBounds(90, 36, 146, 20);
		panel.add(textMiddleName);

		textFamilyName = new JTextField();
		textFamilyName.setColumns(10);
		textFamilyName.setBounds(90, 59, 146, 20);
		panel.add(textFamilyName);

		JLabel lblNewLabel_3 = new JLabel("Bio. Gender");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(246, 12, 86, 14);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Date of Birth");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(246, 37, 86, 20);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_2_1 = new JLabel("Suffix\r\n");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(10, 89, 68, 20);
		panel.add(lblNewLabel_2_1);

		JComboBox comboBox_Suffix = new JComboBox();
		comboBox_Suffix.setModel(new DefaultComboBoxModel(new String[] { "None.", "Jr.", "Sr." }));
		comboBox_Suffix.setBounds(90, 89, 146, 22);
		panel.add(comboBox_Suffix);

		JComboBox comboBox_Gender = new JComboBox();
		comboBox_Gender.setModel(new DefaultComboBoxModel(new String[] { "None.", "MALE", "FEMALE" }));
		comboBox_Gender.setBounds(342, 9, 185, 22);
		panel.add(comboBox_Gender);

		textDoB = new JTextField();
		textDoB.setBounds(342, 37, 185, 20);
		panel.add(textDoB);
		textDoB.setColumns(10);

		JLabel lblNewLabel_4_1 = new JLabel("SSN");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1.setBounds(246, 59, 86, 20);
		panel.add(lblNewLabel_4_1);

		JLabel lblNewLabel_4_2 = new JLabel("Nationality");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_2.setBounds(246, 89, 86, 20);
		panel.add(lblNewLabel_4_2);

		textSSN = new JTextField();
		textSSN.setColumns(10);
		textSSN.setBounds(342, 60, 185, 20);
		panel.add(textSSN);

		textNationality = new JTextField();
		textNationality.setColumns(10);
		textNationality.setBounds(342, 90, 185, 20);
		panel.add(textNationality);

		JLabel lblNewLabel_2_1_1 = new JLabel("Current Address");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(10, 120, 226, 20);
		panel.add(lblNewLabel_2_1_1);

		textCurrentAddress = new JTextField();
		textCurrentAddress.setBounds(116, 121, 430, 88);
		panel.add(textCurrentAddress);
		textCurrentAddress.setColumns(10);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFirstName.setText(null);
				textMiddleName.setText(null);
				textFamilyName.setText(null);
				textDoB.setText(null);
				textSSN.setText(null);
				textNationality.setText(null);
				textCurrentAddress.setText(null);
			}
		});
		btnClear.setBounds(457, 220, 89, 23);
		panel.add(btnClear);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 276, 556, 44);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JButton btnFind = new JButton("Find");
		btnFind.setBounds(10, 11, 125, 23);
		panel_1.add(btnFind);

		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String fName;
				String mName;
				String fmName; 
				String fx = "jr";
				String gender = "male";
				var dateOfBirth = 5-23-68;
				String Ssn;
				String Nationality;
				String CurrentAddress;
                String sql;
				
				fName = textFirstName.getText();
				mName = textMiddleName.getText();
				fmName = textFamilyName.getText();
				Ssn= textSSN.getText();
				Nationality = textNationality.getText();
				CurrentAddress = textCurrentAddress.getText();
				try{
					String url = "jdbc:mysql://localhost:3306/demo";
					String root = "root";
					String pass = "";	
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,root,pass);
					Statement stmt = con.createStatement();
					stmt.executeUpdate("INSERT into user(fname,lname,mname,suffix,address,nationality,Birthdate,ssn)" + 
					"Values('" +  fName + "', '" + fmName + "', '" + mName + "', '" + fx + "', '" + CurrentAddress + "', '" + Nationality + "', '" + dateOfBirth + "', '" + Ssn + "')");
					
				   }
					catch(Exception a){
						a.printStackTrace();
				   }

				   System.out.println(fName +" "+ fmName + " " + mName);


			}
		});
		btnCreate.setBounds(145, 11, 127, 23);
		panel_1.add(btnCreate);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(282, 11, 127, 23);
		panel_1.add(btnUpdate);

		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(419, 11, 127, 23);
		panel_1.add(btnDelete);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 331, 556, 158);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 536, 136);
		panel_2.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
