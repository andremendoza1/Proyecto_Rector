package crecimiento_bacteriano;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class CrecimientoBacteriano extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JTextField numBacteriasField;
    private JTextField tasaCrecimientoField;
    private JTextField tiempoCrecimientoField;
    private XYSeriesCollection dataset;
    private ChartPanel chartPanel;

    public CrecimientoBacteriano() {
        super("Crecimiento bacteriano");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        

        // Crear los elementos de la GUI
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        inputPanel.add(new JLabel("Número inicial de bacterias:"));
        numBacteriasField = new JTextField(5);
        inputPanel.add(numBacteriasField);
        inputPanel.add(new JLabel("crecimiento:"));
        tasaCrecimientoField = new JTextField(5);
        inputPanel.add(tasaCrecimientoField);
        inputPanel.add(new JLabel("Tiempo de crecimiento (horas):"));
        tiempoCrecimientoField = new JTextField(5);
        inputPanel.add(tiempoCrecimientoField);
        JButton calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(this);
        inputPanel.add(calcularButton);
        

        // Crear la gráfica
        dataset = new XYSeriesCollection();
        JFreeChart chart = ChartFactory.createXYLineChart("Crecimiento bacteriano", "Tiempo (horas)", "Población",
                dataset, PlotOrientation.VERTICAL, true, true, false);
        chart.setBackgroundPaint(Color.white);
        chartPanel = new ChartPanel(chart);
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        chartPanel.setBorder(border);

        // Agregar los elementos a un contenedor
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.add(inputPanel, BorderLayout.NORTH);
        contentPane.add(chartPanel, BorderLayout.CENTER);
        setContentPane(contentPane);

        // Mostrar la GUI
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        try {
            // Obtener los valores de entrada
            int numBacterias = Integer.parseInt(numBacteriasField.getText());
            double Crecimiento = Double.parseDouble(tasaCrecimientoField.getText());
            int tiempoCrecimiento = Integer.parseInt(tiempoCrecimientoField.getText());

            // Calcular los datos de la gráfica
            XYSeries series = new XYSeries("Crecimiento bacteriano");
            for (int t = 0; t <= tiempoCrecimiento; t++) {
           //double poblacion = numBacterias * Math.pow((1 + Crecimiento), tiempoCrecimiento);
                double poblacion = numBacterias * Math.pow(2, (t * Crecimiento / 100.0));
                series.add(t, poblacion);
                System.out.println(poblacion);
            }
            dataset.removeAllSeries();
            dataset.addSeries(series);
            
            
                		// Configurar la gráfica
                        JFreeChart chart = chartPanel.getChart();
                XYPlot plot = chart.getXYPlot();
                plot.setDomainCrosshairVisible(true);
                plot.setRangeCrosshairVisible(true);
                plot.setDomainGridlinesVisible(true);
                plot.setRangeGridlinesVisible(true);
                plot.setBackgroundPaint(Color.WHITE);
                XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
                renderer.setSeriesPaint(0, Color.RED);
                renderer.setSeriesShapesVisible(0, false);
                plot.setRenderer(renderer);
                NumberAxis domainAxis = (NumberAxis) plot.getDomainAxis();
                domainAxis.setAutoRangeIncludesZero(false);
                domainAxis.setTickMarkInsideLength(2.0f);
                domainAxis.setTickMarkOutsideLength(2.0f);
                NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
                rangeAxis.setAutoRangeIncludesZero(false);
                rangeAxis.setTickMarkInsideLength(2.0f);
                rangeAxis.setTickMarkOutsideLength(2.0f);

            } catch (NumberFormatException e) {
                System.out.println("Ingrese valores numéricos válidos.");
            }
        }

        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new CrecimientoBacteriano();
                }
            });
        }
        }

