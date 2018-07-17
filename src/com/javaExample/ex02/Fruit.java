
package com.javaExample.ex02;

/**
 *
 * 행위의 파라미터 화 
 * - 데이터를 전달하는 것이 아닌 행위를 전달한다면 유연한 코드가 될 수 있다.
 */
public class Fruit {
    private String name;
    private String color;

    Fruit(String name, String color){
        this.name = name;
        this.color = color;
    }

    String getName(){
        return this.name;
    }

    String getColor(){
        return this.color;
    }


}
