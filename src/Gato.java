import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Gato {
	
	private boolean turno;
	private ImageIcon x;
	private ImageIcon o;
	private JButton botones[];
	private int [][]matriz = new int[3][3];
	private boolean reiniciar;
	
	public Gato(){
		init();
	}
	
	public void init(){
		x = new ImageIcon("Images/x.png");
		o = new ImageIcon("Images/o.png");
		botones = new JButton[9];
		reiniciar = false;
		turno = true;
		for(int i = 0 ; i < 9 ; i++){
			botones[i] = new JButton("");
		}
		for(int i = 0; i < 3 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				matriz[i][j] = 6;
			}
		}
	}
	
	public JButton[] getBotones() {
		return botones;
	}

	public void setBotones(JButton[] botones) {
		this.botones = botones;
	}

	public boolean getTurno() {
		return turno;
	}
	public void setTurno(boolean turno) {
		this.turno = turno;
	}
	public ImageIcon getX() {
		return x;
	}
	public void setX(ImageIcon x) {
		this.x = x;
	}
	public ImageIcon getO() {
		return o;
	}
	public void setO(ImageIcon o) {
		this.o = o;
	}
	
	public JButton getBoton(int i){
		return botones[i];
	}
	
	public void setMat(int i, int j, int jugador){
		this.matriz[i][j] = jugador;
	}
	
	public boolean getReiniciar(){
		return reiniciar;
	}
	
	public void setReiniciar(boolean state){
		this.reiniciar = state;
	}
	
	public void restartMatriz(){
		for(int i = 0 ; i < 3 ; i ++){
			for(int j = 0 ; j < 3 ; j++){
				matriz[i][j] = 6;
			}
		}
	}
	
	public void restartBtn(JButton boton){
		boton.setIcon(null);
		boton.setEnabled(true);
	}
	
	public void comprobar(){
		if(matriz[0][0] == 0 && matriz[0][1] == 0 && matriz[0][2] == 0){
			JOptionPane.showMessageDialog(null, "Gana el Servidor");
		}
		
		if(matriz[1][0] == 0 && matriz[1][1] == 0 && matriz[1][2] == 0){
			JOptionPane.showMessageDialog(null, "Gana el Servidor");
		}
		
		if(matriz[2][0] == 0 && matriz[2][1] == 0 && matriz[2][2] == 0){
			JOptionPane.showMessageDialog(null, "Gana el Servidor");
		}
		
		if(matriz[0][0] == 0 && matriz[1][0] == 0 && matriz[2][0] == 0){
			JOptionPane.showMessageDialog(null, "Gana el Servidor");
		}
		
		if(matriz[0][1] == 0 && matriz[1][1] == 0 && matriz[2][1] == 0){
			JOptionPane.showMessageDialog(null, "Gana el Servidor");
		}
		
		if(matriz[0][2] == 0 && matriz[1][2] == 0 && matriz[2][2] == 0){
			JOptionPane.showMessageDialog(null, "Gana el Servidor");
		}
		
		if(matriz[0][0] == 0 && matriz[1][1] == 0 && matriz[2][2] == 0){
			JOptionPane.showMessageDialog(null, "Gana el Servidor");
		}
		
		if(matriz[0][2] == 0 && matriz[1][1] == 0 && matriz[2][0] == 0){
			JOptionPane.showMessageDialog(null, "Gana el Servidor");
		}
		
		
		
		if(matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1){
			JOptionPane.showMessageDialog(null, "Gana el cliente");
		}
		
		if(matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1){
			JOptionPane.showMessageDialog(null, "Gana el cliente");
		}
		
		if(matriz[2][0] == 1 && matriz[2][1] == 1 && matriz[2][2] == 1){
			JOptionPane.showMessageDialog(null, "Gana el cliente");
		}
		
		if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1){
			JOptionPane.showMessageDialog(null, "Gana el cliente");
		}
		
		if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){
			JOptionPane.showMessageDialog(null, "Gana el cliente");
		}
		
		if(matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1){
			JOptionPane.showMessageDialog(null, "Gana el cliente");
		}
		
		if(matriz[0][0] == 1 && matriz[1][1] == 1 && matriz[2][2] == 1){
			JOptionPane.showMessageDialog(null, "Gana el cliente");
		}
		
		if(matriz[0][2] == 1 && matriz[1][1] == 1 && matriz[2][0] == 1){
			JOptionPane.showMessageDialog(null, "Gana el cliente");
		}
	}
	
	

}
