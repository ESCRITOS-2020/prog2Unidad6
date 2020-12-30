package presentacion;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class IngresoPersona1 extends JFrame {

	private JPanel panel;
	private JTextField tbNombre;
	private JComboBox cmbCiudad;
	private ButtonGroup grupo;
	private JRadioButton rdbtnFemenino;
	private JRadioButton rdbtnMasculino;
	private JButton btnAceptar;
	private JButton btnLimpiar;
	private JPanel pnlSexo;
	

	public IngresoPersona1() {
		
		iniciarComponentes();
		iniciarManejadorEventos();
	}
   		
	private void iniciarComponentes() {
		
		setTitle("Formulario de Personas");
		setSize(263, 264);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblIngresoDeDatos = new JLabel("Ingreso de datos");
		lblIngresoDeDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresoDeDatos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIngresoDeDatos.setBounds(0, 0, 247, 34);
		panel.add(lblIngresoDeDatos);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(5, 50, 64, 14);
		panel.add(lblNombre);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setBounds(5, 90, 64, 14);
		panel.add(lblCiudad);
		
		tbNombre = new JTextField();
		tbNombre.setBounds(79, 47, 155, 20);
		panel.add(tbNombre);
				
		cmbCiudad = new JComboBox();
		cmbCiudad.setToolTipText("");
		cmbCiudad.setBounds(79, 87, 155, 20);
		panel.add(cmbCiudad);
		cmbCiudad.addItem(" ");
		cmbCiudad.addItem("Las Piedras");
		cmbCiudad.addItem("La Paz");
		cmbCiudad.addItem("Canelones");
		cmbCiudad.setModel(new DefaultComboBoxModel(new String[] {" ", "Las Piedras", "La Paz", "Canelones"}));
		cmbCiudad.setSelectedIndex(0);
		
		grupo=new ButtonGroup();
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(5, 199, 106, 23);
		panel.add(btnLimpiar);
		
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(140, 199, 107, 23);
		panel.add(btnAceptar);
		
		pnlSexo = new JPanel();
		pnlSexo.setBorder(new TitledBorder(null, "Sexo:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlSexo.setBounds(5, 115, 242, 61);
		panel.add(pnlSexo);
		pnlSexo.setLayout(null);
		rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(6, 31, 95, 23);
		pnlSexo.add(rdbtnMasculino);
		grupo.add(rdbtnMasculino);
		
		rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBounds(124, 31, 95, 23);
		pnlSexo.add(rdbtnFemenino);
		grupo.add(rdbtnFemenino);
		
		
}
	private void iniciarManejadorEventos() {
		
		btnLimpiar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tbNombre.setText("");
		  			cmbCiudad.setSelectedIndex(0);
		  			grupo.clearSelection();	
		  			JOptionPane.showMessageDialog(null,"Quedo pronto","Datos Capturados",JOptionPane.INFORMATION_MESSAGE);
				}
	});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resul;
				
				resul=tbNombre.getText()+ " "+cmbCiudad.getSelectedItem()+" ";
				if (rdbtnFemenino.isSelected())
					resul=resul+"Femenino";
				else
					resul=resul+"Masculino";
				JOptionPane.showMessageDialog(null,resul,"Datos capturados",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
		
	}
}