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
	
	public void leseCafeAusCsvDatei() throws IOException {
		ReaderCreatorTausch c = new ConcreteReaderCreator();
		ReaderProductTausch p = c.factoryMethod("csv");
		String[] daten = p.leseAusDatei();
		p.schliesseDatei();
		this.cafe = new Cafe(daten[0], daten[1], daten[2], daten[3], daten[4].split("_"));
	}
	
	public void leseCafeAusTxtDatei() throws IOException {
		ReaderCreatorTausch c = new ConcreteReaderCreator();
		ReaderProductTausch p = c.factoryMethod("txt");
		String[] daten = p.leseAusDatei();
		p.schliesseDatei();
		this.cafe = new Cafe(daten[0], daten[1], daten[2], daten[3], daten[4].split("_"));
	}
	
	public void schreibeCafesInModel() throws IOException {
		BufferedWriter aus = new BufferedWriter(new FileWriter("cafesAusgabe.csv", true));
		aus.write(this.cafe.gibCafeZurueck(';'));
		aus.close();
	}
}
