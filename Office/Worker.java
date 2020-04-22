package Office;

import java.io.PrintStream;

import People.Date;
import People.Person;

public class Worker extends Person {

	private Boss boss;
	
	public Worker(String name, Date dob, Boss boss) {
		super(name, dob);
		this.boss = boss;
		boss.setWorker(this);
	}
	
	public String getName() {
    	return super.getName();
    }

	public Person getBoss() {
		return boss;
	}

	public void setBoss(Boss boss) {
		this.boss = boss;
	}
	
	public void new_boss(Boss boss) {
		this.boss.sub_worker(this);
		boss.add_worker(this);
	}
	
	public void print(PrintStream ps) {
		ps.println(this.getName() + ": born on " + this.getDob().toString() + " is bossed by " + this.boss.getName());
    }

}
