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
		
		PlayerHand hand = new PlayerHand();
		PlayerHand hand2 = new PlayerHand();
		PlayerHand hand3 = new PlayerHand();
		PlayerHand hand4 = new PlayerHand();
		screen.setTop(hand);
		screen.setRight(hand2);
		screen.setBottom(hand3);
		screen.setLeft(hand4);
		screen.setMargin(hand, new Insets(10,0,0,560));
		screen.setMargin(hand2, new Insets(180,10,0,0));
		screen.setMargin(hand3, new Insets(0,0,10,560));
		screen.setMargin(hand4, new Insets(180,0,0,10));
		
		
	
		
	}
}
