package Office;

import java.io.PrintStream;
import java.util.ArrayList;

import People.Date;
import People.Person;

public class Boss extends Person {

	private ArrayList<Worker> workers = new ArrayList<Worker>();
    private int workersArrayPos = 0;
    
    public Boss(String name, Date dob) {
    	super(name, dob);
	}
    
    public String getName() {
    	return super.getName();
    }
    
	public ArrayList<Worker> getWorkers() {
		return this.workers;
	}

	public void setWorkers(ArrayList<Worker> workers) {
		this.workers = workers;
	}
	
	public void setWorkersArray(ArrayList<Worker> worker) {
        this.workers = worker;
    }
    
    public void setWorker(Worker worker) {
        this.workers.add(worker);
    }
    
    protected void add_worker(Worker worker) {
		this.workers.add(worker);
	}
	
	protected void sub_worker(Worker worker) {
		this.workers.remove(worker);
	}
	
	public Worker next() {
		if(this.workersArrayPos + 1 <= this.workers.size()) {	
			return this.workers.get(this.workersArrayPos++);
		}
		return null;
	}
	
	public void reset() {
		this.workersArrayPos = 0;
	}
	
	public void printAllWorkers() {
		String textToPrint = "Workers of " + this.getName() + ": \n";
		int i = 1;
		if(this.workers.size() > 0) {
			for(Worker worker : this.workers) {
				textToPrint += i++ + ". " + worker.getName() + "\n";
			}
		} else {
			textToPrint += "NONE";
		}
		System.out.println(textToPrint);
	}
    
    public void print(PrintStream ps) {
        String textToPrint = super.getName() + ": born on " + super.getDob().toString() + " bosses: ";
        
        for (Worker worker : this.workers)
        	textToPrint += worker.getName() + " ";
       
        ps.println(textToPrint);
    }

}
