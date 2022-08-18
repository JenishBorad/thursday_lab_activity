/*Create a class Account for a customer that takes the fields account number,name,email and amount
use getter and setter methods to achieve encapsulation and display the fields.*/

class coustomer
{
	int number;
	String name,email;
	float amount;


public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
}

public class account {

	public static void main(String[] args) {
		coustomer c = new coustomer();
		c.setNumber(10);
		c.getNumber();
		System.out.println(c.getNumber());
		c.setName("shubham");
		c.getName();
		System.out.println(c.getName());
		c.setEmail("shubham70@gmail.com");
		c.getEmail();
		System.out.println(c.getEmail());
		c.setAmount(10000);
		c.getAmount();
		System.out.println(c.getAmount());
		
		
	}

}
