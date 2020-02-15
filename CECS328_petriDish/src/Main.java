import java.awt.Point;

public class Main 
{

	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		PetriDish dish = new PetriDish();
		dish.loadTxt();
	
		System.out.print(dish.lookForAsterisk());
		Point asterisk = dish.lookForAsterisk();
		dish.leftSideCheck(asterisk);
	}

}
