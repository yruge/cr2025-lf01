package exercise.the_bloaters;
public class ExtractClass {
// todo extract class TelephoneNumber from class Person
	class Person {
	  private String name;
	  public telephoneNumber telephonenumber;
	  
	  public Person(String name, telephoneNumber telephonenumber) {
		super();
		this.name = name;
		this.telephonenumber = telephonenumber;
	}

	public telephoneNumber getTelephoneNumber() {
		  return telephonenumber;
	  }

	  public String getName() {
		return name;
	  }
	}
	
	class telephoneNumber {
		private String officeAreaCode;
		private String officeNumber;
		
		public telephoneNumber(String officeAreaCode, String officeNumber) {
			super();
			this.officeAreaCode = officeAreaCode;
			this.officeNumber = officeNumber;
		}
		public String getTelephoneNumber() {
				return ("(" + officeAreaCode + ") " + officeNumber);
			  }
			  public String getOfficeAreaCode() {
				return officeAreaCode;
			  }
			  public void setOfficeAreaCode(String arg) {
				officeAreaCode = arg;
			  }
			  public String getOfficeNumber() {
				return officeNumber;
			  }
			  public void setOfficeNumber(String arg) {
				officeNumber = arg;
			  }
	}
}