package Lab9;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		Invoker invokerObject = new Invoker();
		MyCom myComObject = new MyCom();
		myComObject.set_name("Efraín");
		invokerObject.register(myComObject);
		invokerObject.run();
		
		myComObject.set_name("Manuel");
		invokerObject.register(myComObject);
		invokerObject.run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
