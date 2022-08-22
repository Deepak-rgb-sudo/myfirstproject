package june20;

public class ForeachStringType {

	public static void main(String[] args) {
		// store string type data into array variable
		String str[]= new String[7];
		str[0]="mon";
		str[1]="tue";
		str[2]="wed";
		str[3]="thr";
		str[4]="fri";
		str[5]="sat";
		str[6]="sun";
		System.out.println(str[2]);
		for (String each : str) {
			System.out.println(each);
			
		}

	}

}
