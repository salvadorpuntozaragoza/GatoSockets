import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class GatoCliente extends JFrame implements Runnable{

	private JPanel contentPane;
	private Gato gato = new Gato();
	private Socket cliente;
	private ObjectInputStream input;
	private ObjectOutputStream output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GatoCliente frame = new GatoCliente();
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
	 * @throws UnknownHostException 
	 */
	public GatoCliente() throws UnknownHostException, IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Cliente");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlGato = new JPanel();
		contentPane.add(pnlGato, BorderLayout.CENTER);
		pnlGato.setLayout(new GridLayout(3, 3, 0, 0));
		
		
		pnlGato.add(gato.getBoton(0));
		gato.getBoton(0).setActionCommand("1");
		gato.getBoton(0).addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(!gato.getTurno()){
					JOptionPane.showMessageDialog(pnlGato, "No es tu turno");
				}else{
					gato.setTurno(false);
					gato.getBoton(0).setIcon(gato.getX());
					gato.setMat(0, 0, 1);
					gato.comprobar();
					gato.getBoton(0).setEnabled(false);
					try {
						output = new ObjectOutputStream(cliente.getOutputStream());
						Paquete paquete = new Paquete(gato.getBoton(0), 0);
						output.writeObject(paquete);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		pnlGato.add(gato.getBoton(1));
		gato.getBoton(1).setActionCommand("2");
		gato.getBoton(1).addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!gato.getTurno()){
					JOptionPane.showMessageDialog(pnlGato, "No es tu turno");
				}else{
					gato.setTurno(false);
					gato.getBoton(1).setIcon(gato.getX());
					gato.setMat(0, 1, 1);
					gato.comprobar();
					gato.getBoton(1).setEnabled(false);
					try {
						output = new ObjectOutputStream(cliente.getOutputStream());
						Paquete paquete = new Paquete(gato.getBoton(1), 1);
						output.writeObject(paquete);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		pnlGato.add(gato.getBoton(2));
		gato.getBoton(2).setActionCommand("3");
		gato.getBoton(2).addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!gato.getTurno()){
					JOptionPane.showMessageDialog(pnlGato, "No es tu turno");
				}else{
					gato.setTurno(false);
					gato.getBoton(2).setIcon(gato.getX());
					gato.setMat(0, 2, 1);
					gato.comprobar();
					gato.getBoton(2).setEnabled(false);
					try {
						output = new ObjectOutputStream(cliente.getOutputStream());
						Paquete paquete = new Paquete(gato.getBoton(2), 2);
						output.writeObject(paquete);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		pnlGato.add(gato.getBoton(3));
		gato.getBoton(3).setActionCommand("4");
		gato.getBoton(3).addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!gato.getTurno()){
					JOptionPane.showMessageDialog(pnlGato, "No es tu turno");
				}else{
					gato.setTurno(false);
					gato.getBoton(3).setIcon(gato.getX());
					gato.setMat(1, 0, 1);
					gato.comprobar();
					gato.getBoton(3).setEnabled(false);
					try {
						output = new ObjectOutputStream(cliente.getOutputStream());
						Paquete paquete = new Paquete(gato.getBoton(3), 3);
						output.writeObject(paquete);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		pnlGato.add(gato.getBoton(4));
		gato.getBoton(4).setActionCommand("5");
		gato.getBoton(4).addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!gato.getTurno()){
					JOptionPane.showMessageDialog(pnlGato, "No es tu turno");
				}else{
					gato.setTurno(false);
					gato.getBoton(4).setIcon(gato.getX());
					gato.setMat(1, 1, 1);
					gato.comprobar();
					gato.getBoton(4).setEnabled(false);
					try {
						output = new ObjectOutputStream(cliente.getOutputStream());
						Paquete paquete = new Paquete(gato.getBoton(4), 4);
						output.writeObject(paquete);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		pnlGato.add(gato.getBoton(5));
		gato.getBoton(5).setActionCommand("6");
		gato.getBoton(5).addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!gato.getTurno()){
					JOptionPane.showMessageDialog(pnlGato, "No es tu turno");
				}else{
					gato.setTurno(false);
					gato.getBoton(5).setIcon(gato.getX());
					gato.setMat(1, 2, 1);
					gato.comprobar();
					gato.getBoton(5).setEnabled(false);
					try {
						output = new ObjectOutputStream(cliente.getOutputStream());
						Paquete paquete = new Paquete(gato.getBoton(5), 5);
						output.writeObject(paquete);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		pnlGato.add(gato.getBoton(6));
		gato.getBoton(6).setActionCommand("7");
		gato.getBoton(6).addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!gato.getTurno()){
					JOptionPane.showMessageDialog(pnlGato, "No es tu turno");
				}else{
					gato.setTurno(false);
					gato.getBoton(6).setIcon(gato.getX());
					gato.setMat(2, 0, 1);
					gato.comprobar();
					gato.getBoton(6).setEnabled(false);
					try {
						output = new ObjectOutputStream(cliente.getOutputStream());
						Paquete paquete = new Paquete(gato.getBoton(6), 6);
						output.writeObject(paquete);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		pnlGato.add(gato.getBoton(7));
		gato.getBoton(7).setActionCommand("8");
		gato.getBoton(7).addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!gato.getTurno()){
					JOptionPane.showMessageDialog(pnlGato, "No es tu turno");
				}else{
					gato.setTurno(false);
					gato.getBoton(7).setIcon(gato.getX());
					gato.setMat(2, 1, 1);
					gato.comprobar();
					gato.getBoton(7).setEnabled(false);
					try {
						output = new ObjectOutputStream(cliente.getOutputStream());
						Paquete paquete = new Paquete(gato.getBoton(7), 7);
						output.writeObject(paquete);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		pnlGato.add(gato.getBoton(8));
		
		JPanel pnlRestart = new JPanel();
		contentPane.add(pnlRestart, BorderLayout.SOUTH);
		
		gato.getBoton(8).setActionCommand("9");
		gato.getBoton(8).addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!gato.getTurno()){
					JOptionPane.showMessageDialog(pnlGato, "No es tu turno");
				}else{
					gato.setTurno(false);
					gato.getBoton(8).setIcon(gato.getX());
					gato.setMat(2, 2, 1);
					gato.comprobar();
					gato.getBoton(8).setEnabled(false);
					try {
						output = new ObjectOutputStream(cliente.getOutputStream());
						Paquete paquete = new Paquete(gato.getBoton(8), 8);
						output.writeObject(paquete);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gato.setTurno(true);
				for(int i = 0 ; i < gato.getBotones().length ; i++){
					gato.restartBtn(gato.getBoton(i));
				}
				gato.setReiniciar(true);
				try {
					output = new ObjectOutputStream(cliente.getOutputStream());
					Paquete p = new Paquete(gato.getReiniciar(),10);
					output.writeObject(p);
					gato.restartMatriz();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		pnlRestart.add(btnReiniciar);
		
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			cliente = new Socket("127.0.0.1",8000);
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		while(true){
			try {
				input = new ObjectInputStream(cliente.getInputStream());
				Paquete p = (Paquete) input.readObject();
				gato.setTurno(true);
				if(p.id == 1){
					gato.getBoton(0).setIcon(p.button.getIcon());
					gato.getBoton(0).setEnabled(false);
				}else if(p.id == 2){
					gato.getBoton(1).setIcon(p.button.getIcon());
					gato.getBoton(1).setEnabled(false);
				}else if(p.id == 3){
					gato.getBoton(2).setIcon(p.button.getIcon());
					gato.getBoton(2).setEnabled(false);
				}else if(p.id == 4){
					gato.getBoton(3).setIcon(p.button.getIcon());
					gato.getBoton(3).setEnabled(false);
				}else if(p.id == 5){
					gato.getBoton(4).setIcon(p.button.getIcon());
					gato.getBoton(4).setEnabled(false);
				}else if(p.id == 6){
					gato.getBoton(5).setIcon(p.button.getIcon());
					gato.getBoton(5).setEnabled(false);
				}else if(p.id == 7){
					gato.getBoton(6).setIcon(p.button.getIcon());
					gato.getBoton(6).setEnabled(false);
				}else if(p.id == 8){
					gato.getBoton(7).setIcon(p.button.getIcon());
					gato.getBoton(7).setEnabled(false);
				}else if(p.id == 9){
					gato.getBoton(8).setIcon(p.button.getIcon());
					gato.getBoton(8).setEnabled(false);
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

}
