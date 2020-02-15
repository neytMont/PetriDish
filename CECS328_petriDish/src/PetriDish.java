import java.util.Scanner;
import java.awt.Point;
import java.util.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;

public class PetriDish
{
	//use the star wars point and map as a basis for this project. use point location as
	//a starting point to check if there is an element horizontal,vertical, and diagonal to the element.
	private char [][] petriDish; //petriDish is a 2D array with asterisk
	public char [] letter = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	/**
	 * Reading the file and making the matrix/xy-coordinates
	 */
	public void loadTxt() 
	{
		Path fileName = Paths.get("input.txt");  //name if the file
		/**
		 * get the program to load the file and then using List read rows 
		 */
		List<String> row = null;
		int col = 0;
		
		try 
		{
			row = Files.readAllLines(fileName);
			for(int i = 0; i < row.size(); i++) 
			{	
				int rowSize = row.get(i).toCharArray().length;
				if(rowSize > col) 
				{
					col = rowSize;
				}
			}
			
		} 
		catch (IOException e) 
		{
			System.out.print("Dude where you at?");
			e.printStackTrace();
		}
		
		/**
		 * make the petriDish as a 2d array using the list
		 */
		petriDish = new char[row.size()][col]; 			
		for(int i = 0; i < petriDish.length; i++) 			
		{
			String rows = row.get(i);
			char [] array2D = rows.toCharArray();
			int j = 0;
			for(char dish : array2D) 
			{
				petriDish[i][j] = dish;
				j++;
			}
		}
		
		/**
		 * print the grid 
		 */
		for(int i = 0; i < petriDish.length; i++)         //go through the rows
		{
			for(int j = 0; j < petriDish[0].length; j++)  //go through the columns
			{
				System.out.print(petriDish[i][j]);            //print the grid with rows and columns
			}
			System.out.println();
		}
		/**
		try 
		{
			fromFile = new Scanner(new File(fileName)); //calling the scanner to open the file
			do 
			{
				for(int i = 0; i < row; i++)  // ARRAYS WONT WORK!!! needs a list/arraylist/vector because I dont know how big the matrix will be
				{
					String scanLine = fromFile.nextLine();
					//char [][] matrix = new char [row][col];
					char [] scanLineArray = scanLine.toCharArray();
					for(int j = 0; j < col; j++) 
					{
						petriDish[i][j] = scanLineArray[j];
						
					}
					//petriDish[row][col] = matrix[row][col];
				}
				
			}while(fromFile.hasNextLine());
			fromFile.close();
			//System.out.print(petriDish[row][col]);
		}
		catch(FileNotFoundException f) 
		{
			System.out.print("File not Found");
		}
		try //try catch exception handling for the file
		{
			
			Scanner scan = new Scanner (new File("C:/Users/15624/eclipse-workspace/CECS328_petriDish/input.txt"));//scan the file 
			while(scan.hasNext()) //if there is still another line of the file
			{	
					while(scan.nextLine() != null) 
					{
						col++;
					}
			}

			for(int i = 0; i < row; i++) 
			{
				for(int j = 0; j < col; j++) 
				{
					if(scan.hasNextInt()) 
					{
						int [][] Dish = new int[i][j];
						Dish[i][j] = scan.nextInt();
						System.out.print(petriDish[i][j]);
					}
				}
			}
			scan.close();
		*/
	}	
	
	/**
	 * A function that will look for an asterisk
	 * @return a Point coordinate that will be used later
	 * Use the returned point to check diagonal, vertical, and horizontal for nearby letters.
	 */
	public Point lookForAsterisk() 
	{
		Point p = new Point(0,0);
		for(int i = 0; i < petriDish.length; i++)         //go through the rows
		{
			for(int j = 0; j < petriDish[0].length; j++)  //go through the columns
			{
				if(petriDish[i][j] == '*') 
				{
					p = new Point(i, j);
					return p;
				}
			}
		}
		return p;
	}
}
