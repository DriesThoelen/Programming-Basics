package be.pxl.h6.exoef7;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class H6ExOef7JTabel {

	public static void main(String[] args) {

		DefaultTableModel dtm = new DefaultTableModel(0, 0);
		JDesktopPane desktop = new JDesktopPane();
		JFrame mainframe = new JFrame();
		JInternalFrame frame = new JInternalFrame();
		JTable tabel = new JTable();
		Scanner keyboard = new Scanner(System.in);

		int im;
		int iv;
		int aanvraagnr = 1;
		int aantalKopers = 0;
		int aantalKopersSocialeWoning = 0;
		int hoogsteInkomen = 0;
		boolean alleenstaande = false;
		boolean hoogsteInkomenAlleenstaandeMan = false;
		boolean hoogsteInkomenAlleenstaandeVrouw = false;
		boolean hoogsteInkomenGezin = false;
		String code = null;
		String nm = null;
		String nv = null;
		String header[] = new String[] { "<html>aanvraagnr</html>", "<html><left>familie naam</left></html>", "<html>prioriteit</html>", "<html><left>bouwlening<br>stad</br></left></html>" };
		
		dtm.setColumnIdentifiers(header);
		tabel.setModel(dtm);
		
		do {
			System.out.println("Geef in of de betrokken koper in een sociale woning woont en zo ja vanaf welk jaar d.m.v een code (J gevolgd door jaartal of N)");
			code = keyboard.nextLine();
		} while (!(controleerCode(code)));

		while (!(code.equalsIgnoreCase("STOP"))) {
			
			String antwoordSocialeWoning = code.substring(0, 1);
			if (antwoordSocialeWoning.equalsIgnoreCase("J")) {
				aantalKopersSocialeWoning++;
			}
			
			do {
				System.out.println("Geef de achternaam en voornaam van de man in (gescheiden door een underscore) (indien niet van toepassing, voer xx in)");
				nm = keyboard.nextLine();
			} while (!(controleerNaamMan(nm)));

			do {
				System.out.println("Geef de achternaam en voornaam van de vrouw in (gescheiden door een underscore) (indien niet van toepassing, voer xx in)");
				nv = keyboard.nextLine();
			} while (!(controleerNaamVrouw(nv)));

			if (!(nm.equalsIgnoreCase("xx"))) {
				System.out.println("Geef het inkomen van de man in");
				im = keyboard.nextInt();
			} else {
				im = 0;
			}

			if (!(nv.equalsIgnoreCase("xx"))) {
				System.out.println("Geef het inkomen van de vrouw in");
				iv = keyboard.nextInt();
			} else {
				iv = 0;
			}

			if ((nm.equalsIgnoreCase("xx")) && (nv.equalsIgnoreCase("xx"))) {
				System.out.println("Foutieve ingave. Minstens één naam is vereist. Invoer start opnieuw.");
				
				keyboard.nextLine();

				System.out.println("Geef in of de betrokken koper in een sociale woning woont en zo ja vanaf welk jaar d.m.v een code (J gevolgd door jaartal of N)");
				code = keyboard.nextLine();
			} else {
				StringBuilder familienaam = new StringBuilder();
				if ((nm.equalsIgnoreCase("xx")) || (nv.equalsIgnoreCase("xx"))) {
					alleenstaande = true;
					if (nm.equalsIgnoreCase("xx")) {
						if (iv > hoogsteInkomen) {
							hoogsteInkomen = iv;
							hoogsteInkomenAlleenstaandeMan = false;
							hoogsteInkomenAlleenstaandeVrouw = true;
							hoogsteInkomenGezin = false;
						}
						String[] nvarray = nv.split("_");
						familienaam.append("Mevrouw " + nvarray[1].substring(0, 1).toUpperCase() + ". " + nvarray[0].substring(0, 1).toUpperCase() + nvarray[0].substring(1).toLowerCase());
					} else {
						if (im > hoogsteInkomen) {
							hoogsteInkomen = im;
							hoogsteInkomenAlleenstaandeMan = true;
							hoogsteInkomenAlleenstaandeVrouw = false;
							hoogsteInkomenGezin = false;
						}
						String[] nmarray = nm.split("_");
						familienaam.append("Mijnheer " + nmarray[1].substring(0, 1).toUpperCase() + ". " + nmarray[0].substring(0, 1).toUpperCase() + nmarray[0].substring(1).toLowerCase());
					}
				} else {
					alleenstaande = false;
					if (im + iv > hoogsteInkomen) {
						hoogsteInkomen = im + iv;
						hoogsteInkomenAlleenstaandeMan = false;
						hoogsteInkomenAlleenstaandeVrouw = false;
						hoogsteInkomenGezin = true;
					}
					String[] nvarray = nv.split("_");
					String[] nmarray = nm.split("_");
					familienaam.append("De Heer en Mevrouw " + nmarray[1].substring(0, 1).toUpperCase() + ". " + nmarray[0].substring(0, 1).toUpperCase() + nmarray[0].substring(1).toLowerCase() + " - " + nvarray[0].substring(0, 1).toUpperCase() + nvarray[0].substring(1).toLowerCase());
				}
				System.out.println("Geef het aantal kinderen in");
				int ak = keyboard.nextInt();

				int prioriteitsnummer = berekenPrioriteitsnummer(code, im, iv, ak);
				StringBuilder bouwleningStad = new StringBuilder();
				bouwleningStad = berekenBouwleningStad(alleenstaande, code, im, iv, ak, bouwleningStad);

				StringBuilder prioriteit = new StringBuilder();
				prioriteit.setLength(5);
				
				for (int count = 0; count < prioriteitsnummer; count++) {
					prioriteit.setCharAt(count, '*');
				}

				addDataToTable(aanvraagnr, familienaam, prioriteit, bouwleningStad, dtm);

				aanvraagnr++;
				aantalKopers++;
			}

			keyboard.nextLine();

			System.out.println("Geef in of de betrokken koper in een sociale woning woont en zo ja vanaf welk jaar d.m.v een code (J gevolgd door jaartal of N)");
			code = keyboard.nextLine();

		}

		if (aantalKopers != 0) {
			TekenTabel(tabel, dtm, desktop, mainframe, frame);

			double percentageKopersSocialeWoning = ((double) aantalKopersSocialeWoning / (double) aantalKopers) * 100;

			System.out.printf("%s %.1f %s %n", "Percent kopers in een sociale woning :", percentageKopersSocialeWoning,
					"%");

			System.out.println("Hoogste inkomen : " + hoogsteInkomen + "€");
			if (hoogsteInkomenAlleenstaandeMan == true) {
				System.out.println("Het hoogste inkomen behoort toe tot een alleenstaande man.");
			} else {
				if (hoogsteInkomenAlleenstaandeVrouw == true) {
					System.out.println("Het hoogste inkomen behoort toe tot een alleenstaande vrouw.");
				} else {
					if (hoogsteInkomenGezin == true) {
						System.out.println("Het hoogste inkomen behoort toe tot een gezin.");
					}
				}
			}
		}

		keyboard.close();
	}

	public static boolean controleerCode(String code) {
		
		if ((code.substring(0,1).equalsIgnoreCase("N") && (code.length() == 1)) || ((code.substring(0,1).equalsIgnoreCase("J")) && (code.substring(1).matches("[0-9]+"))) || (code.equalsIgnoreCase("STOP"))) {
			return true;
		} else {
			System.err.println("Foutieve ingave. Code moet bestaan uit N of J gevolgd door jaartal.");
			return false;
		}
	}
	
	public static boolean controleerNaamMan(String nm) {
		
		if ((nm.equalsIgnoreCase("XX")) || (nm.matches("[a-z]+_[a-z]+")) || (nm.matches("[A-Z]+_[A-Z]+")) || (nm.matches("[A-Z][a-z]+_[A-Z][a-z]+"))) {
			return true;
		} else {
			System.err.println("Foutieve ingave. Achternaam en voornaam man mag enkel bestaan uit hoofdletters en kleine letters en moet gescheiden worden door een underscore");
			return false;
		}
	}
	
	public static boolean controleerNaamVrouw(String nv) {
		
		if ((nv.equalsIgnoreCase("XX")) || (nv.matches("[a-z]+_[a-z]+")) || (nv.matches("[A-Z]+_[A-Z]+")) || (nv.matches("[A-Z][a-z]+_[A-Z][a-z]+"))) {
			return true;
		} else {
			System.err.println("Foutieve ingave. Achternaam en voornaam vrouw mag enkel bestaan uit hoofdletters en kleine letters en moet gescheiden worden door een underscore");
			return false;
		}
	}
	
	public static int berekenPrioriteitsnummer(String code, int im, int iv, int ak) {

		Calendar date = Calendar.getInstance();
		int prioriteitsnummer = 0;
		int jaartal = 0;

		String antwoordSocialeWoning = code.substring(0, 1);
		if (antwoordSocialeWoning.equalsIgnoreCase("J")) {
			jaartal = Integer.valueOf((code.substring(1, 5)));
		}

		int huidigjaar = date.get(Calendar.YEAR);

		int aantalJarenInSocialeWoning = huidigjaar - jaartal;

		int gi = im + iv;

		if (antwoordSocialeWoning.equalsIgnoreCase("J") && (aantalJarenInSocialeWoning < 5)) {
			prioriteitsnummer = 5;
		} else {
			if ((gi < 2000) && (ak >= 3)) {
				prioriteitsnummer = 1;
			} else {
				if ((gi < 2000) && (ak < 3)) {
					prioriteitsnummer = 2;
				} else {
					if ((gi >= 2000) && (gi < 2500)) {
						prioriteitsnummer = 3;
					} else {
						prioriteitsnummer = 4;
					}
				}
			}
		}

		return prioriteitsnummer;
	}

	public static StringBuilder berekenBouwleningStad(boolean alleenstaande, String code, int im, int iv, int ak, StringBuilder bouwleningStad) {

		String antwoordSocialeWoning = code.substring(0, 1);

		int gi = im + iv;

		if (antwoordSocialeWoning.equalsIgnoreCase("N")) {
			if (ak >= 1 && gi < 1500) {
				bouwleningStad.setLength(antwoordSocialeWoning.length());
				bouwleningStad.append("J");
			}
		}

		return bouwleningStad;
	}

	public static void addDataToTable(int aanvraagnr, StringBuilder familienaam, StringBuilder prioriteit, StringBuilder bouwleningStad, DefaultTableModel dtm) {
		
		dtm.addRow(new Object[] { aanvraagnr + ".", familienaam, prioriteit, bouwleningStad });
		
	}
	
	static class WordWrapCellRenderer extends JTextArea implements TableCellRenderer {

		private static final long serialVersionUID = 1L;

		WordWrapCellRenderer() {
	        setLineWrap(true);
	        setWrapStyleWord(true);
	    }

	    public Component getTableCellRendererComponent(JTable tabel, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
	        setText(value.toString());
	        setSize(tabel.getColumnModel().getColumn(column).getWidth(), Short.MAX_VALUE);
	        return this;
	    }
	}
	
	static class HeaderRenderer implements TableCellRenderer {

	    DefaultTableCellRenderer renderer;

	    public HeaderRenderer(JTable tabel) {
	        renderer = (DefaultTableCellRenderer)
	            tabel.getTableHeader().getDefaultRenderer();
	        renderer.setHorizontalAlignment(JLabel.LEFT);
	    }
	    
	    public Component getTableCellRendererComponent(JTable tabel, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
	        return renderer.getTableCellRendererComponent(tabel, value, isSelected, hasFocus, row, column);
	    }
	}
	
	public static void updateRowHeights(JTable tabel) {
		
	    for (int row = 0; row < tabel.getRowCount(); row++) {
	        int rowHeight = tabel.getRowHeight();
	        for (int column = 0; column < tabel.getColumnCount(); column++) {
	            Component comp = tabel.prepareRenderer(tabel.getCellRenderer(row, column), row, column);
	            rowHeight = Math.max(rowHeight, comp.getPreferredSize().height);
	        }
	        tabel.setRowHeight(row, rowHeight);
	    }
	}

	public static void TekenTabel(JTable tabel, DefaultTableModel dtm, JDesktopPane desktop, JFrame mainframe, JInternalFrame frame) {
		
		tabel.getTableHeader().setPreferredSize(new Dimension(tabel.getColumnModel().getTotalColumnWidth(), 32));
		tabel.getTableHeader().setDefaultRenderer(new HeaderRenderer(tabel));
		tabel.getColumnModel().getColumn(0).setPreferredWidth(100);
		tabel.getColumnModel().getColumn(0).setCellRenderer(new WordWrapCellRenderer());
		tabel.getColumnModel().getColumn(1).setPreferredWidth(300);
		tabel.getColumnModel().getColumn(1).setCellRenderer(new WordWrapCellRenderer());
		tabel.getColumnModel().getColumn(2).setPreferredWidth(80);
		tabel.getColumnModel().getColumn(2).setCellRenderer(new WordWrapCellRenderer());
		tabel.getColumnModel().getColumn(3).setPreferredWidth(120);
		tabel.getColumnModel().getColumn(3).setCellRenderer(new WordWrapCellRenderer());
		
		updateRowHeights(tabel);
		
		desktop.add(frame);

		mainframe.setContentPane(desktop);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.setSize(480, 500);
		mainframe.setLocationRelativeTo(null);
		mainframe.setVisible(true);

		JScrollPane scroll = new JScrollPane(tabel);
		frame.getContentPane().add(scroll, BorderLayout.EAST);
		frame.setTitle("Tabel");
		frame.setResizable(true);
		frame.setClosable(true);
		frame.setMaximizable(true);
		frame.setIconifiable(true);
		frame.pack();
		frame.setVisible(true);
	}
}