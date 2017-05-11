/**
 * 
 */
package com.mycompany.part2.section2;

/**
 * @author Hemali8413
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyGenInterface<Integer,String> mgi1 = new MyGenClass<Integer, String>(1, "Hemali");
		MyGenInterface<Integer,Integer> mgi2 = new MyGenClass<Integer, Integer>(1, 2017);
		
		Integer i1 = MyRegularClass.getSum(10, 20);
		Float f1 = MyRegularClass.getSum(100f, 200f);
		
		System.out.println("K: " + mgi1.getKey() + ", V: " + mgi1.getValue());
		System.out.println("K: " + mgi2.getKey() + ", V: " + mgi2.getValue());
		
		System.out.println("Sum " + i1);
		System.out.println("Sum " + f1);
		
		
	}

}
