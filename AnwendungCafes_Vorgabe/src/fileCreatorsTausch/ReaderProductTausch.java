package fileCreatorsTausch;

import java.io.IOException;

public abstract class ReaderProductTausch {
	public abstract String[] leseAusDatei() throws IOException;
	
	public abstract void schliesseDatei() throws IOException;
}
