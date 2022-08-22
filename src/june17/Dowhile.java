package june17;

public class Dowhile {

	public static void main(String[] args) throws Throwable {
		//print even numbers from 
		int i=1;
		do {
			Thread.sleep(2000);
			System.out.println(i);
			i+=2;
		} while (i<=20);

	}

}
