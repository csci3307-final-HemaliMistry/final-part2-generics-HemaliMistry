/**
 * 
 */
package com.mycompany.part2.section2;

/**
 * @author Hemali8413
 *
 */
public class MyGenClass<K,V> implements MyGenInterface<K, V> {
	public K key;
	public V value;
	
	public MyGenClass(K _input, V _value){
		key = _input;
		value = _value;
	}
	
	public K getKey(){
	return key;	
	}
	
	public V getValue(){
		return value;
	}
	
	
	
}
