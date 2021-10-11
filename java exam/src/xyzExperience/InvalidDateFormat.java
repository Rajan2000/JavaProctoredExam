package xyzExperience;

@SuppressWarnings("serial")
public class InvalidDateFormat extends Exception{
	@Override
	public String toString() {
		return ("Date must be in DD/MM/YYYY format. (eg. 24/02/2000)");
	}
}