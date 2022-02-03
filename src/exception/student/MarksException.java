package student;

public class MarksException extends Exception {
			
		public MarksException(String message) {System.out.println(message);}
		
		public String toString() {
			return "Marks must be between 0-100";
		}
	}

