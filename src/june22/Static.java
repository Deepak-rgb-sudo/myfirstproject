package june22;

public class Static {
static int x,y,z;
static double a,b,c;
public static void addition()
{
	x=876;
	y=76;
	z=x+y;
	System.out.println(z);
}
public static void division()
{
	a=87776;
	b=87;
	c=a/b;
	System.out.println(c);
}
	public static void main(String[] args) {
		Static.division();
		Static.addition();
	}

}
