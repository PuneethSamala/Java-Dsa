// Tree set is a part of collection  and its represent a set collection  
// that uses a red black tree.it is a type of binary search tree.
package abc;
import java.util.TreeSet;

public class TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer>num=new TreeSet<Integer>();
		num.add(50);
		num.add(30);
		num.add(20);
		num.add(40);
		num.add(60);
		num.add(40);
		num.add(70);
		System.out.println(num);
		System.out.println(num.first());
		System.out.println(num.higher(30));
		
		// TODO Auto-generated method stub

	}

}
