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
		
		char pts = dish.leftSideCheck(asterisk);
		char pts1 = dish.topLeftCheck(asterisk);
		char pts2 = dish.topRightCheck(asterisk);
		char pts3 = dish.topSideCheck(asterisk);
		char pts4 = dish.rightSideCheck(asterisk);
		char pts5 = dish.lowerRightCheck(asterisk);
		char pts6 = dish.lowerSideCheck(asterisk);
		char pts7 = dish.lowerLeftCheck(asterisk);
		
		
		System.out.print("\n--------------->" + pts + "<--------------");
		System.out.print("\n--------------->" + pts1 + "<--------------");
		System.out.print("\n--------------->" + pts2 + "<--------------");
		System.out.print("\n--------------->" + pts3 + "<--------------");
		System.out.print("\n--------------->" + pts4 + "<--------------");
		System.out.print("\n--------------->" + pts5 + "<--------------");
		System.out.print("\n--------------->" + pts6 + "<--------------");
		System.out.print("\n--------------->" + pts7 + "<--------------");

	}

}
