package fileCreatorsTausch;

import java.io.IOException;

public abstract class ReaderCreatorTausch {
	public abstract ReaderProductTausch factoryMethod(String typ) throws IOException;
}
