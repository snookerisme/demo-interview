package com.example.demointerview

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RomanNumberTest {

    private val romanNumber = RomanNumber()

    @Test
    fun resultRomanStringIReturnOne() {
        val expect = 1
        val result = romanNumber.resultRomanString("I")
        assertEquals(expect,result)
    }

    @Test
    fun resultRomanStringIVReturnFour() {
        val expect = 1
        val result = romanNumber.resultRomanString("I")
        assertEquals(expect,result)
    }

    @Test
    fun resultRomanStringVIIIReturnEight() {
        val expect = 8
        val result = romanNumber.resultRomanString("VIII")
        assertEquals(expect,result)
    }

    @Test
    fun resultRomanStringIXReturnNine() {
        val expect = 9
        val result = romanNumber.resultRomanString("IX")
        assertEquals(expect,result)
    }

    @Test
    fun resultRomanStringXReturnTen() {
        val expect = 10
        val result = romanNumber.resultRomanString("X")
        assertEquals(expect,result)
    }

    @Test
    fun resultRomanStringXIVReturnFourteen() {
        val expect = 14
        val result = romanNumber.resultRomanString("XIV")
        assertEquals(expect,result)
    }
}