package comparable_interface;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class EmployDriver {
	
	public static void main(String[] args) {
		List<Employ> l1 = new ArrayList<>();
		Employ e1 = new Employ("Mohan" , 21 , 349382 , 23);
		Employ e2 = new Employ("Sohan" , 13 , 359382 , 25);
		l1.add(e1);l1.add(e2);
		l1.add(new Employ("JugMohan" , 15 , 358382 , 25));
		l1.add(new Employ("PyareMohan" , 11 , 358382 , 26));
		l1.add(new Employ("RamMohan" , 29 , 378382 , 25));
		l1.add(new Employ("ShyamMohan" ,8 , 358382 , 29));
		l1.add(new Employ("JugMohan" , 29 , 398382 , 25));
		l1.add(new Employ("JugMohan" , 20 , 388382 , 28));
		l1.add(new Employ("Vishal" , 22 , 358382 , 25));
		System.out.println("===========All Employs============");
		for(Employ x:l1) {
			System.out.println(x);
		}
		Collections.sort(l1);
		System.out.println("============All Employs after Sorting=============");
		for(Employ x : l1) {
			System.out.println(x);
		}
		
		
	}

}
