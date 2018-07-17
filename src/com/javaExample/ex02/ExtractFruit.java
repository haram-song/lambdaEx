
package com.javaExample.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 */
public class ExtractFruit {
	/**
	 * 
	 * 함수 두개를 만들때
	 * 
	 * */
//	List<Fruit> extractApple(List<Fruit> Fruits) {
//		List<Fruit> resultList = new ArrayList<>();
//		
//		for (Fruit fruit : Fruits) {
//			if ("apple".equals(fruit.getName())) {
//				resultList.add(fruit);
//			}
//		}
//		
//		return resultList;
//	}
//	
//	List<Fruit> extractRed(List<Fruit> Fruits) {
//		List<Fruit> resultList = new ArrayList<>();
//		
//		for (Fruit fruit : Fruits) {
//			if ("red".equals(fruit.getName())) {
//				resultList.add(fruit);
//			}
//		}
//		
//		return resultList;
//	}
	
	/**
	 * 
	 * 함수 두개를 하나로 합침
	 * 
	 * */
	static List<Fruit> extractFruitList(List<Fruit> fruits, Predicate<Fruit> predicate) {
		List<Fruit> resultList = new ArrayList<>();
		
		for (Fruit fruit : fruits) {
			if (predicate.test(fruit)) {
				resultList.add(fruit);
			}
		}
		
		return resultList;
	}
	
	List<Fruit> fruits = Arrays.asList(new Fruit("apple", "red"), new Fruit("melon", "green"), new Fruit("banana", "yellow"));
	
	/**
	 * 
	 * JAVA8 이전
	 * 
	 * */
//	List<Fruit> appleList = extractFruitList(fruits, new Predicate<Fruit>() {
//	    @Override
//	    public boolean test(Fruit fruit) {
//	        return "apple".equals(fruit.getName());
//	    }
//	});
	
//	List<Fruit> redList = extractFruitList(fruits, new Predicate<Fruit>() {
//	    @Override
//	    public boolean test(Fruit fruit) {
//	        return "red".equals(fruit.getColor());
//	    }
//	});
	
	/**
	 * 
	 * 람다식
	 * Predicate 인터페이스 - 추상메서드가 한개 뿐이므로 람다식 가능
	 * */
	List<Fruit> appleList = extractFruitList(fruits, fruit->"apple".equals(fruit.getName()));

	List<Fruit> redList = extractFruitList(fruits, fruit->"red".equals(fruit.getColor()));



}
