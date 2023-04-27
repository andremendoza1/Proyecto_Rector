package crecimiento_bacteriano;

import javax.swing.*;

public abstract class Operaciones extends JFrame{

	private static final long serialVersionUID = 1L;
	public JTextField CajaResultado;
	public JTextField CajaOperacion;
	boolean igual,inicio = true,ope1,ope2;
	double a,b,c,valor1,valor2,resultado,memoria = 0;
	
	
     String cadena,funcion,tipoOperaciones;
     


     
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
    	}
	}
}
