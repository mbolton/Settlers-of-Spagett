package settlers;

import javafx.scene.paint.Color;
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
			this.setFill(Color.GREEN);
		else if(type.equals("wheat"))
			this.setFill(Color.WHEAT);
		else if(type.equals("sheep"))
			this.setFill(Color.DARKKHAKI);
		else if(type.equals("stone"))
			this.setFill(Color.DARKGRAY);
		else if (type.equals("brick"))
			this.setFill(Color.FIREBRICK);
		else if (type.equals("desert"))
			this.setFill(Color.BLACK);
	}

	
}
