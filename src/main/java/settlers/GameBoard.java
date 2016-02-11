package settlers;

import javafx.geometry.Insets;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
/**
 * @author Marcus Bolton, James Hurst
 *
 */
public class GameBoard extends TilePane
{
	public GameBoard()
	{
		this.maxWidthProperty().bind(heightProperty()); // ensures board dosen't stretch.
		
		//this.getChildren().add(new Tile(new double[]{-115.0,200.0, 115.0,200.0, 231.0,0, 115.0,-200.0, -115.0,-200.0, -231.0,0}));
		//this.getChildren().add(new Tile(new double[]{-231.0,400.0, 231.0,400.0, 462.0,0, 231.0,-400.0, -231.0,-400.0, -462.0,0}));
		//this.getChildren().add(new Tile(new double[]{-400.0,-231.0, -400.0,231.0, 0,462.0, 400.0,231.0, 400.0,-231.0, 0,-462.0}));
		//this.getChildren().add(new Tile(new double[]{-100.0,-57.5, -100.0,57.5, 0,115.0, 100.0,57.5, 100.0,-57.5, 0,-115.0}));
		//{-50.0,-28.75, -50.0,28.75, 0,57.5, 50.0,28.75, 50.0,-28.75, 0,-57.5}
		
		// Tilepanes to hold the 5 rows of tiles for the board.
		TilePane row1 =  new TilePane();		
		TilePane row2 =  new TilePane();		
		TilePane row3 =  new TilePane();		
		TilePane row4 =  new TilePane();		
		TilePane row5 =  new TilePane();
				
		getChildren().addAll(row1, row2, row3, row4, row5);
		
		// verticies that specify the size of each tile, actual coordinates do not matter, as they are just used to specify the size.
		double[] vertices = new double[]{-50.0,-28.75, -50.0,28.75, 0,57.5, 50.0,28.75, 50.0,-28.75, 0,-57.5};
		
		// First row of tiles
		for(int i = 0; i < 3; i++)
		{
			Tile t = new Tile(vertices);
			t.setFill(Color.GREEN);
		    row1.getChildren().add(t);
		}
		//Second row of tiles
		for(int i = 0; i < 4; i++)
		{
			Tile t = new Tile(vertices);
			t.setFill(Color.RED);
		    row2.getChildren().add(t);
		}
		//Third row of tiles
		for(int i = 0; i < 5; i++)
		{
			Tile t = new Tile(vertices);
		    row3.getChildren().add(t);
		}
		//Fourth row of tiles
		for(int i = 0; i < 4; i++)
		{
			Tile t = new Tile(vertices);
			t.setFill(Color.AQUA);
		    row4.getChildren().add(t);
		}
		//Fifth row of tiles
		for(int i = 0; i < 3; i++)
		{
			Tile t = new Tile(vertices);
			t.setFill(Color.YELLOW);
		    row5.getChildren().add(t);
		}
		
		// Sets the margins of each tile to make them align correctly, will need to be adjusted with differed resolutions.
		GameBoard.setMargin(row1, new Insets(0,0,0,100));
		GameBoard.setMargin(row2, new Insets(-28.75,0,0,50));
		GameBoard.setMargin(row3, new Insets(-57.5,0,0,0));
		GameBoard.setMargin(row4, new Insets(-86.25,0,0,50));
		GameBoard.setMargin(row5, new Insets(-115.0,0,0,100));
	}
}
