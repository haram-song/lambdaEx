
package com.javaExample.ex01;

/**
 *
 */
public class CarExample {

	public static void main(String[] args) {
		/** 
		 * JAVA8 이전 방식
		 * 인터페이스를 구현하는 클래스를 만들어 객체화 하거나 재사용성이 없다면 
		 * 그 자리에서 바로 익명클래스 객체를 구현할 수 있다.
		 * 
		 */
//		Movale movable = new Movale() {
//			
//			@Override
//			public void move(String str) {
//				// TODO Auto-generated method stub
//				System.out.println("gogo move move" + str);
//			}
//		};
		
		
		/**
		 * 람다표현식
		 * 구현해야할 추상메서드가 1개인 인터페이스(함수형 인터페이스)를 구현할때는 메소드명이 생략가능하다.
		 * 
		 */
		Movale movable = str -> {
			System.out.println("gogo movemove" + str);
		};
		
		
		
		
		movable.move("고고");
	}
}
