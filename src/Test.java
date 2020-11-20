import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		byte a = (byte) 0xf1;
		byte b = (byte) (a >> 4);
		byte c = (byte) (a >>> 4);
		byte d = (byte) ((a & 0xff) >> 4);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(c));
		System.out.println(Integer.toBinaryString(d));
	}
}
