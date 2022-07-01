/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.phucle.mathutil.core;

import static com.phucle.mathutil.core.MathUtil.getFactorial;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MathUtilTest {

    //chơi DDT, tách data ra khỏi câu lệnh kiểm thử, tham số hóa cái data này
    //vào trong câu lệnh kiểm thử
    //chuẩn bị bộ data
    public static Object[][] initDate() {
        return new Integer[][]{
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720}
        };
    }

    @ParameterizedTest
    @MethodSource(value = "initDate") //tên hàm cung cấp data, ngầm định thứ tự
    //của các phần tử mảng, map vào tham số hàm
    public void testGetFactorialGivenRightArgReturnsWell(int input, long expected) {
        assertEquals(expected, getFactorial(input));
    }

//   @Test
//    public void testGetFactorialGivenWringArgThrowException() {
        //xài biểu thức Lambda
        //hàm nhận tham số thứ 2 là 1 cái object/có code implement cái
        //functionl interface tên là Executable - có 1 hàm d nuyhất ko code
        //têm là execte()
        //chơi chậm
//        Executable exObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };

//        Executable exObject = () -> getFactorial(-5);
//        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
//    }
//
}