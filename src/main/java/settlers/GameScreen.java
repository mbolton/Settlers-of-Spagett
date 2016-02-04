/**
 * 
 */
package settlers;

import javafx.scene.layout.BorderPane;

/**
 * @author Marcus Bolton, James Hurst
 *
 */
public class GameScreen extends BorderPane
{
    public GameScreen()
    {
    	setCenter(new GameBoard(new double[]{-115.0,200.0, 115.0,200.0, 231.0,0, 115.0,-200.0, -115.0,-200.0, -231.0,0}));
    }
}
