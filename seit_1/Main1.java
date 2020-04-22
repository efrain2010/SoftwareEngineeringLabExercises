package seit_1;

import Office.Boss;
import Office.Worker;
import People.Date;
import People.Lop;

public class Main1 {
    
    public static void main(String[] args)
    {
    	testPersonClass();
    }
    
    public static void testPersonClass() {
    	Boss b1 = new Boss("John", new Date(1, 2, 1989));
		Boss b2 = new Boss("Marjan", new Date(12, 6, 1956));
		Worker w1 = new Worker("Jack", new Date(23, 12, 1974), b1);
		Worker w2 = new Worker("Jim 1", new Date(23, 12, 1974), b1);
		Worker w3 = new Worker("Jim 2", new Date(23, 12, 1974), b1);
		Worker w4 = new Worker("Jim 3", new Date(23, 12, 1974), b1);
		
    }
    
    public static void testDateClass() {
    	Date newDate = new Date(12, 6, 1989);
        newDate.print(System.err);
        
        newDate.setDay(6);
        newDate.setMonth(1);
        newDate.setYear(2001);
        System.out.println("\n");
        System.out.println(newDate.getDay());
        System.out.println(newDate.getMonth());
        System.out.println(newDate.getYear());
        
        Date newDate2 = new Date(12, 6, 2989);
        System.out.println(newDate.diffInYears(newDate2));
        
        newDate.print(System.err);
    }

}