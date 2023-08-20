package challenges;

import javax.swing.JOptionPane;


public class ConversorDivisasPrincipal{
public static void main(String[] args) {
	
	int respuesta;
	double monto,input;
	boolean flag=true;
	
	while (flag) {
		
		
		DivisasMetodos monedas=new DivisasMetodos();
		
		monto=Double.parseDouble(JOptionPane.showInputDialog("Conversor de Divisas\nIngrese el monto que desea convertir"));
		monedas.ConvertirMonedas(monto);
		
		respuesta=JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion?");
		if (JOptionPane.OK_OPTION==respuesta) {
			System.out.println("Selecciona opcion afirmativa"); 
			}
		else {
			flag=false;
			JOptionPane.showMessageDialog(null, "Programa terminado");
		}
	}
}
}
