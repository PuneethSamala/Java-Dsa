//Tree map is a part of java collection frame work it stores key value pairs and maintain the keys 
// in sorted order
package abc;
import java.util.*;
public class Treeset1{
	public staic void main(String[]args) {
		TreeMap<Integer,String> tm= new TreeMap<>();
		tm.put(34,"shiva");
		tm.put(35,"sreedhar");
		tm.put(36,"puneeth");
		tm.put(37, "shiva");
		System.out.println(tm);
	}
}