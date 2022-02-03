import java.util.StringTokenizer;

public class SimpleTok{
	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("dd/mm/yyyy","/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}