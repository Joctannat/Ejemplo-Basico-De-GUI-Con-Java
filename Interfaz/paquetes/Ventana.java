package paquetes;

import javax.swing.JFrame; // VENTANA
import javax.swing.JLabel; // Texto/Etiqueta
import javax.swing.JTextField; // caja de texto

// Importaciones relacionados con eventos
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventana extends JFrame{ // significa que la clase "Ventana" es una ventana de Swing

	// Atributos
	
//  privacidad tipoDeDato NombreVariable;
	private JLabel lbl;  //Etiqueta de texto
	private JTextField caja; // Caja de texto
	
	
	//  Métodos
	
	public Ventana(){	//	El Constructor configura la ventana
		// Ventana
		this.setBounds(120, 40, 290, 240); // setBounds(x, y, ancho, alto)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);


		// LABEL (Etiqueta)
		lbl = new JLabel("Ingresa Tu nombre"); // Texto a mostrar justo arriba de la Caja de texto
		lbl.setBounds(20, 10, 200, 50); // Posición del JLabel  (x, y, ancho, alto)
		this.getContentPane().add(lbl); // Añadir el JLabel a la ventana
	
	
		// CAJA DE TEXTO
		caja= new JTextField(""); // Texto a mostrar en la caja
		caja.setBounds(20, 60, 100, 40); // tamaño  (x, y, ancho, alto)
		this.getContentPane().add(caja); // Añadir el JTextField a la ventana


		Evento e = new Evento();  // Creación de un objeto llamado "e" de la Clase "Evento"
		caja.addActionListener(e);  // Conectar la caja con el Evento
	}
	
	

	
	//Clase Interna
	public class Evento implements ActionListener{ //  Esta clase sabe responder a eventos de tipo ActionListener
		
		// Este metodo se ejecuta cuando escribimos y damos enter en la caja
		@Override
//		privacidad tipoDeDatoDeRetorno NombreMetodo (TipoDeDato Variable)
		public void actionPerformed(ActionEvent ae){
			String nombre = caja.getText(); // Cracion de variable llamada "nombre" // Con el objeto "caja" se llama a getText() // Se recibe un string y se guarda en "nombre"
			lbl.setText("Hola " + nombre); // Con exactamente el mismo objeto de antes "lbl" se llama al metodo setText() // Se reemplaza la etiqueta con el nuevo String ingresado por el usuario // En el mismo lugar donde estaba    
		}
	}


}