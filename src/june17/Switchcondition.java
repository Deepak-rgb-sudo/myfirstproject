package june17;

public class Switchcondition {

	public static void main(String[] args) {
		String course="selenium";
		switch (course) {
		case "selenium":
			System.out.println("course is available::"+course);
			break;
		case "qtp":
			System.out.println("course is available::"+course);
			break;
		case "java":
			System.out.println("course is available::"+course);
			break;
		case "manual testing":
			System.out.println("course is available::"+course);
			break;
		default:
			System.out.println("course is not available     "+course);
			break;
		}

	}

}
