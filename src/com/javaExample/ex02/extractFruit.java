
package com.javaExample.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 */
public class extractFruit {
	
	/**
	 * 방법1)
	 * if문 외에는 전부 동일하다. 이걸 행위 파라미터를 이용해 1개의 메서드로 합치면 훨씬 보기가 좋을것 같다.
	 */
	List<Fruit> extractApple(List<Fruit> fruits){
	    List<Fruit> resultList = new ArrayList<>();
	    for(Fruit fruit : fruits){
	        if("apple".equals(fruit.getName())){
	            resultList.add(fruit);
	        }
	    }

	    return resultList;
	}

	List<Fruit> extractRed(List<Fruit> fruits){
	    List<Fruit> resultList = new ArrayList<>();
	    for(Fruit fruit : fruits){
	        if("red".equals(fruit.getColor())){
	            resultList.add(fruit);
	        }
	    }

	    return resultList;
	}

	/**
	 * 방법2)
	 * Predicate 라는 비교하는 행위를 파라미터로 입력 
	 */
	static List<Fruit> extractFruitList(List<Fruit> fruits, Predicate<Fruit> predicate){
	    List<Fruit> resultList = new ArrayList<>();
	    for(Fruit fruit : fruits){
	        if(predicate.test(fruit)){
	            resultList.add(fruit);
	        }
	    }

	    return resultList;
	}
	




}
