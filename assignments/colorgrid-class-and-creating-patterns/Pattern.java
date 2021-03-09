import bridges.connect.Bridges;
import bridges.validation.RateLimitException;

import java.io.IOException;

import bridges.base.Color;
import bridges.base.ColorGrid;

public class Pattern
{
	public static void main(String[] args) throws RateLimitException, IOException
	{
		// instantiate  a Bridges object with your:
		// assignment number
		// your username,
		// and your API key
		Bridges bridges = new Bridges(assignment number, "username", "APIkey");


		// instantiate a ColorGrid object with 15 rows and 15 columns
		ColorGrid grid = new ColorGrid(15, 15);

		// SAMPLE PROBLEM: draw sample pattern (two meager beady eyes)
		drawSample(grid, bridges);


		// PROBLEM 1: Two colors as parameters.  Make every other row a different color.


		// PROBLEM 2: Two colors as parameters.  Make every other column a different color.

		// PROBLEM 3: Two colors as parameters.  Create a checkerboard pattern


		// PROBLEM 4: Two colors as parameters. Make all the border cells one color and all the interior cells another color

		// PROBLEM 5:  Two colors as parameters. Make an “X” design

		// PROBLEM 6: Two colors as parameters. Along the Slope = -1 diagonal, split the grid in half, one color each

		// PROBLEM 7: Five colors as parameters. Show the 4-quadrants in a different color for each. If the ColorGrid has
		// an odd number of rows and an odd number of columns, show the x and y axes in yet
		// another color. Otherwise, the four quadrants will show and the x and y axes will merely
		// be suggested by the color changes

	} // end main method


	// SAMPLE METHOD  (use this as a template)
	public static void drawSample(ColorGrid grid, Bridges bridges) throws RateLimitException, IOException
	{
		//Display a two-eyeballs pattern to the grid (two meager beady eyes -- how lame)
		// first eyeball
		grid.set(5, 6, new Color("yellow"));
		// second eyeball
		grid.set(5, 9, new Color("yellow"));
		// call to the Bridges object called ‘bridges’ -- set the data structure to the Grid type
		bridges.setDataStructure(grid);
		// call to the Bridges object called ‘bridges’ -- show the ColorGrid object called ‘grid’
		bridges.visualize();
	}  // end drawSample


	// METHOD FOR PROBLEM 1


}  // end class
