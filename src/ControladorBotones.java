import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class ControladorBotones implements ActionListener {
	
	private GatoServidor gatoServidor;
	private Gato gato;
	private JButton boton;
	private Socket cliente;
	private ObjectOutputStream output;
	
	public ControladorBotones(GatoServidor gatoServidor) throws IOException{
		this.gatoServidor = gatoServidor;
		gato = new Gato();
		boton = new JButton("");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(!gatoServidor.getGato().getTurno()){
			JOptionPane.showMessageDialog(gatoServidor.getPnlGato(), "No es tu turno");
		}else{
			gatoServidor.getGato().setTurno(false);
			cliente = gatoServidor.getCliente();
			try {
				output = new ObjectOutputStream(cliente.getOutputStream());
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			String tipo = e.getActionCommand();
			System.out.println(tipo);
			if(tipo.equals("1")){
				gatoServidor.getBtn1().setIcon(gato.getO());
				gatoServidor.getBtn1().setEnabled(false);
				gatoServidor.getGato().setMat(0, 0, 0);
				gatoServidor.getGato().comprobar();
				Paquete p = new Paquete(gatoServidor.getBtn1(),1);
				try {
					output.writeObject(p);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}else if(tipo.equals("2")){
				gatoServidor.getBtn2().setIcon(gato.getO());
				gatoServidor.getBtn2().setEnabled(false);
				gatoServidor.getGato().setMat(0, 1, 0);
				gatoServidor.getGato().comprobar();
				Paquete p = new Paquete(gatoServidor.getBtn2(),2);
				try {
					output.writeObject(p);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}else if(tipo.equals("3")){
				gatoServidor.getBtn3().setIcon(gato.getO());
				gatoServidor.getBtn3().setEnabled(false);
				gatoServidor.getGato().setMat(0, 2, 0);
				gatoServidor.getGato().comprobar();
				Paquete p = new Paquete(gatoServidor.getBtn3(),3);
				try {
					output.writeObject(p);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else if(tipo.equals("4")){
				gatoServidor.getBtn4().setIcon(gato.getO());
				gatoServidor.getBtn4().setEnabled(false);
				gatoServidor.getGato().setMat(1, 0, 0);
				gatoServidor.getGato().comprobar();
				Paquete p = new Paquete(gatoServidor.getBtn4(),4);
				try {
					output.writeObject(p);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else if(tipo.equals("5")){
				gatoServidor.getBtn5().setIcon(gato.getO());
				gatoServidor.getBtn5().setEnabled(false);
				gatoServidor.getGato().setMat(1, 1, 0);
				gatoServidor.getGato().comprobar();
				Paquete p = new Paquete(gatoServidor.getBtn5(),5);
				try {
					output.writeObject(p);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else if(tipo.equals("6")){
				gatoServidor.getBtn6().setIcon(gato.getO());
				gatoServidor.getBtn6().setEnabled(false);
				gatoServidor.getGato().setMat(1, 2, 0);
				gatoServidor.getGato().comprobar();
				Paquete p = new Paquete(gatoServidor.getBtn6(),6);
				try {
					output.writeObject(p);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else if(tipo.equals("7")){
				gatoServidor.getBtn7().setIcon(gato.getO());
				gatoServidor.getBtn7().setEnabled(false);
				gatoServidor.getGato().setMat(2, 0, 0);
				gatoServidor.getGato().comprobar();
				Paquete p = new Paquete(gatoServidor.getBtn7(),7);
				try {
					output.writeObject(p);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else if(tipo.equals("8")){
				gatoServidor.getBtn8().setIcon(gato.getO());
				gatoServidor.getBtn8().setEnabled(false);
				gatoServidor.getGato().setMat(2, 1, 0);
				gatoServidor.getGato().comprobar();
				Paquete p = new Paquete(gatoServidor.getBtn8(),8);
				try {
					output.writeObject(p);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else if(tipo.equals("9")){
				gatoServidor.getBtn9().setIcon(gato.getO());
				gatoServidor.getBtn9().setEnabled(false);
				gatoServidor.getGato().setMat(2, 2, 0);
				gatoServidor.getGato().comprobar();
				Paquete p = new Paquete(gatoServidor.getBtn9(),9);
				try {
					output.writeObject(p);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		
	}

}
