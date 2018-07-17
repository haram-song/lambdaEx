
package com.javaExample.ex01;

/**
 *해당 인터페이스가 함수형인터페이스라는것을 알려주고
 *한개 초과의 메서드를 작성할 시 컴파일러 에러를 낸다.
 */
@FunctionalInterface
public interface Movable {
	void move(String str);
}
