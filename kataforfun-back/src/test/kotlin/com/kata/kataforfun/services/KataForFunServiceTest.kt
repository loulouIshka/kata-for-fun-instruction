package com.kata.kataforfun.services

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KataForFunServiceTest {
    private val kataForFunService: KataForFunService = KataForFunService();

    @Test
    fun should_return_1_when_convert_number_1() {
        val actual = kataForFunService.convertNumber(1);
        assertEquals("1", actual);
    }

    @Test
    fun should_return_katakata_when_convert_number_3() {
        val actual = kataForFunService.convertNumber(3);
        assertEquals("KataKata", actual);
    }

    @Test
    fun should_return_forfor_when_convert_number_5() {
        val actual = kataForFunService.convertNumber(5);
        assertEquals("ForFor", actual);
    }

    @Test
    fun should_return_fun_when_convert_number_7() {
        val actual = kataForFunService.convertNumber(7);
        assertEquals("Fun", actual);
    }

    @Test
    fun should_return_kata_when_convert_number_9() {
        val actual = kataForFunService.convertNumber(9);
        assertEquals("Kata", actual);
    }


    @Test
    fun should_return_katafor_when_convert_number_51() {
        val actual = kataForFunService.convertNumber(51);
        assertEquals("KataFor", actual);
    }

    @Test
    fun should_return_forkata_when_convert_number_53() {
        val actual = kataForFunService.convertNumber(53);
        assertEquals("ForKata", actual);
    }

    @Test
    fun should_return_katakatakata_when_convert_number_33() {
        val actual = kataForFunService.convertNumber(33);
        assertEquals("KataKataKata", actual);
    }

    @Test
    fun should_return_katafun_when_convert_number_27() {
        val actual = kataForFunService.convertNumber(27);
        assertEquals("KataFun", actual);
    }

    @Test
    fun should_return_kataforfor_when_convert_number_15() {
        val actual = kataForFunService.convertNumber(15);
        assertEquals("KataForFor", actual);
    }

    @Test
    fun should_return_funforkatakata_when_convert_number_753() {
        val actual = kataForFunService.convertNumber(753);
        assertEquals("FunForKataKata", actual);
    }

    @Test
    fun should_return_forfunkatakata_when_convert_number_573() {
        val actual = kataForFunService.convertNumber(573);
        assertEquals("ForFunKataKata", actual);
    }
}
