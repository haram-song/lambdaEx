
package com.javaExample.ex02;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class FruitMain {
	public static void main(String[] args) {
		List<Fruit> fruits = Arrays.asList(new Fruit("apple", "red"), new Fruit("melon", "green"), new Fruit("banana", "yellow"));
		
		/**
		 * Predicate는 메서드가 한개 뿐이므로 람다를 이용하여 호출 가능
		 */
//		List<Fruit> appleList = extractFruitList(fruits, new Predicate<Fruit>() {
//		    @Override
//		    public boolean test(Fruit fruit) {
//		        return "apple".equals(fruit.getName());
//		    }
//		});
	//
//		List<Fruit> redList = extractFruitList(fruits, new Predicate<Fruit>() {
//		    @Override
//		    public boolean test(Fruit fruit) {
//		        return "red".equals(fruit.getColor());
//		    }
//		});

		List<Fruit> appleList = extractFruit.extractFruitList(fruits, fruit -> "apple".equals(fruit.getName()));
		List<Fruit> redList = extractFruit.extractFruitList(fruits, fruit -> "red".equals(fruit.getColor()));

		System.out.println(appleList.get(0).getName());
		System.out.println(redList.get(0).getColor());
	}
}
