package payroll;

import java.io.*;
import java.nio.file.*;
import java.awt.Color;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import inventory.StockSide;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class AddEmp {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmp window = new AddEmp();
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
	public AddEmp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frame.getContentPane().setForeground(new Color(51, 51, 51));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(51, 51, 51));
		panel.setBounds(0, 88, 225, 370);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		//ADD EMPLOYEE BUTTON (NOT IN ACTION)
		JPanel newEmp_button = new JPanel();
		newEmp_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		newEmp_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				newEmp_button.setBackground(new Color(20, 20, 20));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				newEmp_button.setBackground(new Color(20, 20, 20));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				newEmp_button.setBackground(new Color(20, 20, 20));
			}
		});
		newEmp_button.setBackground(new Color(20, 20, 20));
		newEmp_button.setBounds(0, 76, 225, 53);
		panel.add(newEmp_button);
		newEmp_button.setLayout(null);
		
		JLabel lblNewEmployee = new JLabel("New Employee");
		lblNewEmployee.setForeground(new Color(255, 255, 255));
		lblNewEmployee.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewEmployee.setBounds(47, 11, 133, 32);
		newEmp_button.add(lblNewEmployee);
		
		//EMPLOYEE REPORT BUTTON
		JPanel empRpt_button = new JPanel();
		empRpt_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		empRpt_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				empRpt_button.setBackground(new Color(30, 30, 30));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				empRpt_button.setBackground(new Color(0, 204, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				EmpRpt newEmp = new EmpRpt();
				frame.dispose();
			}
		});
		empRpt_button.setBackground(new Color(0, 204, 204));
		empRpt_button.setLayout(null);
		empRpt_button.setBounds(0, 140, 225, 53);
		panel.add(empRpt_button);
		
		JLabel lblEmployeeReport = new JLabel("Employee Report");
		lblEmployeeReport.setForeground(new Color(255, 255, 255));
		lblEmployeeReport.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblEmployeeReport.setBounds(36, 11, 156, 32);
		empRpt_button.add(lblEmployeeReport);
		
		//PAYSLIP BUTTON
		JPanel payslip_button = new JPanel();
		payslip_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		payslip_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				payslip_button.setBackground(new Color(30, 30, 30));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				payslip_button.setBackground(new Color(0, 204, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Payslip newEmp = new Payslip();
				frame.dispose();
			}
		});
		payslip_button.setBackground(new Color(0, 204, 204));
		payslip_button.setLayout(null);
		payslip_button.setBounds(0, 207, 225, 53);
		panel.add(payslip_button);
		
		JLabel lblPayslip = new JLabel("Payslip");
		lblPayslip.setForeground(new Color(255, 255, 255));
		lblPayslip.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblPayslip.setBounds(78, 11, 69, 32);
		payslip_button.add(lblPayslip);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(51, 51, 51));
		panel_1.setBounds(0, 48, 856, 39);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New Employee");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Dubai Medium", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(238, 11, 132, 17);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 0, 856, 48);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(StockSide.class.getResource("/images/twinng.png")));
		label.setBounds(20, 0, 89, 48);
		panel_2.add(label);
		
		JLabel lblJadanSoftwares = new JLabel("Fava Foods & Services\u00A9 ");
		lblJadanSoftwares.setFont(new Font("Dubai Light", Font.PLAIN, 16));
		lblJadanSoftwares.setBounds(420, 0, 185, 26);
		panel_2.add(lblJadanSoftwares);
		
		JLabel lblPlotNo = new JLabel("13 Gypsum Close, Eltham Park, Spanish Town, St. Catherine");
		lblPlotNo.setFont(new Font("Dubai Light", Font.PLAIN, 14));
		lblPlotNo.setForeground(new Color(51, 51, 51));
		lblPlotNo.setBounds(332, 23, 356, 14);
		panel_2.add(lblPlotNo);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 459, 855, 10);
		frame.getContentPane().add(panel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textField.setBounds(447, 161, 302, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblFirstName.setBounds(323, 161, 84, 30);
		frame.getContentPane().add(lblFirstName);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(447, 202, 302, 30);
		frame.getContentPane().add(textField_1);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblLastName.setBounds(323, 202, 84, 30);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblGender.setBounds(323, 243, 84, 30);
		frame.getContentPane().add(lblGender);
				
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(447, 284, 302, 58);
		frame.getContentPane().add(textField_3);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblAddress.setBounds(323, 284, 84, 30);
		frame.getContentPane().add(lblAddress);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(447, 353, 140, 30);
		frame.getContentPane().add(textField_4);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblPosition.setBounds(323, 353, 84, 30);
		frame.getContentPane().add(lblPosition);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(679, 353, 70, 30);
		frame.getContentPane().add(textField_5);
		
		JLabel lblRate = new JLabel("Rate");
		lblRate.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblRate.setBounds(619, 353, 50, 30);
		frame.getContentPane().add(lblRate);
		
		JLabel lblFillInThe = new JLabel("Fill in the necessary information for the new employee added");
		lblFillInThe.setForeground(new Color(0, 204, 204));
		lblFillInThe.setFont(new Font("Dubai Light", Font.BOLD, 16));
		lblFillInThe.setBounds(323, 109, 448, 30);
		frame.getContentPane().add(lblFillInThe);
		
		ButtonGroup group = new ButtonGroup();
				
		JRadioButton rdbtnNewRadioButton = new JRadioButton("  Female");
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBounds(447, 250, 91, 23);
		group.add(rdbtnNewRadioButton);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("  Male");
		rdbtnNewRadioButton_1.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setBounds(560, 250, 91, 23);
		group.add(rdbtnNewRadioButton_1);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		
		
		//SUBMIT BUTTON
		JPanel submit_button = new JPanel();
		JOptionPane optPane = new JOptionPane();
		
		submit_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				submit_button.setBackground(new Color(30, 30, 30));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				submit_button.setBackground(new Color(0, 204, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				try
			    {
			        FileWriter writer = new FileWriter("Employee.txt",true);

			        writer. write("FirstName:" + textField.getText());
			        writer.write("\r\n");
			        writer. write("LastName:" +  textField_1.getText());
			        writer.write("\r\n");
			        
			        if(rdbtnNewRadioButton.isSelected() ) {
			        	writer. write("Gender:" + "female");
					}
					else if(rdbtnNewRadioButton_1.isSelected() ) {
						writer. write("Gender:" + "male");
					}
			        
			        writer.write("\r\n");
			        writer. write("Address:" + textField_3.getText());
			        writer.write("\r\n");
			        writer. write("Position:" + textField_4.getText());
			        writer.write("\r\n");
			        writer. write("Rate:" + textField_5.getText());
			        writer.write("\r\n");
			        writer.close();

			        optPane.showMessageDialog(null, "Successfully Added");

			    }catch(Exception ex)
			    {
			        ex.printStackTrace();
			    }
				//code for submission of employee info
				 textField.setText(null);
			        textField_1.setText(null);
			        textField_3.setText(null);
			        textField_4.setText(null);
			        textField_5.setText(null);
			}
		});
		submit_button.setLayout(null);
		submit_button.setBackground(new Color(0, 204, 204));
		submit_button.setBounds(560, 408, 110, 30);
		frame.getContentPane().add(submit_button);
		
		JLabel lblSubmit = new JLabel("Submit");
		lblSubmit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSubmit.setForeground(Color.WHITE);
		lblSubmit.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblSubmit.setBounds(31, 0, 56, 32);
		submit_button.add(lblSubmit);
		
		//CANCEL BUTTON
		JPanel cancel_button = new JPanel();
		cancel_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cancel_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				cancel_button.setBackground(new Color(240, 0, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				cancel_button.setBackground(new Color(204, 0, 0));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				ProllSide proll = new ProllSide();
				frame.dispose();
			}
		});
		cancel_button.setLayout(null);
		cancel_button.setBackground(new Color(204, 0, 0));
		cancel_button.setBounds(679, 408, 70, 30);
		frame.getContentPane().add(cancel_button);
		
		JLabel lblCancel = new JLabel("cancel");
		lblCancel.setForeground(Color.WHITE);
		lblCancel.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblCancel.setBounds(10, 0, 56, 29);
		cancel_button.add(lblCancel);
		
		frame.setBounds(100, 100, 872, 508);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


}
