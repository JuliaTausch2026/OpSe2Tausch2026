package fileCreatorsTausch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import business.Cafe;

public class ConcreteCsvReaderProduct extends ReaderProductTausch {
	
	String[] zeile;
	BufferedReader ein;
	
	public ConcreteCsvReaderProduct() throws IOException {
		ein = new BufferedReader(new FileReader("Cafe.csv"));
	
	}

	@Override
	public String[] leseAusDatei() throws IOException {
		String[] zeile = ein.readLine().split(";");
		String[] arr = new String[5];
		arr[0] = zeile[0];
		arr[1] = zeile[1];
		arr[2] = zeile[2];
		arr[3] = zeile[3];
		arr[4] = zeile[4];
		return arr;
	}

	@Override
	public void schliesseDatei() throws IOException {
		ein.close();

	}

}
