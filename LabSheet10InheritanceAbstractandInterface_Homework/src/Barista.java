public class Barista {
	
	private String name;
	private char gender;

	public Barista(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public Barista() {
		this.name = "";
        this.gender = ' ';

	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGenderName() {
		switch (Character.toUpperCase(this.gender)) {
		case 'M':
			return "Male";
		case 'F':
			return "Female";
		default:
			return " ";
		}
	}
}