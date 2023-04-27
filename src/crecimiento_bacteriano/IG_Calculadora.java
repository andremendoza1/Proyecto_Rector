package crecimiento_bacteriano;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.EventQueue;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

public class IG_Calculadora extends Operaciones  {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField CajaResultado;
	public JTextField CajaOperacion;
	public JRadioButton rbtn_sexages,rbtn_Radianes;
	public JLabel LabelMemoria;
	boolean igual,inicio = true,ope1,ope2;
	double a,b,c,valor1,valor2,cos,acos,sin,asin,tan,atan,resultado,memoria = 0;
	
	
	
	
     String cadena,funcion,tipoOperaciones;
     
	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IG_Calculadora frame = new IG_Calculadora();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public IG_Calculadora() {
		setAlwaysOnTop(true);
		setBackground(SystemColor.windowBorder);
		setForeground(SystemColor.activeCaption);
		setTitle("CALCULADORA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 565);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		CajaResultado = new JTextField();
		CajaResultado.setBorder(null);
		CajaResultado.setBounds(0, 77, 724, 60);
		CajaResultado.setFont(new Font("Tahoma", Font.BOLD, 24));
		CajaResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		CajaResultado.setText("0");
		contentPane.add(CajaResultado);
		CajaResultado.setColumns(10);
		//BOTON CE
		JButton btnNewButton = new JButton("CE");
		btnNewButton.setBorder(null);
		btnNewButton.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton.setBounds(441, 172, 60, 60);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText("0");
				CajaOperacion.setText("");
				inicio = true;
				funcion = "";			
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("/");
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4.setBounds(657, 172, 60, 60);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				igual = true;
				inicio = true;
				if(ope1 = true) {
					valor1 = Double.parseDouble(CajaResultado.getText());
					CajaOperacion.setText("");
					CajaOperacion.setText(CajaResultado.getText()+ "/");
					ope1 = false;
				}else {
					if(ope2 = true) {
						valor2 = Double.parseDouble(CajaResultado.getText());
						CajaOperacion.setText("");
						CajaOperacion.setText(CajaResultado.getText()+ "/");
						ope2 = false;
					
				}else {
					CajaOperacion.setText(CajaResultado.getText()+ "/");
					Operacion(resultado,valor2);
				}
					}
				tipoOperaciones = "/";
				
				
			
			}
		});
		contentPane.add(btnNewButton_4);
		//Cambio de signo
		JButton btnNewButton_2 = new JButton("+/-");
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_2.setBounds(511, 172, 60, 60);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = 0, n2, n3;
				n2 = Double.parseDouble(CajaResultado.getText());
				n3 = n1 - n2;
				CajaResultado.setText(n3 + " ");
				
			}
		});
		contentPane.add(btnNewButton_2);
		//boton porcentaje
		JButton btnNewButton_3 = new JButton("%");
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_3.setBounds(581, 172, 60, 60);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(CajaResultado.getText());
				CajaOperacion.setText(CajaOperacion.getText()+ CajaResultado.getText());
				CajaResultado.setText((valor1*valor2)/100+ " ");
				igual =true;
			}
		});
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4_1 = new JButton("(");
		btnNewButton_4_1.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_1.setBorder(null);
		btnNewButton_4_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNewButton_4_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_1.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_1.setBounds(20, 173, 60, 60);
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("mc");
		btnNewButton_4_2.setBorder(null);
		btnNewButton_4_2.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_2.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_2.setBounds(158, 173, 60, 60);
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
			}
		});
		contentPane.add(btnNewButton_4_2);
		
		JButton btnNewButton_4_3 = new JButton("m+");
		btnNewButton_4_3.setBorder(null);
		btnNewButton_4_3.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_3.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_3.setBounds(231, 172, 60, 60);
		btnNewButton_4_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"m+");
			}
		});
		contentPane.add(btnNewButton_4_3);
		
		JButton btnNewButton_4_4 = new JButton("*");
		btnNewButton_4_4.setBorder(null);
		btnNewButton_4_4.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_4.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_4.setBounds(657, 243, 60, 60);
		btnNewButton_4_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				igual = true;
				inicio = true;
				if(ope1 = true) {
					valor1 = Double.parseDouble(CajaResultado.getText());
					CajaOperacion.setText("");
					CajaOperacion.setText(CajaResultado.getText()+ "*");
					ope1 = false;
				}else {
					if(ope2 = true) {
						valor2 = Double.parseDouble(CajaResultado.getText());
						CajaOperacion.setText("");
						CajaOperacion.setText(CajaResultado.getText()+ "*");
						ope2 = false;
					
				}else {
					CajaOperacion.setText(CajaResultado.getText()+ "*");
					Operacion(resultado,valor2);
				}
					}
				tipoOperaciones = "*";
			}
		});
		contentPane.add(btnNewButton_4_4);
		//Boton retoceso
		JButton btnNewButton_4_5 = new JButton("<--");
		btnNewButton_4_5.setBorder(null);
		btnNewButton_4_5.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_5.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_5.setBounds(301, 172, 60, 60);
		btnNewButton_4_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if  (CajaResultado.getText().length()>0) {
				CajaResultado.setText(CajaResultado.getText().substring(0,CajaResultado.getText().length()-1));
				if (CajaResultado.getText().length() == 0) {
					CajaResultado.setText("0");
					inicio = true;
					
				}
				
			}
			}
		});
		contentPane.add(btnNewButton_4_5);
		
		JButton btnNewButton_4_6 = new JButton(")");
		btnNewButton_4_6.setBorder(null);
		btnNewButton_4_6.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_6.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_6.setBounds(90, 173, 60, 60);
		btnNewButton_4_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		contentPane.add(btnNewButton_4_6);
		//BOTON C
		JButton btnNewButton_4_7 = new JButton("C");
		btnNewButton_4_7.setBorder(null);
		btnNewButton_4_7.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_7.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_7.setBounds(371, 172, 60, 60);
		btnNewButton_4_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText("0");
				CajaOperacion.setText("");
				inicio = true;
				funcion = "";
				ope1 = true;
				ope2 = true;
				igual = true;
				valor1= 0;
				valor2 =0;
				resultado = 0;
			}
		});
		contentPane.add(btnNewButton_4_7);
		
		JButton btnNewButton_4_8 = new JButton("-");
		btnNewButton_4_8.setBorder(null);
		btnNewButton_4_8.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_8.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_8.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_8.setBounds(657, 314, 60, 60);
		btnNewButton_4_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				igual = true; 
				inicio = true;
				if(ope1 = true) {
					valor1 = Double.parseDouble(CajaResultado.getText());
					CajaOperacion.setText("");
					CajaOperacion.setText(CajaResultado.getText()+ "-");
					ope1 = false;
				}else {
					if(ope2 = true) {
						valor2 = Double.parseDouble(CajaResultado.getText());
						CajaOperacion.setText("");
						CajaOperacion.setText(CajaResultado.getText()+ "-");
						ope2 = false;
					
				}else {
					CajaOperacion.setText(CajaResultado.getText()+ "-");
					Operacion(resultado,valor2);
				}
					}
				tipoOperaciones = "-";
			}
		});
		contentPane.add(btnNewButton_4_8);
		
		JButton btnNewButton_4_9 = new JButton("1");
		btnNewButton_4_9.setBorder(null);
		btnNewButton_4_9.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_9.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_9.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\botonNumeros.png"));
		btnNewButton_4_9.setBounds(441, 383, 60, 60);
		btnNewButton_4_9.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_4_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio == true) {
				CajaResultado.setText("");	
				CajaResultado.setText("1");
				inicio = false;
				}else {
					CajaResultado.setText(CajaResultado.getText()+"1");
				}
				
			}
		});
		contentPane.add(btnNewButton_4_9);
		
		JButton btnNewButton_4_10 = new JButton("2");
		btnNewButton_4_10.setBorder(null);
		btnNewButton_4_10.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_10.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_10.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\botonNumeros.png"));
		btnNewButton_4_10.setBounds(511, 383, 60, 60);
		btnNewButton_4_10.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_4_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio == true) {
					CajaResultado.setText("");	
					CajaResultado.setText("2");
					inicio = false;
					}else {
						CajaResultado.setText(CajaResultado.getText()+"2");
					}
			}
		});
		contentPane.add(btnNewButton_4_10);
		
		JButton btnNewButton_4_11 = new JButton("3");
		btnNewButton_4_11.setBorder(null);
		btnNewButton_4_11.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_11.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_11.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\botonNumeros.png"));
		btnNewButton_4_11.setBounds(581, 383, 60, 60);
		btnNewButton_4_11.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_4_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio == true) {
					CajaResultado.setText("");	
					CajaResultado.setText("3");
					inicio = false;
					}else {
						CajaResultado.setText(CajaResultado.getText()+"3");
					}
			}
		});
		contentPane.add(btnNewButton_4_11);
		
		JButton btnNewButton_4_12 = new JButton("+");
		btnNewButton_4_12.setBorder(null);
		btnNewButton_4_12.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_12.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_12.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_12.setBounds(657, 386, 60, 60);
		btnNewButton_4_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				igual = true;
				inicio = true;
				if(ope1 = true) {
					valor1 = Double.parseDouble(CajaResultado.getText());
					CajaOperacion.setText("");
					CajaOperacion.setText(CajaResultado.getText()+ "+");
					ope1 = false;
				}else {
					if(ope2 = true) {
						valor2 = Double.parseDouble(CajaResultado.getText());
					
						CajaOperacion.setText(CajaResultado.getText()+ "+");
						ope2 = false;
					
				}else {
					CajaOperacion.setText(CajaResultado.getText()+ "+");
					Operacion(resultado,valor2);
				}
					}
				tipoOperaciones = "+";
			}
		});
		contentPane.add(btnNewButton_4_12);
		
		JButton btnNewButton_4_13 = new JButton("0");
		btnNewButton_4_13.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\b0.png"));
		btnNewButton_4_13.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_13.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton0.png"));
		btnNewButton_4_13.setBorder(null);
		btnNewButton_4_13.setBounds(442, 456, 129, 60);
		btnNewButton_4_13.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_4_13.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio == true) {
					CajaResultado.setText("");	
					CajaResultado.setText("0");
					inicio = false;
					}else {
						CajaResultado.setText(CajaResultado.getText()+"0");
					}
			}
		});
		contentPane.add(btnNewButton_4_13);
		//punto decimal
		JButton btnNewButton_4_14 = new JButton(".");
		btnNewButton_4_14.setBorder(null);
		btnNewButton_4_14.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_14.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_14.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_14.setBounds(581, 456, 60, 60);
		btnNewButton_4_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CajaResultado.getText().contains(".")) {
					
				}else {
					CajaResultado.setText(CajaResultado.getText()+".");
					inicio = false;
				}
			}
		});
		contentPane.add(btnNewButton_4_14);
		
		JButton btnNewButton_4_15 = new JButton("=");
		btnNewButton_4_15.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\opaco.png"));
		btnNewButton_4_15.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15.setBorder(null);
		btnNewButton_4_15.setBounds(657, 456, 60, 60);
		btnNewButton_4_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicio = true;
				ope1 = true;
				if (igual = true ) {
					if (tipoOperaciones == null) {
						
					}else {
						valor2 = Double.parseDouble(CajaResultado.getText());
						CajaOperacion.setText(CajaOperacion.getText() + CajaResultado.getText());
						Operacion(valor1,valor2);
						igual = false;
					}
				}else {
					CajaOperacion.setText("");
					Operacion(valor1,valor2);
				}
				
			}
		});
		contentPane.add(btnNewButton_4_15);
		
		JButton btnNewButton_4_15_1 = new JButton("Rand");
		btnNewButton_4_15_1.setBorder(null);
		btnNewButton_4_15_1.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_1.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_1.setBounds(371, 456, 60, 60);
		btnNewButton_4_15_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_4_15_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		contentPane.add(btnNewButton_4_15_1);
		// Boton PI
		JButton btnNewButton_4_15_2 = new JButton("pi");
		btnNewButton_4_15_2.setBorder(null);
		btnNewButton_4_15_2.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_2.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_2.setBounds(301, 456, 60, 60);
		btnNewButton_4_15_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_15_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaOperacion.setText("PI ");
				CajaResultado.setText(Math.PI + " ");
			}
		});
		contentPane.add(btnNewButton_4_15_2);
		
		JButton btnNewButton_4_15_3 = new JButton("atan");
		btnNewButton_4_15_3.setBorder(null);
		btnNewButton_4_15_3.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_3.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_3.setBounds(231, 456, 60, 60);
		btnNewButton_4_15_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4_15_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcion = "atan";
				Trigonometria();
			}
		});
		contentPane.add(btnNewButton_4_15_3);
		
		JButton btnNewButton_4_15_4 = new JButton("acos");
		btnNewButton_4_15_4.setBorder(null);
		btnNewButton_4_15_4.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_4.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_4.setBounds(158, 456, 60, 60);
		btnNewButton_4_15_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4_15_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcion = "acos";
				Trigonometria();
			}
		});
		contentPane.add(btnNewButton_4_15_4);
		
		JButton btnNewButton_4_15_5 = new JButton("asin");
		btnNewButton_4_15_5.setBorder(null);
		btnNewButton_4_15_5.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_5.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_5.setBounds(90, 455, 60, 60);
		btnNewButton_4_15_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4_15_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcion = "asin";
				Trigonometria();
			}
		});
		contentPane.add(btnNewButton_4_15_5);
		
		JButton btnNewButton_4_15_6 = new JButton("Rad");
		btnNewButton_4_15_6.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_6.setBorder(null);
		btnNewButton_4_15_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_6.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_6.setBounds(20, 455, 60, 60);
		btnNewButton_4_15_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4_15_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Rad");
			}
		});
		contentPane.add(btnNewButton_4_15_6);
		
		JButton btnNewButton_4_15_7 = new JButton("x!");
		btnNewButton_4_15_7.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_7.setBorder(null);
		btnNewButton_4_15_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_7.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_7.setBounds(20, 384, 60, 60);
		btnNewButton_4_15_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_15_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a =1;
				valor1 = Double.parseDouble(CajaResultado.getText());
				CajaOperacion.setText("fact("+valor1+")");
				for (b = 1; b<= valor1;b++) {
					a = a*b;
				}
				CajaResultado.setText(a + " ");
			}
		});
		contentPane.add(btnNewButton_4_15_7);
		
		JButton btnNewButton_4_15_8 = new JButton("sin");
		btnNewButton_4_15_8.setBorder(null);
		btnNewButton_4_15_8.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_8.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_8.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_8.setBounds(90, 384, 60, 60);
		btnNewButton_4_15_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_15_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcion = "sin";
				Trigonometria();
			}
		});
		contentPane.add(btnNewButton_4_15_8);
		//Boton coseno
		JButton btnNewButton_4_15_9 = new JButton("cos");
		btnNewButton_4_15_9.setBorder(null);
		btnNewButton_4_15_9.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_9.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_9.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_9.setBounds(158, 384, 60, 60);
		btnNewButton_4_15_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_15_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcion = "cos";
				Trigonometria();
				
			}
		});
		contentPane.add(btnNewButton_4_15_9);
		
		JButton btnNewButton_4_15_10 = new JButton("tan");
		btnNewButton_4_15_10.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_10.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_10.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_10.setBounds(231, 383, 60, 60);
		btnNewButton_4_15_10.setBorder(null);
		btnNewButton_4_15_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_15_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcion = "tan";
				Trigonometria();
			}
		});
		contentPane.add(btnNewButton_4_15_10);
		
		JButton btnNewButton_4_15_11 = new JButton("e");
		btnNewButton_4_15_11.setBorder(null);
		btnNewButton_4_15_11.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_11.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_11.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_11.setBounds(301, 383, 60, 60);
		btnNewButton_4_15_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_15_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 CajaOperacion.setText("E");
			 CajaResultado.setText(Math.E + " ");
			}
		});
		contentPane.add(btnNewButton_4_15_11);
		
		JButton btnNewButton_4_15_12 = new JButton("Exp");
		btnNewButton_4_15_12.setBorder(null);
		btnNewButton_4_15_12.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_12.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_12.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_12.setBounds(371, 383, 60, 60);
		btnNewButton_4_15_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_15_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 =Double.parseDouble(CajaResultado.getText());
				CajaResultado.setText(Math.exp(valor1)+ " ");
			}
		});
		contentPane.add(btnNewButton_4_15_12);
		
		JButton btnNewButton_4_15_13 = new JButton("1/x");
		btnNewButton_4_15_13.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_13.setBorder(null);
		btnNewButton_4_15_13.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_13.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_13.setBounds(20, 315, 60, 60);
		btnNewButton_4_15_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4_15_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				valor1 = Double.parseDouble(CajaResultado.getText());
				CajaOperacion.setText("reciproc("+ valor1 +")");
				CajaResultado.setText(1/valor1 + "");
			}
		});
		contentPane.add(btnNewButton_4_15_13);
		
		JButton btnNewButton_4_15_14 = new JButton("2√x");
		btnNewButton_4_15_14.setBorder(null);
		btnNewButton_4_15_14.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_14.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_14.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_14.setBounds(90, 315, 60, 60);
		btnNewButton_4_15_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4_15_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(CajaResultado.getText());
				CajaOperacion.setText("cuadrado (" +valor1 + ")");
				CajaResultado.setText(Math.pow(valor1, 2)+ " ");
			}
		});
		contentPane.add(btnNewButton_4_15_14);
		
		JButton btnNewButton_4_15_15 = new JButton("3√x");
		btnNewButton_4_15_15.setBorder(null);
		btnNewButton_4_15_15.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_15.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_15.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_15.setBounds(158, 315, 60, 60);
		btnNewButton_4_15_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4_15_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(CajaResultado.getText());
				a =1;
				b=3;
				c=a/b;
				CajaOperacion.setText("raiz^3 ("+ valor1+ ")");
				CajaResultado.setText(Math.pow(valor1, c) + " ");
				
			}
		});
		contentPane.add(btnNewButton_4_15_15);
		
		JButton btnNewButton_4_15_16 = new JButton("y√x");
		btnNewButton_4_15_16.setBorder(null);
		btnNewButton_4_15_16.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_16.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_16.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_16.setBounds(231, 314, 60, 60);
		btnNewButton_4_15_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4_15_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicio = true;
				valor1 = Double.parseDouble(CajaResultado.getText());
				CajaOperacion.setText(valor1 + "yroot");
				tipoOperaciones = "raizx";
				ope1 = false;
				igual = true;
			}
		});
		contentPane.add(btnNewButton_4_15_16);
		
		JButton btnNewButton_4_15_17 = new JButton("In");
		btnNewButton_4_15_17.setBorder(null);
		btnNewButton_4_15_17.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_17.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_17.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_17.setBounds(301, 314, 60, 60);
		btnNewButton_4_15_17.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_15_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"In");
			}
		});
		contentPane.add(btnNewButton_4_15_17);
		
		JButton btnNewButton_4_15_18 = new JButton("log");
		btnNewButton_4_15_18.setBorder(null);
		btnNewButton_4_15_18.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_18.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_18.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_18.setBounds(371, 314, 60, 60);
		btnNewButton_4_15_18.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_15_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valor1 = Double.parseDouble(CajaResultado.getText());
				CajaOperacion.setText("log (" +valor1 + ")");
				CajaResultado.setText(Math.log(valor1)+ " ");
			}
		});
		contentPane.add(btnNewButton_4_15_18);
		
		JButton btnNewButton_4_15_19 = new JButton("4");
		btnNewButton_4_15_19.setBorder(null);
		btnNewButton_4_15_19.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_19.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_19.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\botonNumeros.png"));
		btnNewButton_4_15_19.setBounds(441, 314, 60, 60);
		btnNewButton_4_15_19.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_4_15_19.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_15_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio == true) {
					CajaResultado.setText("");	
					CajaResultado.setText("4");
					inicio = false;
					}else {
						CajaResultado.setText(CajaResultado.getText()+"4");
					}
			}
		});
		contentPane.add(btnNewButton_4_15_19);
		
		JButton btnNewButton_4_15_20 = new JButton("5");
		btnNewButton_4_15_20.setBorder(null);
		btnNewButton_4_15_20.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_20.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_20.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\botonNumeros.png"));
		btnNewButton_4_15_20.setBounds(511, 314, 60, 60);
		btnNewButton_4_15_20.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_4_15_20.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_15_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio == true) {
					CajaResultado.setText("");	
					CajaResultado.setText("5");
					inicio = false;
					}else {
						CajaResultado.setText(CajaResultado.getText()+"5");
					}
			}
		});
		contentPane.add(btnNewButton_4_15_20);
		
		JButton btnNewButton_4_15_21 = new JButton("6");
		btnNewButton_4_15_21.setBorder(null);
		btnNewButton_4_15_21.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_21.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_21.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\botonNumeros.png"));
		btnNewButton_4_15_21.setBounds(581, 314, 60, 60);
		btnNewButton_4_15_21.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_4_15_21.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_15_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio == true) {
					CajaResultado.setText("");	
					CajaResultado.setText("6");
					inicio = false;
					}else {
						CajaResultado.setText(CajaResultado.getText()+"6");
					}
			}
		});
		contentPane.add(btnNewButton_4_15_21);
		
		JButton btnNewButton_4_15_22 = new JButton("9");
		btnNewButton_4_15_22.setBorder(null);
		btnNewButton_4_15_22.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_22.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_22.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\botonNumeros.png"));
		btnNewButton_4_15_22.setBounds(581, 243, 60, 60);
		btnNewButton_4_15_22.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_4_15_22.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_15_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio == true) {
					CajaResultado.setText("");	
					CajaResultado.setText("9");
					inicio = false;
					}else {
						CajaResultado.setText(CajaResultado.getText()+"9");
					}
			}
		});
		contentPane.add(btnNewButton_4_15_22);
		
		JButton btnNewButton_4_15_23 = new JButton("8");
		btnNewButton_4_15_23.setBorder(null);
		btnNewButton_4_15_23.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_23.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_23.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\botonNumeros.png"));
		btnNewButton_4_15_23.setBounds(511, 243, 60, 60);
		btnNewButton_4_15_23.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_4_15_23.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_15_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio == true) {
					CajaResultado.setText("");	
					CajaResultado.setText("8");
					inicio = false;
					}else {
						CajaResultado.setText(CajaResultado.getText()+"8");
					}
			}
		});
		contentPane.add(btnNewButton_4_15_23);
		
		JButton btnNewButton_4_15_24 = new JButton("7");
		btnNewButton_4_15_24.setBorder(null);
		btnNewButton_4_15_24.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_24.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_24.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\botonNumeros.png"));
		btnNewButton_4_15_24.setBounds(441, 243, 60, 60);
		btnNewButton_4_15_24.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_4_15_24.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_15_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inicio == true) {
					CajaResultado.setText("");	
					CajaResultado.setText("7");
					inicio = false;
					}else {
						CajaResultado.setText(CajaResultado.getText()+"7");
					}
			}
		});
		contentPane.add(btnNewButton_4_15_24);
		
		JButton btnNewButton_4_15_25 = new JButton("10^x");
		btnNewButton_4_15_25.setBorder(null);
		btnNewButton_4_15_25.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_25.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_25.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_25.setBounds(371, 243, 60, 60);
		btnNewButton_4_15_25.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4_15_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(CajaResultado.getText());
				CajaOperacion.setText("10^x"+valor1 +"^");
				CajaResultado.setText(Math.pow(10, valor1)+ " ");
				
			}
		});
		contentPane.add(btnNewButton_4_15_25);
		
		JButton btnNewButton_4_15_26 = new JButton("x^-1");
		btnNewButton_4_15_26.setBorder(null);
		btnNewButton_4_15_26.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_26.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_26.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_26.setBounds(301, 243, 60, 60);
		btnNewButton_4_15_26.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_4_15_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 valor1 = Double.parseDouble(CajaResultado.getText());
			 CajaOperacion.setText(valor1 + " ^-1 ");
			 CajaResultado.setText(Math.pow(valor1, -1)+ " ");
			}
		});
		contentPane.add(btnNewButton_4_15_26);
		
		JButton btnNewButton_4_15_27 = new JButton("x^(y)");
		btnNewButton_4_15_27.setBorder(null);
		btnNewButton_4_15_27.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_27.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_27.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_27.setBounds(231, 243, 60, 60);
		btnNewButton_4_15_27.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_4_15_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicio = true;
				valor1 = Double.parseDouble(CajaResultado.getText());
				CajaOperacion.setText(valor1 +"^");
				tipoOperaciones = "potencia";
				ope1 = false;
				igual = true;
				
			}
		});
		contentPane.add(btnNewButton_4_15_27);
		
		JButton btnNewButton_4_15_28 = new JButton("χ³");
		btnNewButton_4_15_28.setBorder(null);
		btnNewButton_4_15_28.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_28.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_28.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_28.setBounds(158, 244, 60, 60);
		btnNewButton_4_15_28.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_15_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(CajaResultado.getText());
				CajaOperacion.setText("cube (" +valor1 + ")");
				CajaResultado.setText(Math.pow(valor1, 3)+ " ");
			}
		});
		contentPane.add(btnNewButton_4_15_28);
		
		JButton btnNewButton_4_15_29 = new JButton("χ²");
		btnNewButton_4_15_29.setBorder(null);
		btnNewButton_4_15_29.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_29.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_29.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_29.setBounds(90, 244, 60, 60);
		btnNewButton_4_15_29.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_15_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(CajaResultado.getText());
				CajaOperacion.setText("cuadrado (" +valor1 + ")");
				CajaResultado.setText(Math.pow(valor1, 2)+ " ");
			}
		});
		contentPane.add(btnNewButton_4_15_29);
		//Boton raiz
		JButton btnNewButton_4_15_30 = new JButton("√");
		btnNewButton_4_15_30.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\press2.png"));
		btnNewButton_4_15_30.setBorder(null);
		btnNewButton_4_15_30.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4_15_30.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\OneDrive - UTC\\UNIVERSIDAD\\4to CUATRIMESTRE\\Programacon Orienta Objetos\\eclipse\\calculadora\\src\\calculadora\\img\\boton1.png"));
		btnNewButton_4_15_30.setBounds(20, 244, 60, 60);
		btnNewButton_4_15_30.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4_15_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(CajaResultado.getText());
				  if (valor1 >=0) {
					  CajaOperacion.setText("sqrt(" + valor1+ ")");
					  CajaResultado.setText(Math.sqrt(valor1)+ " ");
				  }else {
					  CajaOperacion.setText("Error");
				  }
				
			}
		});
		contentPane.add(btnNewButton_4_15_30);
		
		CajaOperacion = new JTextField();
		CajaOperacion.setBorder(null);
		CajaOperacion.setBounds(0, 36, 724, 37);
		CajaOperacion.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(CajaOperacion);
		CajaOperacion.setColumns(10);
		
		JButton btnPrimerOrden = new JButton("Crecimiento Bacteriano");
		btnPrimerOrden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz_CB frame = new Interfaz_CB();
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				
				
			}
		});
		btnPrimerOrden.setBounds(257, 136, 227, 35);
		contentPane.add(btnPrimerOrden);
		
		JLabel LabelMemoria = new JLabel("M");
		LabelMemoria.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		LabelMemoria.setHorizontalAlignment(SwingConstants.CENTER);
		LabelMemoria.setBounds(549, 14, 22, 23);
		contentPane.add(LabelMemoria);
	}
	
	public void Trigonometria() {
		
	
			
			switch(funcion) {
			  //Seno
			case "sin":
				valor1 = Double.parseDouble(CajaResultado.getText());
				CajaOperacion.setText("sin (" + valor1 + ")");
				sin = Math.sin(Math.PI*(valor1)/180);
				CajaResultado.setText(sin+ " ");
				break;
				  //seno inverso
				case "asin":
					valor1 = Double.parseDouble(CajaResultado.getText());
					CajaOperacion.setText("asin (" + valor1 + ")");
					asin = Math.asin(valor1)*180/ Math.PI;
					CajaResultado.setText(asin+ " ");
					break;
					//coseno 
				case "cos":
					valor1 = Double.parseDouble(CajaResultado.getText());
					CajaOperacion.setText("cos (" + valor1 + ")");
					cos = Math.cos(Math.PI*(valor1)/180);
					CajaResultado.setText(cos+ " ");
					break;
					  //cos inverso
					case "acos":
						valor1 = Double.parseDouble(CajaResultado.getText());
						CajaOperacion.setText("acos (" + valor1 + ")");
						acos = Math.acos(valor1)*180/ Math.PI;
						CajaResultado.setText(acos+ " ");
						break;
						//tangente
					case "tan":
						valor1 = Double.parseDouble(CajaResultado.getText());
						CajaOperacion.setText("tan (" + valor1 + ")");
						tan = Math.tan(Math.PI*(valor1)/180);
						CajaResultado.setText(tan+ " ");
						break;
						  //atan inverso
						case "atan":
							valor1 = Double.parseDouble(CajaResultado.getText());
							CajaOperacion.setText("atan (" + valor1 + ")");
							atan = Math.atan(valor1)*180/ Math.PI;
							CajaResultado.setText(atan+ " ");
							break;
				
			
			}
	
			}
		
	
	   void Operacion(double valor1, double valor2) {
	    	switch(tipoOperaciones) {
	    	//SUMA
	    	case "+":
	    		resultado = valor1 + valor2;
	     		CajaResultado.setText(resultado + "");
	    		valor1 = Double.parseDouble(CajaResultado.getText());
	    		break;
	    		//RESTA
	    	case "-":
	    		resultado = valor1 - valor2;
	    		CajaResultado.setText(resultado + "");
	    		valor1 = Double.parseDouble(CajaResultado.getText());
	    		break;
	    		//MULTIPLICACION
	    	case "*":
	    		resultado = valor1 * valor2;
	    		CajaResultado.setText(resultado + "");
	    		valor1 = Double.parseDouble(CajaResultado.getText());
	    		break;
	    		//DIVISION
	    	case "/":
	    		if (valor2 == 0) {
	    			CajaResultado.setText("ERROR");
	    		}else {
	    		resultado = valor1 / valor2;
	    		CajaResultado.setText(resultado + "");
	    		valor1 = Double.parseDouble(CajaResultado.getText());
	    		break;
	    		
	    			
	    		}
	    	case "potencia":
	    		resultado = Math.pow(valor1, valor2);
	    		CajaResultado.setText(resultado + "");
	    		break;
	    	case "raizx":
	    		if (valor2 <= 0) {
	    		CajaResultado.setText("error");
	    		break;
	    		}else {
	    			CajaOperacion.setText(valor2 + "yroot ");
	    			a =1;
	    			c =a/valor2;
	    			CajaResultado.setText(Math.pow(valor1, c)+ " ");
	    			break;
	    			
	    		}
	    		
	    		}
	    		
	    	}
	   }
