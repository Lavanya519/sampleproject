package task6;

public class InvalidAgeRangeException extends Exception{

	private static final long serialVersionUID = 1L;
    @Override
	public String toString() {
    	
		return "CustomException: InvalidAgeRangeException. you are not eligible";
	}

}
