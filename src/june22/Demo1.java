package june22;

public class Demo1 {
public static void addition(int x, int y)
{
	int z=x+y;
	System.out.println(z);
}
public static String verifyString(String str1, String str2)
{
	String res ="";
	if(str1.equals(str2))
	{
		res ="String are Equal";
	}
	else
	{
		res="String are not Equal";
	}
	return res;
}
public static boolean comparevalue(int a, int b)
{
	if(a==b)
	{
		return true;
	}
	else
	{
		return false;
	}
}

	public static void main(String[] args) {
		Demo1.addition(5688, 568);
	String result=Demo1.verifyString("Hello", "Hello");
	System.out.println(result);
		boolean r=Demo1.comparevalue(100,100);
		System.out.println(r);
	}

}
