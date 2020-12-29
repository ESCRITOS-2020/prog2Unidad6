package presentacion;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class IngresoPersona1 extends JFrame {

	private JPanel panel;
	private JTextField tbNombre;
	private JComboBox cmbNacionalidad;
	private ButtonGroup grupo;
	private JRadioButton rdbtnFemenino;
	private JRadioButton rdbtnMasculino;
	private JButton btnAceptar;
	private JButton btnLimpiar;
	private JPanel pnlSexo;
	private JTextField tbApellido;
	private JLabel lblCursos;
	private JCheckBox chckbxNet;
	private JCheckBox checkBox;
	private JCheckBox chckbxRedes;
	private JCheckBox chckbxJava;
	

	public IngresoPersona1() {
		
		iniciarComponentes();
		iniciarManejadorEventos();
	}
   		
	private void iniciarComponentes() {
		
		setTitle("Formulario de Personas");
		setSize(310, 495);
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
		lblNombre.setBounds(24, 50, 64, 14);
		panel.add(lblNombre);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(24, 223, 64, 14);
		panel.add(lblNacionalidad);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(24, 89, 56, 16);
		panel.add(lblApellido);
		
		tbNombre = new JTextField();
		tbNombre.setBounds(115, 47, 155, 20);
		panel.add(tbNombre);
				
		cmbNacionalidad = new JComboBox();
		cmbNacionalidad.setToolTipText("");
		cmbNacionalidad.setBounds(100, 220, 170, 20);
		panel.add(cmbNacionalidad);
		cmbNacionalidad.addItem(" ");
		cmbNacionalidad.addItem("Las Piedras");
		cmbNacionalidad.addItem("La Paz");
		cmbNacionalidad.addItem("Canelones");
		cmbNacionalidad.setModel(new DefaultComboBoxModel(new String[] {" ", "Vietnam", "Israel", "Mongolia"}));
		cmbNacionalidad.setSelectedIndex(0);
		
		grupo=new ButtonGroup();
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(12, 424, 106, 23);
		panel.add(btnLimpiar);
		
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(163, 424, 107, 23);
		panel.add(btnAceptar);
		
		pnlSexo = new JPanel();
		pnlSexo.setBorder(new TitledBorder(null, "Sexo:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlSexo.setBounds(24, 270, 246, 61);
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
		
		tbApellido = new JTextField();
		tbApellido.setBounds(115, 86, 155, 22);
		panel.add(tbApellido);
		tbApellido.setColumns(10);
		
		chckbxNet = new JCheckBox(".Net");
		chckbxNet.setBounds(104, 379, 56, 25);
		panel.add(chckbxNet);
		
		checkBox = new JCheckBox("New check box");
		checkBox.setBounds(171, 390, 21, -9);
		panel.add(checkBox);
		
		chckbxRedes = new JCheckBox("Redes");
		chckbxRedes.setBounds(181, 379, 79, 25);
		panel.add(chckbxRedes);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 344, 247, 69);
		panel.add(scrollPane);
		
		lblCursos = new JLabel("Cursos: ");
		scrollPane.setColumnHeaderView(lblCursos);
		
		chckbxJava = new JCheckBox("Java");
		scrollPane.setRowHeaderView(chckbxJava);
		

		
		
}
	private void iniciarManejadorEventos() {
		
		btnLimpiar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tbNombre.setText("");
					tbApellido.setText("");
		  			cmbNacionalidad.setSelectedIndex(0);
		  			grupo.clearSelection();
		  			chckbxNet.setSelected(false);
		  			chckbxRedes.setSelected(false);
		  			chckbxJava.setSelected(false);
		  			
		  			
		  			JOptionPane.showMessageDialog(null,"Quedo pronto","Datos Capturados",JOptionPane.INFORMATION_MESSAGE);
				}
	});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resul;
				
				resul=tbNombre.getText()+" "+tbApellido.getText()+" "+cmbNacionalidad.getSelectedItem()+" ";
				if (rdbtnFemenino.isSelected())
					resul=resul+"Femenino";
				else
					resul=resul+"Masculino";
				
				if (chckbxJava.isSelected())
					resul=resul+" "+"Java";
				else if (chckbxNet.isSelected())
					resul=resul+" "+".Net";
				else
					resul=resul+" "+"Redes";

				JOptionPane.showMessageDialog(null,resul,"Datos capturados",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
		
	}
}