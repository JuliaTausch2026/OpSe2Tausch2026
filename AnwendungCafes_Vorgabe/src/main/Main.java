package main;

import gui.CafeControl;
import gui.CafesAnwendungssystem;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		new CafeControl(primaryStage);
	}	
	
	public static void main(String[] args){
		launch(args);
	}
}

// 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
// https://github.com/JuliaTausch2026/OpSe2Tausch2026.git
// variante b