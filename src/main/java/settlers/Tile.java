package settlers;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Polygon;

/**
 * @author Marcus Bolton, James Hurst
 *
 */
public class Tile extends Polygon
{
	String type;
	
	public Tile(double[] verticies, String tileType)
	{
		super(verticies);
		type = tileType;
		
		constructTile();
	}

	// intended to construct type of tile depending on given parameters. At the moment, using colors as fillers
	public void constructTile() {
		if(type.equals("wood"))
			this.setFill(new ImagePattern(new Image("file:resources/wood.png")));
		else if(type.equals("wheat"))
			this.setFill(new ImagePattern(new Image("file:resources/wheat.png")));
		else if(type.equals("sheep"))
			this.setFill(new ImagePattern(new Image("file:resources/sheep.png")));
		else if(type.equals("stone"))
			this.setFill(new ImagePattern(new Image("file:resources/stone.png")));
		else if (type.equals("brick"))
			this.setFill(new ImagePattern(new Image("file:resources/brick.png")));
		else if (type.equals("desert"))
			this.setFill(new ImagePattern(new Image("file:resources/desert.png")));
	}

	
}
