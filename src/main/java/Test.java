import java.util.ArrayList;
import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
//		byte a = (byte) 0xf1;
//		byte b = (byte) (a >> 4);
//		byte c = (byte) (a >>> 4);
//		byte d = (byte) ((a & 0xff) >> 4);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(Integer.toBinaryString(a));
//		System.out.println(Integer.toBinaryString(b));
//		System.out.println(Integer.toBinaryString(c));
//		System.out.println(Integer.toBinaryString(d));
//		long x = 10;
//		int y = 5;
//		y *= 10000000000L;
//		System.out.println(y);
		Cat cat = new Cat(5);
		addYear(cat);
		System.out.println(cat.getAge());

	}

	public static void addYear(Cat cat) {
		cat.setAge(cat.getAge() + 1);
	}
}
