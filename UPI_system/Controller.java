package UPI_system;

public class Controller {

	service s = null;

	public Controller() {
		s = new service();
	}

	public void withdraw() {

		s.withdraw();

	}

	public void deposit() {

		s.deposit();

	}

}
