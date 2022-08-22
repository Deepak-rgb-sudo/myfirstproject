package june20;

public class SingleDiamension {

	public static void main(String[] args) throws Throwable {
		// store integer type into array variable
		int x[]= new int[5];
		x[0]=100;
		x[1]=200;
		x[2]=300;
		x[3]=400;
		x[4]=500;
		for (int each : x) {
			Thread.sleep(1000);
			System.out.println(each);
			
		}

	}

}
