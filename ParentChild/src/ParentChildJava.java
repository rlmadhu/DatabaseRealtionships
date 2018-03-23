/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class ParentChildJava {
	
	public static void main(String[] args) {
		
		
		getchildren(3);
		
	}

	private static void getchildren(int i) {
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(0, null);
		map.put(4, 3);
		map.put(1, 0);
		map.put(3, 2);
		map.put(2, 0);
		List list = new ArrayList();
		map.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if(i== v){
				list.add(k);
			}
		});
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer value = (Integer) iterator.next();
			if(map.get(value)
			
		}
		
	}
	

}
*/