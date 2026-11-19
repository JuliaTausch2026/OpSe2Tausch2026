package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import fileCreatorsTausch.ConcreteReaderCreator;
import fileCreatorsTausch.ReaderCreatorTausch;
import fileCreatorsTausch.ReaderProductTausch;

public class CafeModel {
	private Cafe cafe;
	
	public Cafe getCafe() {
		return cafe;
	}
	
	public void setCafe(Cafe cafe) {
		this.cafe = cafe;
	}
	
	/*
	public void leseAusDate(String typ) throws IOException {
		BufferedReader ein = new BufferedReader(new FileReader("Cafe.csv"));
			String[] zeile = ein.readLine().split(";");
			this.cafe = new Cafe(zeile[0], 
				zeile[1], 
				zeile[2], 
				zeile[3], 
				zeile[4].split("_"));
				ein.close();
	}
	*/
	
	public void leseCafeAusCsvDatei() throws IOException {
		ReaderCreatorTausch c = new ConcreteReaderCreator();
		ReaderProductTausch p = c.factoryMethod("csv");
		p.leseAusDatei();
		p.schliesseDatei();
	}
	
	public void leseCafeAusTxtDatei() throws IOException {
		ReaderCreatorTausch c = new ConcreteReaderCreator();
		ReaderProductTausch p = c.factoryMethod("txt");
		p.leseAusDatei();
		p.schliesseDatei();
	}
	
	public void schreibeCafesInModel() throws IOException {
		BufferedWriter aus = new BufferedWriter(new FileWriter("cafesAusgabe.csv", true));
		aus.write(this.cafe.gibCafeZurueck(';'));
		aus.close();
	}
}
