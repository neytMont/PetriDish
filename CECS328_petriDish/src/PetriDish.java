import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.Point;
import java.util.*;
import java.lang.*;
import java.io.*;

public class PetriDish
{
	//use the star wars point and map as a basis for this project. use point location as
	//a starting point to check if there is an element horizontal,vertical, and diagonal to the element.
	private char [][] petriDish; //petriDish is a 2D array with asterisk
	public char [] letter = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	int row = 8;
	int col = 25;
	/**
	 * Making the default petri dish. Not populated yet
	 */
	public PetriDish() 
	{
		petriDish = new char [row][col];
	}
	
	
	/**
	 * Reading the file and making the matrix/xy-coordinates
	 */
	public void loadTxt() 
	{
		String fileName = "input.txt";
		Scanner fromFile = null;
		try 
		{
			fromFile = new Scanner(new File(fileName));
			do 
			{
				for(int i = 0; i < row; i++) 
				{
					String scanLine = fromFile.nextLine();
					char [][] matrix = new char [row][col];
					
					for(int j = 0; j < matrix[i].length; j++) 
					{
						matrix[0] = scanLine.toCharArray();
						
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
		/**
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
	
	public void showDish(Point p) 
	{
		for(int i = 0; i < row; i++) 
		{
			for(int j = 0; j < col; j++) 
			{
				//System.out.print(ish[i][j]);
			}
		}
	}
	
}
