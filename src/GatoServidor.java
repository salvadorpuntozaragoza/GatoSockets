import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GatoServidor extends JFrame implements Runnable {

	private JPanel contentPane;
	private JPanel pnlGato;
	private ServerSocket servidor;
	private Socket cliente;
	private ObjectInputStream input;
	private ObjectOutputStream output;
	private Paquete paquete;
	
	private ControladorBotones cb;
	private Gato gato;
	private ImageIcon x = new ImageIcon("Images/x.png");
	
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GatoServidor frame = new GatoServidor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public GatoServidor() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Servidor");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		cb = new ControladorBotones(this);
		gato = new Gato();
		
		pnlGato = new JPanel();
		contentPane.add(pnlGato, BorderLayout.CENTER);
		pnlGato.setLayout(new GridLayout(3, 3, 0, 0));
		
		btn1 = new JButton("");
		btn1.setActionCommand("1");
		btn1.addActionListener(cb);
		pnlGato.add(btn1);
		
		btn2 = new JButton("");
		btn2.setActionCommand("2");
		btn2.addActionListener(cb);
		pnlGato.add(btn2);
		
		btn3 = new JButton("");
		btn3.setActionCommand("3");
		btn3.addActionListener(cb);
		pnlGato.add(btn3);
		
		btn4 = new JButton("");
		btn4.setActionCommand("4");
		btn4.addActionListener(cb);
		pnlGato.add(btn4);
		
		btn5 = new JButton("");
		btn5.setActionCommand("5");
		btn5.addActionListener(cb);
		pnlGato.add(btn5);
		
		btn6 = new JButton("");
		btn6.setActionCommand("6");
		btn6.addActionListener(cb);
		pnlGato.add(btn6);
		
		btn7 = new JButton("");
		btn7.setActionCommand("7");
		btn7.addActionListener(cb);
		pnlGato.add(btn7);
		
		btn8 = new JButton("");
		btn8.setActionCommand("8");
		btn8.addActionListener(cb);
		pnlGato.add(btn8);
		
		btn9 = new JButton("");
		btn9.setActionCommand("9");
		btn9.addActionListener(cb);
		pnlGato.add(btn9);
		
		Thread t = new Thread(this);
		t.start();
	}

	public JButton getBtn1() {
		return btn1;
	}

	public void setBtn1(JButton btn1) {
		this.btn1 = btn1;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public void setBtn2(JButton btn2) {
		this.btn2 = btn2;
	}

	public JButton getBtn3() {
		return btn3;
	}

	public void setBtn3(JButton btn3) {
		this.btn3 = btn3;
	}

	public JButton getBtn4() {
		return btn4;
	}

	public void setBtn4(JButton btn4) {
		this.btn4 = btn4;
	}

	public JButton getBtn5() {
		return btn5;
	}

	public void setBtn5(JButton btn5) {
		this.btn5 = btn5;
	}

	public JButton getBtn6() {
		return btn6;
	}

	public void setBtn6(JButton btn6) {
		this.btn6 = btn6;
	}

	public JButton getBtn7() {
		return btn7;
	}

	public void setBtn7(JButton btn7) {
		this.btn7 = btn7;
	}

	public JButton getBtn8() {
		return btn8;
	}

	public void setBtn8(JButton btn8) {
		this.btn8 = btn8;
	}
	
	public JButton getBtn9() {
		return btn9;
	}

	public void setBtn9(JButton btn9) {
		this.btn9 = btn9;
	}

	public Socket getCliente(){
		return cliente;
	}
	
	public Gato getGato(){
		return gato;
	}
	
	public JPanel getPnlGato(){
		return pnlGato;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Servidor: esperando cliente");
			servidor = new ServerSocket(8000);
			cliente = servidor.accept();
			
			while(true){
				System.out.println("Servidor: Esperando objeto");
				input = new ObjectInputStream(cliente.getInputStream());
				paquete = (Paquete) input.readObject();
				if(paquete.id == 0){
					btn1.setIcon(paquete.button.getIcon());
					btn1.setEnabled(false);
				}
				if(paquete.id == 1){
					btn2.setIcon(paquete.button.getIcon());
					btn2.setEnabled(false);
				}
				if(paquete.id == 2){
					btn3.setIcon(paquete.button.getIcon());
					btn3.setEnabled(false);
				}
				if(paquete.id == 3){
					btn4.setIcon(paquete.button.getIcon());
					btn4.setEnabled(false);
				}
				if(paquete.id == 4){
					btn5.setIcon(paquete.button.getIcon());
					btn5.setEnabled(false);
				}
				if(paquete.id == 5){
					btn6.setIcon(paquete.button.getIcon());
					btn6.setEnabled(false);
				}
				if(paquete.id == 6){
					btn7.setIcon(paquete.button.getIcon());
					btn7.setEnabled(false);
				}
				if(paquete.id == 7){
					btn8.setIcon(paquete.button.getIcon());
					btn8.setEnabled(false);
				}
				if(paquete.id == 8){
					btn9.setIcon(paquete.button.getIcon());
					btn9.setEnabled(false);
				}
				if(paquete.id == 10){
					gato.restartBtn(btn1);
					gato.restartBtn(btn2);
					gato.restartBtn(btn3);
					gato.restartBtn(btn4);
					gato.restartBtn(btn5);
					gato.restartBtn(btn6);
					gato.restartBtn(btn7);
					gato.restartBtn(btn8);
					gato.restartBtn(btn9);
					gato.restartMatriz();
					gato.setTurno(true);
					
				}
				System.out.println("Servidor: Objeto recibido");
				gato.setTurno(true);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
