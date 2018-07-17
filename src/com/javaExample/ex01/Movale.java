
package com.javaExample.ex01;

/**
 *
 */
@FunctionalInterface
public interface Movale {
	/**
	 * 
	 * 구현해야할 추상메서드가 1개인 인터페이스(함수형 인터페이스)를 구현할때는 메소드명이 생략가능하다.
	 * 이때 추후 메소드 추가를 방지하기 위해 @FunctionalInterface 가 필요하다.
	 * 이는 추상메서드가 1개가 아닐경우 컴파일에러를 내뿜는다.
	 * 
	 * Invalid '@FunctionalInterface' annotation; Movale is not a functional interface
	*/
	void move(String str);
	
}
