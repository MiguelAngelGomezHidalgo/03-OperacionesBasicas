import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 
 * @author MiguelAngelGomezHidalgo
 *
 */
public class Ventana extends JFrame implements ActionListener{

	private JTextField txtN1 = new JTextField();
	private JTextField txtN2 = new JTextField();
	
	private JLabel lbN1 = new JLabel("Número 1");
	private JLabel lbN2 = new JLabel("Número 2");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JButton btnCalcular = new JButton("Calcular");
	private Container c = getContentPane();
	private Operaciones op = new Operaciones();
	/**
	 * Constructor en donde de ponen los atributos de la ventana
	 */
	public Ventana(){
		super.setTitle("Operaciones");
		super.setSize(340, 480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
	/**
	 * Metodo para cargar los componentes de la ventana
	 */
	
	private void cargarControles() {
		c.setLayout(null);
		lbN1.setBounds(10, 10, 300, 30);
		txtN1.setBounds(10, 40, 300, 30);
		lbN2.setBounds(10, 80, 300, 30);
		txtN2.setBounds(10, 110, 300, 30);
		
		btnCalcular.setBounds(10, 150, 300, 35);
		
		lbResultado.setBounds(10, 190, 300, 30);
		
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		c.add(btnCalcular);
		c.add(lbResultado);
		btnCalcular.addActionListener(this);
		
	}
	/**
	 *  Metodo para poder hacer las operaciones cuando de presiona el boton
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		int r = op.sumar(Integer.parseInt(txtN1.getText()), 
				Integer.parseInt(txtN2.getText())
				);
		
		lbResultado.setText(String.format("%s + %s = %d", 
				txtN1.getText(), 
				txtN2.getText(), 
				r));
		
	}
}
