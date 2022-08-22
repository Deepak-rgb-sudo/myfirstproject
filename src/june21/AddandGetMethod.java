package june21;

import java.util.ArrayList;

public class AddandGetMethod {

	public static void main(String[] args) {
		// store collection of cars into array list
		ArrayList<String> mycars = new ArrayList<String>();
		mycars.add("alto");
		mycars.add("BMW");
		mycars.add("Audi");
		mycars.add("Tata");
		mycars.add("Maruthi");
		mycars.add("mahindra");
		mycars.add("hyundai");
		System.out.println(mycars.get(6));
		System.out.println(mycars.size());
		for(int i=0; i<mycars.size();i++)
		{
			System.out.println(mycars.get(i));
		}
		
	}

}
