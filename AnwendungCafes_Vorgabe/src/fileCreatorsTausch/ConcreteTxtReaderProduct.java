package fileCreatorsTausch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConcreteTxtReaderProduct extends ReaderProductTausch {
	String zeile;
	BufferedReader ein;
	
	public ConcreteTxtReaderProduct() throws IOException {
		ein = new BufferedReader(new FileReader("Cafe.txt"));
	}

	@Override
	public String[] leseAusDatei() throws IOException {
		String[] ergebnisZeile = new String[5];
		int i  = 0;
		while(i < ergebnisZeile.length) {
			zeile = ein.readLine();
			ergebnisZeile[i] = zeile;
			i++;
		}
		return ergebnisZeile;
	}

	@Override
	public void schliesseDatei() throws IOException {
		ein.close();
		
	}

}
