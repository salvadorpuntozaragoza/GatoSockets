import java.io.Serializable;

import javax.swing.JButton;


public class Paquete implements Serializable{
	
	public JButton button;
	public int id;
	public boolean state;
	
	public Paquete(JButton button,int id){
		this.button = button;
		this.id = id;
	}
	
	public Paquete(boolean state, int id){
		this.state = state;
		this.id = id;
	}

}
