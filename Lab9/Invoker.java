package Lab9;

import javax.swing.JOptionPane;

public class Invoker {
	
	private Command command;
	
	public void register(Command command) {
		this.command = command;
	}
	
	public void run() {
		while(true) {
			String userInput = JOptionPane.showInputDialog("Input something");
			if(userInput != null) {
				char firstCharacter = userInput.charAt(0);
				if(firstCharacter == '1' || firstCharacter == '2') {
					command.excecute(firstCharacter);
				} else if(firstCharacter == 'q') {
					break;
				} else {
					System.out.println(firstCharacter);
				}
			} else {
				break;
			}
		}
	}

}
