public class StringOperator {
	public static void main(String args[]) {
		String s1 = "FIRSTNAME_MIDDLENAME_LASTNAME";
		String replaceString = s1.replace("_", ":");
		System.out.println(replaceString);
	}
}