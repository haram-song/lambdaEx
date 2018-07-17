
package com.javaExample.ex01;


public class CarMain {
	public static void main(String[] args) {
		
		/**
		 * JAVA8 이전
		 */
		
		Movable movable = new Movable() {
		    @Override
		    public void move(String str) {
		        System.out.println("gogo move move" + str);
		    }
		};
		
		/**
		 * 람다식 - 람다 표현식으로 구현이 가능한 인터페이스는 오직 추상메서드가 한개 뿐인 인터페이스만 가능하다. 
		 * 그렇기 때문에 추상메서드가 한개인 인터페이스는 함수형 인터페이스이다.
		 */
		Movable movable2 = str -> System.out.println("gogo move move" + str);


		movable.move("carrrr");
		movable2.move("carrrr22");
	}
}
