package connection;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class calculatorRP extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	private final JLabel lblNewLabel = new JLabel("New label");
	private final JLabel lblRpn = new JLabel("RPN");
	private JTable table;
	private final JTextField textField_1 = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorRP frame = new calculatorRP();
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
	public calculatorRP() {
		setAlwaysOnTop(true);
		setFont(new Font("Tahoma", Font.BOLD, 16));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 13, 437, 57);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// textField.setText("");
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 156, 60, 60);
		contentPane.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// textField.setText("");
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(84, 156, 60, 60);
		contentPane.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// textField.setText("");
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(158, 156, 60, 60);
		contentPane.add(btn9);

		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/*
				 * firstnum = Double.parseDouble(textField.getText());
				 * textField.setText("-"); operations ="-";
				 */
				String strs;
				strs = textField.getText();

				for (int i = 0; i < textField.getText().length(); i++) {
					if (textField.getText().charAt(i) == ' ') {
						strs = strs.substring(i + 1, textField.getText().length());
						secondnum = Double.parseDouble(strs);
						break;
					}

					if (i == textField.getText().length() - 1) {
						secondnum = Double.parseDouble(textField.getText());
					} /* op1 = Double.parseDouble(textField.getText()); */

				}
				/* secondnum = Double.parseDouble(textField.getText()); */
				/* firstnum = Double.parseDouble(textField.getText()); */
				result = firstnum - secondnum;
				answer = String.format("%.2f", result);
				textField.setText(answer + " ");
				firstnum = result;
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(232, 156, 60, 60);
		contentPane.add(btnSub);
		// --------------------ROW2------------------------
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// textField.setText("");
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 229, 60, 60);
		contentPane.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// textField.setText("");
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(84, 229, 60, 60);
		contentPane.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// textField.setText("");
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(158, 229, 60, 60);
		contentPane.add(btn6);

		JButton btnMut = new JButton("*");
		btnMut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/*
				 * firstnum = Double.parseDouble(textField.getText());
				 * textField.setText(""); operations ="*";
				 */
				String strm;
				strm = textField.getText();

				for (int i = 0; i < textField.getText().length(); i++) {
					if (textField.getText().charAt(i) == ' ') {
						strm = strm.substring(i + 1, textField.getText().length());
						secondnum = Double.parseDouble(strm);
						break;
					}

					if (i == textField.getText().length() - 1) {
						secondnum = Double.parseDouble(textField.getText());
					} /* op1 = Double.parseDouble(textField.getText()); */

				}

				/* secondnum = Double.parseDouble(textField.getText()); */
				/* firstnum = Double.parseDouble(textField.getText()); */
				result = firstnum * secondnum;
				answer = String.format("%.2f", result);
				textField.setText(answer + " ");
				firstnum = result;

			}
		});
		btnMut.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMut.setBounds(232, 229, 60, 60);
		contentPane.add(btnMut);

		// --------------------ROW3------------------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/*
				 * if(result==firstnum) {textField.setText("");
				 */
				/*
				 * String EnterNumber = textField.getText() + btn1.getText();
				 * textField.setText(EnterNumber);}
				 */

				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 302, 60, 60);
		contentPane.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// textField.setText("");
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(84, 302, 60, 60);
		contentPane.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// textField.setText("");
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(158, 302, 60, 60);
		contentPane.add(btn3);

		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/*
				 * firstnum = Double.parseDouble(textField.getText());
				 * textField.setText(""); operations ="/";
				 */
				String strd;
				strd = textField.getText();

				for (int i = 0; i < textField.getText().length(); i++) {
					if (textField.getText().charAt(i) == ' ') {
						strd = strd.substring(i + 1, textField.getText().length());
						secondnum = Double.parseDouble(strd);
						break;
					}

					if (i == textField.getText().length() - 1) {
						secondnum = Double.parseDouble(textField.getText());
					} /* op1 = Double.parseDouble(textField.getText()); */

				}
				/* secondnum = Double.parseDouble(textField.getText()); */
				/* firstnum = Double.parseDouble(textField.getText()); */
				result = firstnum / secondnum;
				answer = String.format("%.2f", result);
				textField.setText(answer + " ");
				firstnum = result;
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivide.setBounds(232, 302, 60, 60);
		contentPane.add(btnDivide);

		// --------------------ROW4------------------------
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 375, 60, 60);
		contentPane.add(btn0);

		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * String EnterNumber = textField.getText() + ".";
				 * textField.setText(EnterNumber);
				 */
				String temp = e.getActionCommand();
				String strdot = textField.getText();
				int k = 0;
				int j;
				for (j = 0; j < textField.getText().length(); j++) {
					if (textField.getText().charAt(j) == ' ') {
						k = 1;
						break;

					}
				}

				System.out.printf("j=%d\n", k);
				if (k == 0) {
					if (temp == ".")// 判断只能输入一个小数，这个放在actionPerformed里的
					{
						for (int i = 0; i < textField.getText().length(); i++) {
							if (textField.getText().charAt(i) == '.')
								break;
							if (i == textField.getText().length() - 1)
								textField.setText(textField.getText() + temp);
						}

					}
				}
				if (k == 1) {
					if (temp == ".")// 判断只能输入一个小数，这个放在actionPerformed里的
					{

						strdot = strdot.substring(j + 1, textField.getText().length());
						for (int i = 0; i < strdot.length(); i++) {
							if (strdot.charAt(i) == '.')
								break;
							if (i == strdot.length() - 1)
								textField.setText(textField.getText() + temp);
						}

					}
				}

				/*
				 * if(temp==".")//判断只能输入一个小数，这个放在actionPerformed里的 { for(int
				 * i=0;i<textField.getText().length();i++) { for(int
				 * j=0;j<textField.getText().length();j++) {
				 * if(textField.getText().charAt(j)=='/') break; }
				 * if(textField.getText().charAt(i)=='.') break;
				 * if(i==textField.getText().length()-1)
				 * textField.setText(textField.getText()+temp); }
				 * 
				 * }
				 */
				/*
				 * if(temp==".")//判断只能输入一个小数，这个放在actionPerformed里的 { for(int
				 * i=0;i<textField.getText().length();i++) {
				 * if(textField.getText().charAt(i)=='.') break;
				 * if(i==textField.getText().length()-1)
				 * textField.setText(textField.getText()+temp); }
				 * 
				 * }
				 */

			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(84, 375, 60, 60);
		contentPane.add(btnDot);

		JButton btnPM = new JButton("±");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPM.setBounds(158, 375, 60, 60);
		contentPane.add(btnPM);

		/*
		 * JButton btnEqual = new JButton("="); btnEqual.addActionListener(new
		 * ActionListener() { public void actionPerformed(ActionEvent e) {
		 * 
		 * String answer; secondnum = Double.parseDouble(textField.getText());
		 * if (operations == "+") { result =firstnum+ secondnum; answer =
		 * String.format("%.2f",result); textField.setText(answer);
		 * 
		 * } else if (operations == "-") { result =firstnum- secondnum; answer =
		 * String.format("%.2f",result); textField.setText(answer);
		 * 
		 * } else if (operations == "*") { result =firstnum* secondnum; answer =
		 * String.format("%.2f",result); textField.setText(answer);
		 * 
		 * } else if (operations == "/") { result =firstnum/ secondnum; answer =
		 * String.format("%.2f",result); textField.setText(answer);
		 * 
		 * } else if (operations == "%") { result =firstnum% secondnum; answer =
		 * String.format("%.2f",result); textField.setText(answer);
		 * 
		 * } } }); btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		 * btnEqual.setBounds(232, 375, 60, 60);
		 * frame.getContentPane().add(btnEqual);
		 */

		JButton btnBackspace = new JButton("\u2190");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String backspace = null;

				if (textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackspace.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackspace.setBounds(10, 83, 60, 60);
		contentPane.add(btnBackspace);

		JButton btnReset = new JButton("C");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(84, 83, 60, 60);
		contentPane.add(btnReset);

		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPercent.setBounds(158, 83, 60, 60);
		contentPane.add(btnPercent);

		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String strp;
				strp = textField.getText();

				for (int i = 0; i < textField.getText().length(); i++) {
					if (textField.getText().charAt(i) == ' ') {
						strp = strp.substring(i + 1, textField.getText().length());
						secondnum = Double.parseDouble(strp);
						break;
					}

					if (i == textField.getText().length() - 1) {
						secondnum = Double.parseDouble(textField.getText());
					} /* op1 = Double.parseDouble(textField.getText()); */

				}
				/* firstnum = Double.parseDouble(textField.getText()); */
				/* secondnum = Double.parseDouble(textField.getText()); */

				result = firstnum + secondnum;
				answer = String.format("%.2f", result);
				textField.setText(answer + " ");
				firstnum = result;
				/* operations ="+"; */
				/* String temp=e.getActionCommand(); */
				/*
				 * if(temp=="+")//判断只能输入一个小数，这个放在actionPerformed里的 { /* for(int
				 * i=0;i<textField.getText().length();i++) {
				 * 
				 * if(textField.getText().charAt(i)=='.') break;
				 * if(i==textField.getText().length()-1)
				 * textField.setText(textField.getText()+temp); }
				 */
				/*
				 * textField.setText(answer+"/"); }
				 */

				/*
				 * if(textField.getText().length()>0){ StringBuilder strB = new
				 * StringBuilder(textField.getText());
				 * strB.deleteCharAt(textField.getText().length() - 1);
				 * backspace = strB.toString(); textField.setText(backspace); }
				 */

			}
		});
		btnPlus.setBounds(232, 83, 60, 60);
		contentPane.add(btnPlus);

		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "enter";
				// double ops=0;
				int l1 = 1;
				System.out.printf("l1= d%", l1);
				if (textField.getText() != null) {
					l1 = 0;
					// firstnum=Double.parseDouble(String.valueOf(textField.getText()));
					System.out.printf("l1= d%", l1);

				}

				// firstnum=Double.parseDouble(String.valueOf(textField.getText()));

				/* textField.setText(String.valueOf(ops)); */
				textField.setText("");
				// firstnum=ops;
			}
		});
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEnter.setBounds(314, 83, 122, 277);
		contentPane.add(btnEnter);

		JButton btnNewButton = new JButton("switch");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// setVisible(false);
				calculator1 cal1 = new calculator1();
				cal1.setVisible(true);
			}
		});
		btnNewButton.setBounds(232, 375, 204, 60);
		contentPane.add(btnNewButton);
		lblNewLabel.setBounds(29, -36, 135, 36);
		contentPane.add(lblNewLabel);
		lblRpn.setBounds(48, -36, 135, 36);
		contentPane.add(lblRpn);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(40, -36, 125, 36);
		contentPane.add(lblNewLabel_1);

		table = new JTable();
		table.setBounds(100, 13, 1, 1);
		contentPane.add(table);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(80, 0, -30, 24);
		contentPane.add(textPane);
		textField_1.setBounds(45, -36, 80, 36);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblRpn_1 = new JLabel("RPN");
		lblRpn_1.setBounds(39, -4, 72, 18);
		contentPane.add(lblRpn_1);

	}
}
