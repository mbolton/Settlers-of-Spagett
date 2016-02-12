package settlers;

import java.util.ArrayList;
import java.util.Random;

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
		
		
		// verticies that specify the size of each tile, actual coordinates do not matter, as they are just used to specify the size.
		
		
		//sets tiles to a list of tiles in random order
		
		
		//Adding random tiles to the five rows
		addTiles();

		
		
		// First row of tiles
//		for(int i = 0; i < 3; i++)
//		{
//			Tile t = new Tile(vertices);
//			t.setFill(Color.GREEN);
//		    row1.getChildren().add(t);
//		}
//		//Second row of tiles
//		for(int i = 0; i < 4; i++)
//		{
//			Tile t = new Tile(vertices);
//			t.setFill(Color.RED);
//		    row2.getChildren().add(t);
//		}
//		//Third row of tiles
//		for(int i = 0; i < 5; i++)
//		{
//			Tile t = new Tile(vertices);
//		    row3.getChildren().add(t);
//		}
//		//Fourth row of tiles
//		for(int i = 0; i < 4; i++)
//		{
//			Tile t = new Tile(vertices);
//			t.setFill(Color.AQUA);
//		    row4.getChildren().add(t);
//		}
//		//Fifth row of tiles
//		for(int i = 0; i < 3; i++)
//		{
//			Tile t = new Tile(vertices);
//			t.setFill(Color.YELLOW);
//		    row5.getChildren().add(t);
//		}
		
		// Sets the margins of each tile to make them align correctly, will need to be adjusted with differed resolutions.
		
	}

	public void addTiles() {
		TilePane row1 =  new TilePane();		
		TilePane row2 =  new TilePane();		
		TilePane row3 =  new TilePane();		
		TilePane row4 =  new TilePane();		
		TilePane row5 =  new TilePane();
		double[] vertices = new double[]{-50.0,-28.75, -50.0,28.75, 0,57.5, 50.0,28.75, 50.0,-28.75, 0,-57.5};
		ArrayList<Tile> tiles = null;
		tiles = randomize(vertices);
		
		System.out.println(getChildren());
//		if(getChildren().get(0) == null)
//			System.out.println("it is null");
		
		while(!getChildren().toString().equals("[]"))
		{
			System.out.println("here");
			getChildren().remove(0);
		}
		getChildren().addAll(row1, row2, row3, row4, row5);
		int index = 0;
		for(int i = 0; i < 3; i ++)
		{
			row1.getChildren().add(tiles.get(index));
			index++;
			row5.getChildren().add(tiles.get(index));
			index++;
		}
		
		for(int i = 0; i < 4; i ++)
		{
			row2.getChildren().add(tiles.get(index));
			index++;
			row4.getChildren().add(tiles.get(index));
			index++;
		}
		for(int i = 0; i < 5; i ++)
		{
			row3.getChildren().add(tiles.get(index));
			index++;
		}
		GameBoard.setMargin(row1, new Insets(0,0,0,100));
		GameBoard.setMargin(row2, new Insets(-28.75,0,0,50));
		GameBoard.setMargin(row3, new Insets(-57.5,0,0,0));
		GameBoard.setMargin(row4, new Insets(-86.25,0,0,50));
		GameBoard.setMargin(row5, new Insets(-115.0,0,0,100));
	}

	//returns arraylist of randomly ordered game tiles
	public ArrayList<Tile> randomize(double[] vertices) {
		
		int wood = 4;
		int wheat = 4;
		int sheep = 4;
		int stone = 3;
		int brick = 3;
		int desert = 1;
		Random rand =  new Random();
		ArrayList<Tile> tiles = new ArrayList<>();
		
		while(tiles.size() < 19)
		{
			int r = rand.nextInt(6) + 1;
			
			switch (r){
			case 1: if(wood != 0){
				tiles.add(new Tile(vertices, "wood"));
				wood--;}
				break;
			case 2: if(wheat != 0){
				tiles.add(new Tile(vertices, "wheat"));
				wheat--;}
				break;
			case 3: if(sheep != 0){
				tiles.add(new Tile(vertices, "sheep"));
				sheep--;}
				break;
			case 4: if(stone != 0){
				tiles.add(new Tile(vertices, "stone"));
				stone--;}
				break;
			case 5: if(brick != 0){
				tiles.add(new Tile(vertices, "brick"));
				brick--;}
				break;
			case 6: if(desert != 0){
				tiles.add(new Tile(vertices, "desert"));
				desert--;}
				break;
			default: break;
			}
		}
		
		return tiles;
		
	}
}
