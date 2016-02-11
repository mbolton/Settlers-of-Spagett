package settlers;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;


/**
 * @author Marcus Bolton, James Hurst
 */
public class MainDriver extends Application
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		launch(args);
		System.exit(0);
	}
	
	public void start(Stage mainStage)
	{
		mainStage.setTitle("Settlers of Spagett!");
		mainStage.setMinHeight(720);
		mainStage.setMinWidth(1280);
		mainStage.centerOnScreen();
		mainStage.show();
		
		GameScreen screen = new GameScreen();
		Scene scene = new Scene(screen);
		mainStage.setScene(scene);
		


		
		
	
		
	}
}
