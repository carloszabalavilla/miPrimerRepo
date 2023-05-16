package tema6.examenes.controlcanciones;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VentanaPrincipal extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Principal controlador;

	private JFileChooser selectorFicheros;
	private FileNameExtensionFilter filtroSer;
	private FileNameExtensionFilter filtroTxt;

	private JTextField nombreTextField;
	private JTextField numReproduccionesTextField;

	private JTabbedPane tabbedPane;

	private JPanel panelCrudCanciones;

	private JPanel panel_3;

	private JPanel panel_4;

	private JLabel lblNewLabel;

	private JLabel lblNewLabel_1;

	private JLabel lblTipo;

	private JComboBox<Productor> productorComboBox;

	private JButton botonGuardarCancion;

	private JButton btnCancelarAddCancion;

	private GroupLayout gl_panel_3;

	private JPanel panel_2;
	private final ButtonGroup buttonGroupRadioListados = new ButtonGroup();
	private JPanel panel_5;
	private JPanel panel_6;
	private JRadioButton rdbtnListarTodasCanciones;
	private JRadioButton rdbtnListarArtistasNumCanciones;
	private JRadioButton rdbtnListarProductorasVisualizaciones;
	private JButton btnListar;
	private JButton btnLimpiar;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel_2;
	private JComboBox<String> comboBoxDiscografica;
	private JButton btnCancelarAddProductor;
	private JPanel panel_7;
	private JButton btnLeerTxt;
	private JButton btnEscribirTxt;
	private JButton btnLeerBinario;
	private JButton btnEscribirBinario;
	private JLabel lblNewLabel_3;
	private JTextField nombreProductortextField;
	private JButton btnGuardarProductor;
	private JLabel lblNewLabel_4;
	private JTextField artistaTextField;

	public VentanaPrincipal(Principal principal) {
		this.controlador = principal;
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.filtroSer = new FileNameExtensionFilter("Fichero serializado", "ser");
		this.filtroTxt = new FileNameExtensionFilter("Fichero del texto", "txt");
		this.selectorFicheros = new JFileChooser();
		this.selectorFicheros.addChoosableFileFilter(this.filtroSer);
		this.selectorFicheros.addChoosableFileFilter(this.filtroTxt);

		setTitle("Producciones Musicales");
		setPreferredSize(new Dimension(530, 500));
		setMinimumSize(new Dimension(530, 500));

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);

		panelCrudCanciones = new JPanel();
		tabbedPane.addTab("A\u00F1adir datos", null, panelCrudCanciones, null);

		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"A\u00F1adir Canci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"A\u00F1adir Productor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelCrudCanciones.setLayout(new GridLayout(0, 1, 0, 0));
		panelCrudCanciones.add(panel_3);

		lblNewLabel = new JLabel("Nombre:");

		nombreTextField = new JTextField();
		nombreTextField.setColumns(10);

		lblNewLabel_1 = new JLabel("N\u00FAmero de reproducciones:");

		numReproduccionesTextField = new JTextField();
		numReproduccionesTextField.setColumns(10);

		lblTipo = new JLabel("Productor:");

		productorComboBox = new JComboBox<>();

		botonGuardarCancion = new JButton("Guardar");
		botonGuardarCancion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonGuadarPulsado();
			}
		});

		btnCancelarAddCancion = new JButton("Cancelar");
		btnCancelarAddCancion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonCancelarPulsado();
			}
		});

		lblNewLabel_4 = new JLabel("Artista:");

		artistaTextField = new JTextField();
		artistaTextField.setColumns(10);
		gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_3
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, gl_panel_3
						.createSequentialGroup()
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(numReproduccionesTextField, GroupLayout.PREFERRED_SIZE, 161,
								GroupLayout.PREFERRED_SIZE)
						.addGap(172))
						.addGroup(gl_panel_3.createSequentialGroup()
								.addComponent(botonGuardarCancion, GroupLayout.PREFERRED_SIZE, 256,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnCancelarAddCancion,
										GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup().addGroup(gl_panel_3
								.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTipo, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 45,
										GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
										.addComponent(productorComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(artistaTextField)
										.addComponent(nombreTextField, GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)))
				.addContainerGap()));
		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_3
				.createSequentialGroup().addGap(19)
				.addGroup(gl_panel_3
						.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel).addComponent(nombreTextField,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(12)
				.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_4).addComponent(
						artistaTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel_3
						.createParallelGroup(Alignment.BASELINE).addComponent(lblTipo).addComponent(productorComboBox,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_1).addComponent(
						numReproduccionesTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addGap(18).addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnCancelarAddCancion).addComponent(botonGuardarCancion))
				.addGap(15)));
		panel_3.setLayout(gl_panel_3);
		panelCrudCanciones.add(panel_4);

		lblNewLabel_2 = new JLabel("Nombre:");

		comboBoxDiscografica = new JComboBox<String>();
		comboBoxDiscografica.setModel(new DefaultComboBoxModel(
				new String[] { "Def Jam", "Finneas", "Mad Records", "Pasarela", "Sonografic" }));

		btnCancelarAddProductor = new JButton("Cancelar");
		btnCancelarAddProductor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCamposProductor();
			}
		});

		lblNewLabel_3 = new JLabel("Discogr\u00E1fica:");

		nombreProductortextField = new JTextField();
		nombreProductortextField.setColumns(10);

		btnGuardarProductor = new JButton("Guardar");
		btnGuardarProductor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonGuardarProductorPulsado();
			}
		});
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_4
				.createSequentialGroup().addGap(22)
				.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_4.createSequentialGroup()
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(nombreProductortextField))
						.addGroup(gl_panel_4.createSequentialGroup().addGap(3)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(comboBoxDiscografica, GroupLayout.PREFERRED_SIZE, 187,
										GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(187, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING,
						gl_panel_4.createSequentialGroup().addContainerGap(276, Short.MAX_VALUE).addComponent(
								btnCancelarAddProductor, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE))
				.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup().addContainerGap()
						.addComponent(btnGuardarProductor, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
						.addGap(237)));
		gl_panel_4.setVerticalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_4
				.createSequentialGroup().addGap(30)
				.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_2).addComponent(
						nombreProductortextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addGap(34)
				.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxDiscografica, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
				.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
				.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE).addComponent(btnCancelarAddProductor)
						.addComponent(btnGuardarProductor))
				.addGap(33)));
		panel_4.setLayout(gl_panel_4);

		panel_2 = new JPanel();
		tabbedPane.addTab("Listados", null, panel_2, null);

		panel_5 = new JPanel();
		panel_5.setBorder(
				new TitledBorder(null, "Tipo de listado", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		panel_6 = new JPanel();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
				.addComponent(panel_6, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)));

		rdbtnListarTodasCanciones = new JRadioButton("Todas las canciones");
		buttonGroupRadioListados.add(rdbtnListarTodasCanciones);

		rdbtnListarArtistasNumCanciones = new JRadioButton("Artistas y su n\u00FAmero de canciones");
		buttonGroupRadioListados.add(rdbtnListarArtistasNumCanciones);

		rdbtnListarProductorasVisualizaciones = new JRadioButton("Productoras con m\u00E1s reproducciones");
		buttonGroupRadioListados.add(rdbtnListarProductorasVisualizaciones);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonListarPulsado();
			}
		});

		btnLimpiar = new JButton("Limpiar campos");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
			}
		});
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_5
				.createSequentialGroup().addGap(25)
				.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_5.createSequentialGroup()
								.addComponent(btnListar, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE))
						.addComponent(rdbtnListarArtistasNumCanciones, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(rdbtnListarTodasCanciones, GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
						.addComponent(rdbtnListarProductorasVisualizaciones, GroupLayout.PREFERRED_SIZE, 351,
								GroupLayout.PREFERRED_SIZE))
				.addContainerGap(36, Short.MAX_VALUE)));
		gl_panel_5
				.setVerticalGroup(
						gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_5.createSequentialGroup().addGap(20)
										.addComponent(rdbtnListarTodasCanciones)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(rdbtnListarArtistasNumCanciones)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(rdbtnListarProductorasVisualizaciones).addGap(18)
										.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
												.addComponent(btnListar).addComponent(btnLimpiar))
										.addContainerGap(28, Short.MAX_VALUE)));
		panel_5.setLayout(gl_panel_5);

		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(gl_panel_6.createParallelGroup(Alignment.LEADING).addComponent(scrollPane,
				GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE));
		gl_panel_6.setVerticalGroup(gl_panel_6.createParallelGroup(Alignment.LEADING).addComponent(scrollPane,
				Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE));

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		panel_6.setLayout(gl_panel_6);
		panel_2.setLayout(gl_panel_2);

		panel_7 = new JPanel();
		tabbedPane.addTab("Ficheros", null, panel_7, null);

		btnLeerTxt = new JButton("Leer canciones de TXT");
		btnLeerTxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonLeerTxtPulsado();
			}
		});

		btnEscribirTxt = new JButton("Guardar canciones en TXT");
		btnEscribirTxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonEscribirTxtPulsado();
			}
		});

		btnLeerBinario = new JButton("Cargar producciones de Binario");
		btnLeerBinario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonLeerBinarioPulsado();
			}
		});

		btnEscribirBinario = new JButton("Guardar producciones en Binario");
		btnEscribirBinario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonEscribirBinarioPulsado();
			}
		});
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(gl_panel_7.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_panel_7.createSequentialGroup().addGap(55).addGroup(gl_panel_7
						.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnEscribirBinario, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 410,
								Short.MAX_VALUE)
						.addComponent(btnLeerBinario, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
						.addComponent(btnEscribirTxt, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
						.addComponent(btnLeerTxt, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
						.addGap(51)));
		gl_panel_7.setVerticalGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup().addGap(78).addComponent(btnEscribirTxt).addGap(30)
						.addComponent(btnLeerTxt).addGap(27).addComponent(btnEscribirBinario).addGap(27)
						.addComponent(btnLeerBinario).addContainerGap(171, Short.MAX_VALUE)));
		panel_7.setLayout(gl_panel_7);
	}

	protected void limpiarCamposProductor() {
		this.nombreProductortextField.setText("");
		this.comboBoxDiscografica.setSelectedIndex(0);

	}

	protected void botonGuardarProductorPulsado() {
		if (this.controlador.addProductor(new Productor(this.nombreProductortextField.getText(),
				this.comboBoxDiscografica.getSelectedItem().toString()))) {
			this.msg("Productor guardado.");
			this.actualizaComboProductor();
		} else {
			this.error("El productor ya estaba almacenado.");
		}

	}

	// Permite seleccionar el fichero mostrando el selector de ficheros, y llama al m�todo escribirCancionesOrdenadasEnTxt(File fichero) 
	// del controlador. El m�todo del controlador lanzar� las excepciones que genere. 
	// Este m�todo capturar� las excepciones y mostrar� un mensaje de confirmaci�n o de error mediante los 
	// m�todos msg("...") y error("...").
	protected void botonEscribirTxtPulsado() {
		this.selectorFicheros.setFileFilter(this.filtroTxt);
		int op = this.selectorFicheros.showOpenDialog(this);
		if (op == JFileChooser.APPROVE_OPTION) {
			File fichero = this.selectorFicheros.getSelectedFile();
			try {
				this.controlador.escribirCancionesOrdenadasEnTxt(fichero);
				this.msg("Fichero de texto generado correctamente");
			} catch (IOException e) {
				this.error("El fichero de texto no ha podido generarse");
				e.printStackTrace();
			}
		}
	}

	//lee el txt e indica cu�ntas canciones hay guardadas
	protected void botonLeerTxtPulsado() {
		this.selectorFicheros.setFileFilter(this.filtroTxt);
		int op = this.selectorFicheros.showOpenDialog(this);
		if (op == JFileChooser.APPROVE_OPTION) {
			File fichero = this.selectorFicheros.getSelectedFile();
			try {
				int numCanciones = this.controlador.numCancionesLeidasDeTxt(fichero);

				this.msg("Hay " + numCanciones + " en el txt.");

			} catch (FileNotFoundException e) {
				this.error("El fichero de texto no ha podido cargarse porque el fichero no se encuentra");
				e.printStackTrace();
			} catch (IOException e) {
				this.error("El fichero de texto no ha podido cargarse");
				e.printStackTrace();
			}
		}

	}

	protected void botonEscribirBinarioPulsado() {
		this.selectorFicheros.setFileFilter(this.filtroSer);
		int op = this.selectorFicheros.showOpenDialog(this);
		if (op == JFileChooser.APPROVE_OPTION) {
			File fichero = this.selectorFicheros.getSelectedFile();

			try {
				this.controlador.escribirProduccionesEnBinario(fichero);
			} catch (FileNotFoundException e) {
				this.error("No se ha encontrado el fichero binario");
				e.printStackTrace();
			} catch (IOException e) {
				this.error("Ha ocurrido un error en la escritura del fichero binario");
				e.printStackTrace();
			}

		}

	}

	protected void botonLeerBinarioPulsado() {
		this.selectorFicheros.setFileFilter(this.filtroSer);
		int op = this.selectorFicheros.showOpenDialog(this);
		if (op == JFileChooser.APPROVE_OPTION) {
			File fichero = this.selectorFicheros.getSelectedFile();
			try {
				this.controlador.leerYcargarProduccionesDeBinario(fichero);
				this.actualizaComboProductor();
				this.msg("Datos cargados correctamente.");
			} catch (FileNotFoundException e) {
				this.error("No se ha encontrado el fichero binario");
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				this.error("Casteo incorrecto");
				e.printStackTrace();
			} catch (IOException e) {
				this.error("Ha ocurrido un error en la lectura del fichero binario");
				e.printStackTrace();
			}
		}

	}

	protected void botonListarPulsado() {
		if (this.rdbtnListarTodasCanciones.isSelected()) {
			this.textArea.setText(this.controlador.getListadoTodasCanciones());
		} else if (this.rdbtnListarArtistasNumCanciones.isSelected()) {
			this.textArea.setText(this.controlador.getListadoArtistasNumCanciones());
		} else if (this.rdbtnListarProductorasVisualizaciones.isSelected()) {
			this.textArea.setText(this.controlador.getListado3DiscograficasMasVisualizaciones());
		}

	}

	protected void botonCancelarPulsado() {
		limpiarCampos();

	}

	protected void limpiarCampos() {
		this.rdbtnListarTodasCanciones.setSelected(true);
		this.rdbtnListarArtistasNumCanciones.setSelected(false);
		this.rdbtnListarProductorasVisualizaciones.setSelected(false);
		this.textArea.setText("");

	}

	protected void botonGuadarPulsado() {
		if (this.nombreTextField.getText().isEmpty() || this.artistaTextField.getText().isEmpty()
				|| numReproduccionesTextField.getText().isEmpty()) {
			this.error("Debe rellenar todos los campos");
		} else {
			try {
				int numReproducciones = Integer.parseInt(this.numReproduccionesTextField.getText());

				if (this.controlador.guardarCancion(this.nombreTextField.getText(), this.artistaTextField.getText(),
						(Productor) this.productorComboBox.getSelectedItem(), numReproducciones)) {
					this.msg("Canci�n guardada");
					this.limpiaCampos();
				} else {
					this.error("Esa canci�n ya exist�a");
				}

			} catch (NumberFormatException e) {
				this.error("Debe escribir un n�mero en el campo generaci�n");
			}
		}
	}

	public void actualizaComboProductor() {
		productorComboBox.removeAllItems();
		for (Productor productor : this.controlador.getProductores())
			productorComboBox.addItem(productor);
	}

	private void limpiaCampos() {
		this.nombreTextField.setText("");
		this.numReproduccionesTextField.setText("");
		this.artistaTextField.setText("");
		this.productorComboBox.setSelectedIndex(0);
	}

	public void msg(String msg) {
		JOptionPane.showMessageDialog(this, msg, "Correcto", JOptionPane.INFORMATION_MESSAGE);
	}

	public void error(String msg) {
		JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
	}
}
