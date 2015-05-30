package Interface1;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;
import java.util.Locale;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.JEditorPane;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.CardLayout;
import java.awt.GridLayout;

public class InputHoliday extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Panel panel = new Panel();
	private JTextField IdDoct;
	private JTextField PrenDoc;
	private JTextField HolEnd1;
	private JTextField NomDoc;
	private JTextField PlanStart;
	private JTextField PlanEnd;
	private JTextField HolStart1;
	private JTextField HolStart2;
	private JTextField HolEnd2;
	private JTextField HolStart3;
	private JTextField HolEnd3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputHoliday frame = new InputHoliday();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InputHoliday() {
		setTitle("Gestion");
		setBounds(100, 100, 399, 516);
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		Panel panel_5 = new Panel();
		panel_5.setBackground(new Color(51, 102, 255));
		getContentPane().add(panel_5, BorderLayout.CENTER);
		
		Panel panel_6 = new Panel();
		panel_6.setForeground(new Color(51, 51, 255));
		panel_6.setBackground(new Color(51, 102, 255));
		panel_6.setLayout(null);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));
		panel_5.add(panel_6);
		
		JLabel lblStart = new JLabel("Start:");
		lblStart.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblStart.setForeground(new Color(255, 255, 255));
		lblStart.setBounds(69, 188, 57, 26);
		panel_6.add(lblStart);
		
		JLabel lblEnd = new JLabel("End:");
		lblEnd.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEnd.setForeground(new Color(255, 255, 255));
		lblEnd.setBounds(208, 191, 57, 20);
		panel_6.add(lblEnd);
		lblEnd.setVerticalAlignment(SwingConstants.TOP);
		
		Button button = new Button("Valider");
		button.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button.setBounds(239, 322, 73, 30);
		panel_6.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBackground(new Color(0, 255, 0));
		button.setForeground(new Color(240, 255, 240));
		
		JLabel lblPlagin = new JLabel("Planning :");
		lblPlagin.setForeground(new Color(255, 255, 255));
		lblPlagin.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblPlagin.setBounds(69, 344, 104, 30);
		panel_6.add(lblPlagin);
		
		JLabel lblHoliday = new JLabel("Holiday:");
		lblHoliday.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblHoliday.setForeground(new Color(255, 255, 255));
		lblHoliday.setBounds(69, 146, 86, 31);
		panel_6.add(lblHoliday);
		
		PlanStart = new JTextField();
		PlanStart.setBounds(69, 385, 104, 20);
		panel_6.add(PlanStart);
		PlanStart.setColumns(10);
		
		PlanEnd = new JTextField();
		PlanEnd.setBounds(208, 385, 104, 20);
		panel_6.add(PlanEnd);
		PlanEnd.setColumns(10);
		
		JButton btnGerer = new JButton("Gerer");
		btnGerer.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGerer.setBounds(239, 434, 73, 26);
		panel_6.add(btnGerer);
		
		HolEnd1 = new JTextField();
		HolEnd1.setBounds(208, 225, 104, 20);
		panel_6.add(HolEnd1);
		HolEnd1.setColumns(10);
		
		HolStart1 = new JTextField();
		HolStart1.setColumns(10);
		HolStart1.setBounds(69, 225, 104, 20);
		panel_6.add(HolStart1);
		
		HolStart2 = new JTextField();
		HolStart2.setColumns(10);
		HolStart2.setBounds(69, 256, 104, 20);
		panel_6.add(HolStart2);
		
		HolEnd2 = new JTextField();
		HolEnd2.setColumns(10);
		HolEnd2.setBounds(208, 256, 104, 20);
		panel_6.add(HolEnd2);
		
		HolStart3 = new JTextField();
		HolStart3.setColumns(10);
		HolStart3.setBounds(69, 288, 104, 20);
		panel_6.add(HolStart3);
		
		HolEnd3 = new JTextField();
		HolEnd3.setColumns(10);
		HolEnd3.setBounds(208, 288, 104, 20);
		panel_6.add(HolEnd3);
		
		NomDoc = new JTextField();
		NomDoc.setBounds(149, 84, 104, 20);
		panel_6.add(NomDoc);
		NomDoc.setColumns(10);
		
		JLabel lblId = new JLabel("Nom :");
		lblId.setBounds(69, 83, 41, 19);
		panel_6.add(lblId);
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblId.setForeground(new Color(255, 255, 255));
		
		PrenDoc = new JTextField();
		PrenDoc.setBounds(149, 115, 104, 20);
		panel_6.add(PrenDoc);
		PrenDoc.setToolTipText("Entrer le noim du docteur");
		PrenDoc.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Prenom : ");
		lblNewLabel_1.setBounds(69, 116, 64, 19);
		panel_6.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		IdDoct = new JTextField();
		IdDoct.setBounds(149, 53, 104, 20);
		panel_6.add(IdDoct);
		IdDoct.setToolTipText("Entrer le nom du docter");
		IdDoct.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(70, 53, 23, 19);
		panel_6.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel label = new JLabel("Gestion des vacances ");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(87, 11, 185, 24);
		panel_6.add(label);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 383, 487);
		panel_6.add(lblNewLabel_2);

	}



private Locale getLocale(String loc){
	if (loc != null && loc.length() > 0)
	return new Locale(loc);
	else 
	return Locale.US;
	}
}