package primitive_obsession;

import java.util.regex.Pattern;

public class FullName {
	private String name;
	
	public String getName() {
		return name;
	}

	public FullName(String name) {
		if(!isValidName(name)) {
			throw new IllegalArgumentException("name is not valid");
		}
		this.name = name;
	}

	private boolean isValidName(String name) {
		String regex = "^([A-Z\\'][a-z\\']*((\\s)))*[A-Z\\'][a-z\\']*$";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(name).matches();
	}

}
