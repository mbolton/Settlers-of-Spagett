/**
 * 
 */
package settlers;

import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;

/**
 * @author Marcus Bolton, James Hurst
 *
 */
public class GameScreen extends BorderPane
{
    public GameScreen()
    {
    	setCenter(new GameBoard());
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
    	
    }
}
