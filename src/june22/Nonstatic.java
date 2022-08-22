package june22;

public class Nonstatic {
int a,b,c;
double x,y,z;
public void multiplication()
{
	a=87;
	b=56;
	c=a*b;
	System.out.println(c);
}
public void division()
{
	x=9856;
	y=56;
	z=x/y;
	System.out.println(z);
}
	public static void main(String[] args) {
		Nonstatic x =new Nonstatic();
		x.multiplication();
		x.division();
	}

}
