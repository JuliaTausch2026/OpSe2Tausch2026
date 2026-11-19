package gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import business.Cafe;
import business.CafeModel;
import javafx.stage.Stage;

public class CafeControl {
	
	private CafeView cafeview;
	private CafeModel cafemodel;
	
	public CafeControl(Stage primaryStage) {
		cafemodel = new CafeModel();
		cafeview = new CafeView(this, primaryStage, cafemodel);
	}
	
	
     void leseAusDatei(String typ){
    	try {
      		if("csv".equals(typ)){
      			cafemodel.leseCafeAusCsvDatei();
      	  			cafeview.zeigeInformationsfensterAn(
      	  	   			"Das Cafe wurde gelesen!");
      		}
       		else{
	   			cafemodel.leseCafeAusTxtDatei();
  	  			cafeview.zeigeInformationsfensterAn(
      	  	   			"Das Cafe wurde gelesen!");
	   		}
		}
		catch(IOException exc){
			cafeview.zeigeFehlermeldungsfensterAn(
				"IOException beim Lesen!");
		}
		catch(Exception exc){
			exc.printStackTrace();
			cafeview.zeigeFehlermeldungsfensterAn(
				"Unbekannter Fehler beim Lesen!");
		}
	}
		
	 void schreibeCafesInCsvDatei() {
		try {
			cafemodel.schreibeCafesInModel();
   			cafeview.zeigeInformationsfensterAn(
	   			"Die Cafes wurden gespeichert!");
		}	
		catch(IOException exc){
			cafeview.zeigeFehlermeldungsfensterAn(
				"IOException beim Speichern!");
		}
		catch(Exception exc){
			cafeview.zeigeFehlermeldungsfensterAn(
				"Unbekannter Fehler beim Speichern!");
		}
	}

}
