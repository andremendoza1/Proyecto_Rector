package crecimiento_bacteriano;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.ScrollPane;
import javax.swing.JTextArea;

public class Interfaz_CB extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_CB frame = new Interfaz_CB();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz_CB() {
		setBackground(new Color(152, 251, 152));
		setForeground(new Color(144, 238, 144));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HUAWEI\\Downloads\\CB.jpg"));
		setTitle("Crecimiento Bacteriano");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 506, 257);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setSelected(true);
		btnNewButton.setSelectedIcon(new ImageIcon("C:\\Users\\HUAWEI\\Downloads\\img_CB\\acerca-de (1)-PhotoRoom.png-PhotoRoom.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Informacion JFrame = new Informacion();
				JFrame.setVisible(true);
				JFrame.setLocationRelativeTo(null);
				
				
			}
		});
		btnNewButton.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\Downloads\\img_CB\\boton_press.png"));
		btnNewButton.setPressedIcon(new ImageIcon("C:\\Users\\HUAWEI\\Downloads\\img_CB\\boton_press.png"));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\Downloads\\acerca-de (1).png"));
		btnNewButton.setBounds(10, 33, 149, 143);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CrecimientoBacteriano JFrame = new CrecimientoBacteriano();
				JFrame.setVisible(true);
				JFrame.setLocationRelativeTo(null);
			}
		});
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setPressedIcon(new ImageIcon("C:\\Users\\HUAWEI\\Downloads\\img_CB\\boton_press2.png"));
		btnNewButton_1.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\Downloads\\img_CB\\boton_press2.png"));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\Downloads\\img_CB\\calculadora (1).png"));
		btnNewButton_1.setBounds(169, 33, 149, 143);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setRolloverIcon(new ImageIcon("C:\\Users\\HUAWEI\\Downloads\\img_CB\\cancelarprees.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\Downloads\\img_CB\\cancelar.png"));
		btnNewButton_2.setBounds(328, 33, 149, 143);
		contentPane.add(btnNewButton_2);
	}
}
