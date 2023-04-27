package crecimiento_bacteriano;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.ScrollPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Toolkit;

public class Informacion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Informacion frame = new Informacion();
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
	public Informacion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HUAWEI\\Downloads\\img_CB\\CB.jpg"));
		setTitle("Informacion");
		setBounds(100, 100, 822, 486);
		contentPane = new JPanel();
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(0, 0, 806, 447);
		contentPane.add(scrollPane);
		
		JTextArea txtrElCrecimiento = new JTextArea();
		txtrElCrecimiento.setEditable(false);
		txtrElCrecimiento.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtrElCrecimiento.setTabSize(6);
		txtrElCrecimiento.setText("El crecimiento bacteriano implica la división celular, llevando a un aumento exponencial\r\ndel número de células iniciales de una población. Las bacterias pueden crecer individuamente por fisión binaria (la célula se alarga hasta dividirse en dos) o en el contexto de una población\r\nlas células duplican su tamaño y se forma un septum, que consiste en el crecimiento de la membrana celular y de la pared celular hasta la separación de las dos células)\r\n. Cuando una célula se separa dando origen a dos nuevas células se dice que ocurrió una generación, designándose como tiempo de generación la duración de todo ese proceso.\r\nLos tempos de generación varían mucho de una especie a otra, dependiendo también del medio de crecimiento y de las condiciones de cultivo. Un crecimiento exponencial es definido\r\npor la duplicación del número de células durante un intervalo de tiempo constante. En este tipo de crecimiento el número de células aumenta lentamente, pasando poco después a un\r\naumento muy rápido, resultando en un elevado número de células.\r\nCinética del crecimiento exponencial\r\nTeniendo en cuenta que existe una relación entre el número inicial de células y el número de células tras un período de tiempo de crecimiento exponencial (puesto que una célula da\r\norigen a dos y esas dos se van a dividir en 4 células y así sucesivamente), existe una expresión matemática que resume esa relación:\r\n\r\nNt = 2n x Ni\r\n\r\nen donde: Ni – número de células en el tiempo inicial; Nt – número de células en el tempo final; n – número de generaciones.\r\nEl tiempo de generación (g) puede ser calculado a través de la siguiente fórmula: g = t/n, en donde t representa el tiempo de crecimiento transcurrido. Existen otras expresiones\r\nrelacionadas con el crecimiento exponencial que también pueden ser determinadas, mientras que sea conocido el tiempo de crecimiento transcurrido y el número de generaciones: µ define\r\nla tasa específica de crecimiento y k designa la tasa de crecimiento (número de generaciones por unidad de tiempo).\r\nCiclo de crecimiento bacteriano\r\nEl crecimiento de un cultivo bacteriano puede ocurrir en un sistema cerrado o en un sistema abierto. En el primero no ocurre renovación de los nutrientes y las sustancias tóxicas\r\nse acumulan en el medio, al contrario de lo que sucede en un sistema abierto. Un ciclo de crecimiento en un sistema cerrado presenta cuatro fases diferentes:\r\nFase de latencia: generalmente, el crecimiento bacteriano no se inicia tras el cultivo en un nuevo medio, notándose esta fase inicial sin grandes diferencias a nivel del crecimiento.\r\nEsta fase puede tener varias explicaciones, como diferencias de condiciones entre el cultivo inicial y el nuevo; células que sufrieron daños anteriormente y necesitan un tiempo para\r\nrecuperar; inoculación de un cultivo antiguo: síntesis de los componentes celulares necesarios para la división celular.\r\nFase exponencial: todas las células entran en división celular durante un periodo de tiempo que depende de la cantidad de nutrientes presentes en el medio. En esta fase, las células\r\nestán en su mejor estado de desarrollo, siendo este el momento dispensable para la realización de ensayos científicos. La tasa de crecimiento es afectada por las condiciones de cultivo\r\ny también por las características genéticas de los microorganismos\r\nFase estacionaria: después de la fase de crecimiento exponencial, puede ocurrir la depleción de uno de los nutrientes esenciales al crecimiento celular o la acumulación de un producto de\r\nmetabolismo que impida el crecimiento. De esta forma, las bacterias cesan su crecimiento, entrando en una fase estacionara, durante la cual la tasa de crecimiento es nula.\r\nFase de declive o de muerte celular: en el caso de que el cultivo bacteriano continúe tras la fase anterior, las células van a acabar por morir, pudiendo inclusivamente ocurrir lisis celular\r\nLa muerte celular ocurre a una velocidad mucho menor que el crecimiento bacteriano.\r\n");
		scrollPane.setViewportView(txtrElCrecimiento);
	}

}
