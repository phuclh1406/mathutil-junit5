/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.phucle.mathutil.core;

import static com.phucle.mathutil.core.MathUtil.*;
//import static la danh rieng cho nhung ham static
//goi ham ma bo qua ten class
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author predator
 */
public class MathUtilTest {

    @Test
    public void testGetFactorialGivenRightArgReturnsWell() {
        assertEquals(24, getFactorial(4));
    }

    //Bat ngoai le khi dua data ca chon
    @Test
    public void testGetFactorialGivenWrongArgThrowException() {
        //xai bieu thuc lambda
        //ham nhan tham so thu 2 la 1 cai object / code  co implement cai
        //functional interface ten la Executable - co 1 ham duy nhat ko code
        //ten la execute()
        //choi cham
        Executable excObject = new 
        
        assertThrows(IllegalArgumentException.class, executable);
    }
}
