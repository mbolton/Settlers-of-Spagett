/**
 * 
 */
package settlers;


import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * @author Marcus Bolton, James Hurst
 *
 */
public class PlayerHand extends GridPane
{
	static int pNum = 1;
	public PlayerHand()
	{
//		Button r = new Button("testing");
//		setLeftAnchor(r, 10.0);
//		getChildren().add(r);
		createHand();
	}
	
	public void createHand()
	{
		//label for specific player
		Label playerNum = new Label("Player: " + pNum);
		pNum++;
		//label and textbox for amount of wood
		Label woodLabel = new Label("Wood:");
		TextField woodNum = new TextField("0");
		woodNum.setMaxSize(30, 30);
		//label and textbox for amount of stone
		Label stoneLabel = new Label("Stone:");
		TextField stoneNum = new TextField("0");
		stoneNum.setMaxSize(30, 30);
		//label and textbox for amount of sheep
		Label sheepLabel = new Label("Sheep:");
		TextField sheepNum = new TextField("0");
		sheepNum.setMaxSize(30, 30);
		//label and textbox for amount of brick
		Label brickLabel = new Label("Brick:");
		TextField brickNum = new TextField("0");
		brickNum.setMaxSize(30, 30);
		//label and textbox for amount of wheat
		Label wheatLabel = new Label("Wheat:");
		TextField wheatNum = new TextField("0");
		wheatNum.setMaxSize(30, 30);
		
		
		
		
		//adds player labels and textboxes to board
		add(playerNum, 0, 0);
		add(woodLabel, 0, 1);
		add(woodNum, 1, 1);
		add(brickLabel, 2, 1);
		add(brickNum, 3, 1);
		add(sheepLabel, 0, 2);
		add(sheepNum, 1, 2);
		add(wheatLabel, 2, 2);
		add(wheatNum, 3, 2);
		add(stoneLabel, 0, 3);
		add(stoneNum, 1, 3);
		
	}
}
