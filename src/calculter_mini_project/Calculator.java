//package calculter_mini_project;
// 
//import java.awt.*;
//import java.awt.event.*;
//
//public class Calculator extends Frame implements ActionListener {
//
//			double a, b, c, memory;
//			int operator;
//
//			TextField t1;
//			Button[] num = new Button[10];
//
//			Button addBtn;
//			Button sub;
//			Button mul;
//			Button div;
//			Button equal;
//			Button dot;
//			Button clear;
//			Button mr;
//			Button mplus;
//
//			public Calculator() {
//
//				setLayout(new GridLayout(6, 1));
//				setSize(400, 400);
//				setTitle("Calculator");
//
//				t1 = new TextField();
//				t1.setFont(new Font("Arial", Font.BOLD, 20));
//				add(t1);
//
//				Panel[] panels = new Panel[5];
//				for (int i = 0; i < panels.length; i++) {
//					panels[i] = new Panel(new GridLayout(1, 4));
//					add(panels[i]);
//				}
//
//				for (int i = 0; i <= 9; i++) {
//					num[i] = new Button(String.valueOf(i));
//					num[i].setFont(new Font("Arial", Font.BOLD, 30));
//					num[i].addActionListener(this);
//				}
//
//				addBtn = new Button("+");
//				sub = new Button("-");
//				mul = new Button("*");
//				div = new Button("/");
//				equal = new Button("=");
//				dot = new Button(".");
//				clear = new Button("C");
//				mr = new Button("MR");
//				mplus = new Button("M+");
//
//				Button[] ops = { addBtn, sub, mul, div, equal, dot, clear, mr, mplus };
//				for (Button b : ops) {
//					b.setFont(new Font("Arial", Font.BOLD, 20));
//					b.addActionListener(this);
//				}
//
//				panels[0].add(num[1]);
//				panels[0].add(num[2]);
//				panels[0].add(num[3]);
//				panels[0].add(addBtn);
//
//				panels[1].add(num[4]);
//				panels[1].add(num[5]);
//				panels[1].add(num[6]);
//				panels[1].add(sub);
//
//				panels[2].add(num[7]);
//				panels[2].add(num[8]);
//				panels[2].add(num[9]);
//				panels[2].add(mul);
//
//				panels[3].add(num[0]);
//				panels[3].add(dot);
//				panels[3].add(equal);
//				panels[3].add(div);
//
//				panels[4].add(clear);
//				panels[4].add(mr);
//				panels[4].add(mplus);
//
//				addWindowListener(new WindowAdapter() {
//					@Override
//					public void windowClosing(WindowEvent e) {
//						dispose();
//					}
//				});
//
//				setVisible(true);
//			}
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//
//				for (int i = 0; i <= 9; i++) {
//					if (e.getSource() == num[i]) {
//						t1.setText(t1.getText() + i);
//						return;
//					}
//				}
//
//				if (e.getSource() == dot) {
//					t1.setText(t1.getText() + ".");
//				} else if (e.getSource() == add) {
//					a = Double.parseDouble(t1.getText());
//					operator = 1;
//					t1.setText("");
//				} else if (e.getSource() == sub) {
//					a = Double.parseDouble(t1.getText());
//					operator = 2;
//					t1.setText("");
//				} else if (e.getSource() == mul) {
//					a = Double.parseDouble(t1.getText());
//					operator = 3;
//					t1.setText("");
//				} else if (e.getSource() == div) {
//					a = Double.parseDouble(t1.getText());
//					operator = 4;
//					t1.setText("");
//				} else if (e.getSource() == equal) {
//
//					b = Double.parseDouble(t1.getText());
//
//					switch (operator) {
//					case 1:
//						c = a + b;
//						break;
//					case 2:
//						c = a - b;
//						break;
//					case 3:
//						c = a * b;
//						break;
//					case 4:
//						c = a / b;
//						break;
//					}
//
//					t1.setText(String.valueOf(c));
//
//				} else if (e.getSource() == clear) {
//					t1.setText("");
//				} else if (e.getSource() == mr) {
//					t1.setText(String.valueOf(memory));
//				} else if (e.getSource() == mplus) {
//					memory = Double.parseDouble(t1.getText());
//				}
//			}
//
//			public static void main(String[] args) {
//				new Calculator();
//			}
//		}
