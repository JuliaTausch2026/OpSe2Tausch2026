package fileCreatorsTausch;

import java.io.IOException;

import business.Cafe;

public class ConcreteReaderCreator extends ReaderCreatorTausch {

	@Override
	public ReaderProductTausch factoryMethod(String typ) throws IOException {
		
		if(typ.equals("csv"))
			return new ConcreteCsvReaderProduct();
		else
			return new ConcreteTxtReaderProduct();
		
	}

}
