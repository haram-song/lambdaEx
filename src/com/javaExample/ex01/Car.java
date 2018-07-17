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
public class Car implements Movable {


/**
 *
 */
	@Override
	public void move(String str) {
		// TODO Auto-generated method stub
		 System.out.println("gogo car move" + str);
	}

}
