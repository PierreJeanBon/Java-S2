package interfacee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.Box;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractListModel;
import java.awt.SystemColor;

@SuppressWarnings("unused")
public class FenetreProjet {

	private JFrame frmGestionVidotheque;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreProjet window = new FenetreProjet();
					window.frmGestionVidotheque.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FenetreProjet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	private void initialize() {
		frmGestionVidotheque = new JFrame();
		frmGestionVidotheque.getContentPane().setBackground(SystemColor.control);
		frmGestionVidotheque.setTitle("Gestion vid\u00E9otheque");
		frmGestionVidotheque.setBackground(Color.LIGHT_GRAY);
		frmGestionVidotheque.setBounds(100, 100, 666, 390);
		frmGestionVidotheque.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestionVidotheque.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Liste Clients");
		lblNewLabel.setBounds(10, 11, 109, 14);
		frmGestionVidotheque.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Bd");
		rdbtnNewRadioButton.setBounds(10, 173, 109, 23);
		frmGestionVidotheque.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Dictionnaire");
		rdbtnNewRadioButton_1.setBounds(10, 199, 109, 23);
		frmGestionVidotheque.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Dvd");
		rdbtnNewRadioButton_2.setBounds(10, 225, 109, 23);
		frmGestionVidotheque.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Cd");
		rdbtnNewRadioButton_3.setBounds(10, 251, 109, 23);
		frmGestionVidotheque.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Manuel Scolaire");
		rdbtnNewRadioButton_4.setBounds(10, 277, 109, 23);
		frmGestionVidotheque.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Roman");
		rdbtnNewRadioButton_5.setBounds(10, 303, 109, 23);
		frmGestionVidotheque.getContentPane().add(rdbtnNewRadioButton_5);
		
		JLabel lblNewLabel_1 = new JLabel("Liste Produit Dispo");
		lblNewLabel_1.setBounds(125, 177, 109, 14);
		frmGestionVidotheque.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Liste Commande");
		lblNewLabel_2.setBounds(208, 11, 101, 14);
		frmGestionVidotheque.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Emprunter");
		btnNewButton.setBounds(247, 199, 89, 23);
		frmGestionVidotheque.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.setBounds(247, 277, 89, 23);
		frmGestionVidotheque.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Ajouter Client");
		lblNewLabel_3.setBounds(414, 11, 78, 14);
		frmGestionVidotheque.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(495, 29, 86, 20);
		frmGestionVidotheque.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nom");
		lblNewLabel_4.setBounds(446, 32, 46, 14);
		frmGestionVidotheque.getContentPane().add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(495, 60, 86, 20);
		frmGestionVidotheque.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(495, 91, 86, 20);
		frmGestionVidotheque.getContentPane().add(textField_2);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setBounds(446, 63, 46, 14);
		frmGestionVidotheque.getContentPane().add(lblPrenom);
		
		JLabel lblIdClient = new JLabel("Id Client");
		lblIdClient.setBounds(446, 94, 46, 14);
		frmGestionVidotheque.getContentPane().add(lblIdClient);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Occassionnel");
		rdbtnNewRadioButton_6.setBounds(505, 118, 109, 23);
		frmGestionVidotheque.getContentPane().add(rdbtnNewRadioButton_6);
		
		JRadioButton radioButton = new JRadioButton("Fid\u00E8le");
		radioButton.setBounds(438, 118, 62, 23);
		frmGestionVidotheque.getContentPane().add(radioButton);
		
		JButton btnNewButton_2 = new JButton("Ajouter");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnNewButton_2.setBounds(418, 148, 89, 23);
		frmGestionVidotheque.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Annuler");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnNewButton_3.setBounds(525, 148, 89, 23);
		frmGestionVidotheque.getContentPane().add(btnNewButton_3);
		
		JLabel lblAjouterProduit = new JLabel("Ajouter Produit");
		lblAjouterProduit.setBounds(359, 182, 78, 14);
		frmGestionVidotheque.getContentPane().add(lblAjouterProduit);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(447, 200, 86, 20);
		frmGestionVidotheque.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(447, 226, 86, 20);
		frmGestionVidotheque.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(447, 258, 86, 20);
		frmGestionVidotheque.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(446, 320, 86, 20);
		frmGestionVidotheque.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(446, 289, 86, 20);
		frmGestionVidotheque.getContentPane().add(textField_7);
		
		JLabel lblTitre = new JLabel("Titre");
		lblTitre.setBounds(391, 203, 46, 14);
		frmGestionVidotheque.getContentPane().add(lblTitre);
		
		JLabel lblCaractristiques = new JLabel("Caract\u00E9ristiques");
		lblCaractristiques.setBounds(359, 229, 78, 14);
		frmGestionVidotheque.getContentPane().add(lblCaractristiques);
		
		JLabel lblIdDocument = new JLabel("Id document");
		lblIdDocument.setBounds(369, 260, 68, 14);
		frmGestionVidotheque.getContentPane().add(lblIdDocument);
		
		JLabel lblTarif = new JLabel("Tarif");
		lblTarif.setBounds(390, 292, 46, 14);
		frmGestionVidotheque.getContentPane().add(lblTarif);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9");
		lblQuantit.setBounds(390, 323, 46, 14);
		frmGestionVidotheque.getContentPane().add(lblQuantit);
		
		JButton button = new JButton("Ajouter");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
			}
		});
		button.setBounds(552, 225, 89, 23);
		frmGestionVidotheque.getContentPane().add(button);
		
		JButton button_1 = new JButton("Annuler");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
			}
		});
		button_1.setBounds(552, 288, 89, 23);
		frmGestionVidotheque.getContentPane().add(button_1);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Fritsch Matthieu FM001 Fid\u00E8le", "Bordelais Emma BE002 Fid\u00E8le", "Bonazzi PierreJean BO003 Occassionnel"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(20, 31, 178, 135);
		frmGestionVidotheque.getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"CO001: BO003 06/03/2020 - 26/03/2020  225\u20AC", "CO002: FM001 07/04/2020 - 27/04/2020  205,5\u20AC"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setBounds(208, 31, 224, 110);
		frmGestionVidotheque.getContentPane().add(list_1);
		
		JList list_2 = new JList();
		list_2.setModel(new AbstractListModel() {
			String[] values = new String[] {"Blanka, 2019, CDB001, 15\u20AC", "Larousse, Anglais, LAD001, 10\u20AC", "Avatar, James Cameron, ACDVD001, 8\u20AC", "Qui es-tu Alaska ?, John Green, Roman, QJR001, 15\u20AC", "Kid Paddle n\u00B01, Midam, BD, KM001 6\u20AC", "SVT 3\u00B0, Bordas, Manuel Scolaire, SB001, 7\u20AC"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_2.setBounds(125, 202, 109, 140);
		frmGestionVidotheque.getContentPane().add(list_2);
		
		JButton btnNewButton_4 = new JButton("Supprimer");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				list_2.remove(list_2.getSelectedIndex()); //Problème lors du clique sur le bouton supprimer (bcp d'erreurs)
			}
		});
		btnNewButton_4.setBounds(247, 225, 89, 23);
		frmGestionVidotheque.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Quitter");
		btnNewButton_5.setBounds(552, 319, 89, 23);
		frmGestionVidotheque.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Supprimer");
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				list.remove(list.getSelectedIndex()); //Problème lors du clique sur le bouton supprimer (bcp d'erreurs)
			}
		});
		btnNewButton_6.setBounds(525, 173, 89, 23);
		frmGestionVidotheque.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Supprimer");
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				list_2.remove(list_2.getSelectedIndex()); //Problème lors du clique sur le bouton supprimer (bcp d'erreurs)
			}
		});
		btnNewButton_7.setBounds(220, 148, 89, 23);
		frmGestionVidotheque.getContentPane().add(btnNewButton_7);
	}
}
