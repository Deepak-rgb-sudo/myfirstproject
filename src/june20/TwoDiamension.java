package june20;

public class TwoDiamension {

	 public static void main(String[] args) {
		// store login data
		String login [][]= new String [4][2];//four row two column
		//first row first column
		login [0][0]="Admin1";
		//first row second column
		login [0][1]="Test1";
		//second row first column
		login [1][0]="Admin2";
		//second row second column
		login [1][1]="Test2";
		login [2][0]="Admin3";
		login [2][1]="Test3";
		login [3][0]="Admin4";
		login [3][1]="Test4";
		System.out.println(login.length);//print row length
		System.out.println(login[0].length);//print first row column length
		//iterate all rows
		for(int i=0; i<login.length; i++)
		{
			//iterate all cells
			for(int j=0; j<login[i].length; j++)
			{
				System.out.print(login[i][j]+"\t");//tab space
			}
			System.out.println();//print new line
		}

	}

}
