package challenges;


import javax.swing.JOptionPane;

public class DivisasMetodos {

	
	
	public void ConvertirMonedas(double monto) {
			String opcion=(JOptionPane.showInputDialog(null,"¿Que moneda desea convertir?","Monedas", JOptionPane.PLAIN_MESSAGE,null, new Object[] {"De Pesos a Dollar",
					"De Pesos a Euro","De Pesos a Libras Esterlinas","De Pesos a Yen Japones","De Pesos a Won Sur-Coreano","De Dollar a Pesos","De Euro a Pesos"
					,"De Libras Esterlinas a Pesos","De Yen Japones a Pesos","De Won Sur-Coreano a Pesos"}, "Seleccion")).toString();
			switch (opcion) {
			case "De Pesos a Dollar":
				double mxtousd=monto/0.059;
				mxtousd=((double)Math.round(mxtousd*100d)/100d);
				JOptionPane.showMessageDialog(null, "Tienes $ "+mxtousd+" Dollares");				
				break;
			case "De Pesos a Euro":
				double mxtoeu=monto/0.054;
				mxtoeu=((double)Math.round(mxtoeu*100d)/100d);
				JOptionPane.showMessageDialog(null, "Tienes $ "+mxtoeu+" Euros");
				break;
			case "De Pesos a Libras Esterlinas":
				double mxtops=monto/0.046;
				mxtops=((double)Math.round(mxtops*100d)/100d);
				JOptionPane.showMessageDialog(null, "Tienes $ "+mxtops+" Libras Esterlinas");			
				break;
			case "De Pesos a Yen Japones":
				double mxtoy=monto*8.52;
				mxtoy=((double)Math.round(mxtoy*100d)/100d);
				JOptionPane.showMessageDialog(null, "Tienes $ "+mxtoy+" Yenes Japoneses");
				break;
			case "De Pesos a Won Sur-Coreano":
				double mxtoscw=monto*78.68;
				mxtoscw=((double)Math.round(mxtoscw*100d)/100d);
				JOptionPane.showMessageDialog(null, "Tienes $ "+mxtoscw+" Wones Sur-Coreanos");
				break;
			case "De Dollar a Pesos":
				double usdtomx=monto*17.05;
				usdtomx=((double)Math.round(usdtomx*100d)/100d);
				JOptionPane.showMessageDialog(null, "Tienes $ "+usdtomx+" Pesos");
				break;
			case "De Euro a Pesos":
				double eutomx=monto*18.54;
				eutomx=((double)Math.round(eutomx*100d)/100d);
				JOptionPane.showMessageDialog(null, "Tienes $ "+eutomx+" Pesos");
				break;
			case "De Libras Esterlinas a Pesos":
				double pstomx=monto*21.71;
				pstomx=((double)Math.round(pstomx*100d)/100d);
				JOptionPane.showMessageDialog(null, "Tienes $ "+pstomx+" Pesos");
				break;
			case "De Yen Japones a Pesos":
				double ytomx=monto/0.12;
				ytomx=((double)Math.round(ytomx*100d)/100d);
				JOptionPane.showMessageDialog(null, "Tienes $ "+ytomx+" Pesos");
				break;
			case "De Won Sur-Coreano a Pesos":
				double scwtomx=monto/0.013;
				scwtomx=((double)Math.round(scwtomx*100d)/100d);
				JOptionPane.showMessageDialog(null, "Tienes $ "+scwtomx+" Pesos");
				break;
			default:
				break;
			}
		}

}
