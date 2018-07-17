/**
 *  SMCP version 1.0
 *
 *  Copyright ⓒ 2018 kt corp. All rights reserved.
 *
 *  This is a proprietary software of kt corp, and you may not use this file except in
 *  compliance with license agreement with kt corp. Any redistribution or use of this
 *  software, with or without modification shall be strictly prohibited without prior written
 *  approval of kt corp, and the copyright notice above does not evidence any actual or
 *  intended publication of such software.
 *
 * @author kt
 * @since 2015.07.15
 * @version 1.0
 * @see 
 * @Copyright © 2015 By KT corp. All rights reserved.
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *  수정일               수정자                수정내용
 *  -------------        ----------       -------------------------
 *  2015.07.15           [성명]               최초생성            
 *
 *
 * </pre>
 */

package com.javaExample.ex01;

/**
 *
 */
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
