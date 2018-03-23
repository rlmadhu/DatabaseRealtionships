import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ParentChild {

	Integer childValue;
	Integer parentId;

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getChildValue() {
		return childValue;
	}

	public void setChildValue(Integer chilValue) {
		this.childValue = chilValue;
	}

}

public class Parent {
	public static List<ParentChild> list = new ArrayList<ParentChild>();
	public static int count = 0;

	public static void main(String[] args) {

		ParentChild pc = new ParentChild();
		pc.setChildValue(0);
		pc.setParentId(null);
		ParentChild pc1 = new ParentChild();
		pc1.setChildValue(1);
		pc1.setParentId(0);
		ParentChild pc2 = new ParentChild();
		pc2.setChildValue(2);
		pc2.setParentId(0);
		ParentChild pc3 = new ParentChild();
		pc3.setChildValue(3);
		pc3.setParentId(2);
		ParentChild pc4 = new ParentChild();
		pc4.setChildValue(4);
		pc4.setParentId(3);

		list.add(pc);
		list.add(pc4);
		list.add(pc3);
		list.add(pc2);
		list.add(pc1);

		getChildrens(3);
		System.out.println("Count is --> " + count);
	}

	private static void getChildrens(Integer i) {

		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			ParentChild parentChild = (ParentChild) iterator.next();
			if (parentChild.getParentId() == i) {
				count++;
				getChildrens(parentChild.getChildValue());

			}

		}
	}

}