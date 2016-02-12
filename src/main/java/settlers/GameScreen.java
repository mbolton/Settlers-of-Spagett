/**
 * 
 */
package settlers;

import java.awt.Color;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;

/**
 * @author Marcus Bolton, James Hurst
 *
 */
public class GameScreen extends BorderPane
{
    public GameScreen()
    {
    	/** |                               |
    	 *  | Need to move to other methods |
    	 * 	V							    V
    	 */
    	GameBoard board = new GameBoard();
    	setCenter(board);
		PlayerHand hand = new PlayerHand();
		PlayerHand hand2 = new PlayerHand();
		PlayerHand hand3 = new PlayerHand();
		PlayerHand hand4 = new PlayerHand();
		
		setTop(hand);
		setRight(hand2);
		setBottom(hand3);
		setLeft(hand4);
		
		setMargin(hand, new Insets(10,0,0,560));
		setMargin(hand2, new Insets(180,10,0,0));
		setMargin(hand3, new Insets(0,0,10,560));
		setMargin(hand4, new Insets(180,0,0,10));
		
		Button randomize = new Button("Randomize");
		setTop(randomize);
		randomize.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				board.addTiles();
			}
		});
		
    	
    }
}
