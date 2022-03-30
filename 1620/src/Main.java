public class Main{
	public static void main(String[] args){
		final int INT1 = 1;
		final int INT2 = 2;
		int result = INT1+INT2;
		System.out.println(INT1+"+"+INT2+"="+result);
		final int INT3 = 10;
		result = INT3/INT2;
		System.out.println(INT3+"/"+INT2+"="+result);
		result = INT3-INT2;
		System.out.println(INT3+"-"+INT2+"="+result);
		final int INT4 = INT3+1;
		result = INT4%INT2;
		System.out.println("Остаток " + result);
		boolean bool = (INT4>INT3);
		int i = 1;
		int ii = 9;
		System.out.println(bool+" "+i+" "+ii);
		i++;
		ii--;
		System.out.println(i+" "+ii);
	}
}
