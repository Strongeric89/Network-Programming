/*
 * 1. Write a simple java applet program for calculator that will perform basic arithmetic
operation i.e. addition, subtraction and multiplication.
 * */

package com.eric.lab7;

import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CalApp extends JApplet {

	private JPanel contentPane;
	private JTextField textField;
	private JButton multiplyButton;
	private JButton subtractButton;
	private JButton addButton;
	private JButton equalsbutton;
	private JButton clearButton;
	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;

	public static int operand1;
	public static int operand2;
	public static StringBuilder sb = new StringBuilder();
	public static String op;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalApp frame = new CalApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalApp() {

		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		textField = new JTextField();
		textField.setBounds(32, 11, 316, 44);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton divideButton = new JButton(" / ");
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operator = "/";
				sb.append(operator);

				textField.setText(sb.toString());
				op = operator;

			}
		});
		divideButton.setBounds(358, 10, 66, 45);
		contentPane.add(divideButton);

		multiplyButton = new JButton(" * ");
		multiplyButton.setBounds(358, 66, 66, 45);
		contentPane.add(multiplyButton);
		multiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operator = "*";
				sb.append(operator);
				textField.setText(sb.toString());
				op = operator;

			}
		});

		subtractButton = new JButton("-");
		subtractButton.setBounds(358, 122, 66, 45);
		contentPane.add(subtractButton);
		subtractButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operator = "-";
				sb.append(operator);
				textField.setText(sb.toString());
				op = operator;
			}
		});

		addButton = new JButton("+");
		addButton.setBounds(358, 178, 66, 44);
		contentPane.add(addButton);
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operator = "+";
				sb.append(operator);
				textField.setText(sb.toString());
				op = operator;
			}
		});

		equalsbutton = new JButton("=");
		equalsbutton.setBounds(358, 233, 66, 44);
		contentPane.add(equalsbutton);
		equalsbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operator = "=";
				textField.setText("answer");
				
				String s = "" + sb.charAt(1);
				int x = Integer.parseInt(s);
				
				String s2 = "" + sb.charAt(4);
				int y = Integer.parseInt(s2);
				
				int z = 0;
				
				

				switch (op) {
				case "+":
					 z = x + y;
					
					textField.setText("" + z);
					break;
				case "-":
					z = x - y;
					textField.setText("" + z);
					break;
				case "*":
					z = x * y;
					textField.setText("" + z);
					break;
				case "/":
					z = x / y;
					textField.setText("" + z);
					break;
				case "%":
					z = x % y;
					textField.setText("" + z);
					break;

				}// end switch
			}
		});

		clearButton = new JButton("Clear");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
				sb = new StringBuilder("");

			}// clear button
		});
		clearButton.setBounds(34, 233, 204, 44);
		contentPane.add(clearButton);

		button0 = new JButton(" 0");
		button0.setBounds(250, 233, 98, 44);
		contentPane.add(button0);
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Operand one = new Operand(0);

				sb.append(one);
				textField.setText(sb.toString());

			}
		});

		button1 = new JButton("1");
		button1.setBounds(34, 67, 98, 44);
		contentPane.add(button1);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Operand one = new Operand(1);

				sb.append(one);
				textField.setText(sb.toString());

			}
		});

		button2 = new JButton("2");
		button2.setBounds(142, 67, 98, 44);
		contentPane.add(button2);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Operand one = new Operand(2);

				sb.append(one);
				textField.setText(sb.toString());

			}
		});

		button3 = new JButton("3");
		button3.setBounds(250, 67, 98, 44);
		contentPane.add(button3);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Operand one = new Operand(3);

				sb.append(one);
				textField.setText(sb.toString());

			}
		});

		button4 = new JButton("4");
		button4.setBounds(34, 123, 98, 44);
		contentPane.add(button4);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Operand one = new Operand(4);

				sb.append(one);
				textField.setText(sb.toString());

			}
		});

		button5 = new JButton("5");
		button5.setBounds(142, 123, 98, 44);
		contentPane.add(button5);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Operand one = new Operand(5);

				sb.append(one);

				textField.setText(sb.toString());

			}
		});

		button6 = new JButton("6");
		button6.setBounds(250, 123, 98, 44);
		contentPane.add(button6);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Operand one = new Operand(6);

				sb.append(one);

				textField.setText(sb.toString());

			}
		});

		button7 = new JButton("7");
		button7.setBounds(34, 178, 98, 44);
		contentPane.add(button7);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Operand one = new Operand(7);

				sb.append(one);

				textField.setText(sb.toString());

			}
		});

		button8 = new JButton("8");
		button8.setBounds(142, 178, 98, 44);
		contentPane.add(button8);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Operand one = new Operand(8);

				sb.append(one);
				textField.setText(sb.toString());

			}
		});

		button9 = new JButton("9");
		button9.setBounds(250, 178, 98, 44);
		contentPane.add(button9);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Operand one = new Operand(9);

				sb.append(one);
				textField.setText(sb.toString());

			}
		});
	}
}
