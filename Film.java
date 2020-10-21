// Waleed Akhtar

public class Film {
	private String name;
	private String code;

	public Film(String name) {
		this.name = name;
		code = "";

		for(int i = 0; i < name.length(); i++) {
			if (i == 0) {
				code = code + name.charAt(i);
			}
			if (name.charAt(i) == ' '){
				code = code + name.charAt(i + 1);
			}
		}
	}

	// Setter and getter for Name
	public void setName(String a) {
		this.name = a;
	}
	
	public String getName() {
		return name;
	}

	// Setter and getter for Code

	public void setCode(String code) {
		this.code = code;
	}

	public void getCode(String b) {
		this.code = b;
	}

	@Override
	public String toString() {
		return "Film Name: " + name + " Code: " + code;
	}

	public void print() {
		System.out.println("Name: " + name + "\nCode: " + code);
	}
}
