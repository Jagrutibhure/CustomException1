package Day3Assignment;

public class CustomException extends Exception {
	String str1;
	CustomException(String str2){
		str1 = str2;
	}
	
public String toString() {
	return (" CustomException Occured: " +str1);
}
}
class system1{
	public static void main(String args[]) {
		try {
			System.out.println(" This is a Exception program");
			throw new CustomException(" This is my error message ");
		}
	catch(CustomException exp) {
		System.out.println(" This is a catch block");
		System.out.println(exp);
	}
}
}
	