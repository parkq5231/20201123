package come.yedam.abstracts;

public abstract class Phone {
	public String owner;

	public Phone() {
	}

	public Phone(String owner) {
		this.owner = owner;
	}

	public void turnOn() {
		System.out.println("폰전원을 켭니다.");
	}

	public void ring() {
		// TODO Auto-generated method stub

	}

	public abstract void turnOff();

}// end of class