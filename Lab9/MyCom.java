package Lab9;

public class MyCom implements Command {

	private String name;
	
	public MyCom() {
		// TODO Auto-generated constructor stub
	}
	
	public void set_name(String name) {
		this.name = name;
	}

	@Override
	public void excecute(int number) {
		// TODO Auto-generated method stub
		System.out.println(name + " - " + number);
	}

}
