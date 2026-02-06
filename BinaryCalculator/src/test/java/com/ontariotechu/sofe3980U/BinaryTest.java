package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest 
{
    /**
     * Test The constructor with a valid binary vallue
     */
    @Test
    public void normalConstructor()
    {
		Binary binary=new Binary("1001001");
        assertTrue( binary.getValue().equals("1001001"));
    }
    /**
     * Test The constructor with an invalid binary value of out-of-range digits
     */
    @Test
    public void constructorWithInvalidDigits()
    {
		Binary binary=new Binary("1001001211");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value of alphabetic characters
     */
    @Test
    public void constructorWithInvalidChars()
    {
		Binary binary=new Binary("1001001A");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value that has a sign
     */
    @Test
    public void constructorWithNegativeSign()
    {
		Binary binary=new Binary("-1001001");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * T	est The constructor with a zero tailing valid binary value
     */
    @Test
    public void constructorWithZeroTailing()
    {
		Binary binary=new Binary("00001001");
        assertTrue( binary.getValue().equals("1001"));
    }
    /**
     * Test The constructor with an empty string
     */
    @Test
    public void constructorEmptyString()
    {
		Binary binary=new Binary("");
        assertTrue( binary.getValue().equals("0"));
    }
	/**
     * Test The add functions with two binary numbers of the same length
     */
    @Test
    public void add()
    {
		Binary binary1=new Binary("1000");
		Binary binary2=new Binary("1111");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("10111"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is less than the second
     */
    @Test
    public void add2()
    {
		Binary binary1=new Binary("1010");
		Binary binary2=new Binary("11");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is greater than the second
     */
    @Test
    public void add3()
    {
		Binary binary1=new Binary("11");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with a binary numbers with zero
     */
    @Test
    public void add4()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1010"));
    }
	/**
     * Test The add functions with two zeros
     */
    @Test
    public void add5()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("0");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("0"));
    }

    /**
     * 3 OR tests
     */
    @Test
    public void OR1(){ //tests if it can OR 2 binary numbers
        Binary binary1 = new Binary("100");
        Binary binary2 = new Binary("101");
        Binary binary3 = Binary.OR(binary1, binary2);
        assertTrue( binary3.getValue().equals("101"));
    }

    @Test
    public void OR2(){ //tests if it can OR with a 0
        Binary binary1 = new Binary("100");
        Binary binary2 = new Binary("0");
        Binary binary3 = Binary.OR(binary1, binary2);
        assertTrue( binary3.getValue().equals("100"));
    }

     @Test
    public void OR3(){ //tests if it can OR with 2 numbers of different lengths
        Binary binary1 = new Binary("100");
        Binary binary2 = new Binary("10110110");
        Binary binary3 = Binary.OR(binary1, binary2);
        assertTrue( binary3.getValue().equals("10110110"));
    }

    /**
     * 3 AND tests
     */
    @Test
    public void AND1(){ //tests if it can AND 2 binary numbers
        Binary binary1 = new Binary("100");
        Binary binary2 = new Binary("101");
        Binary binary3 = Binary.AND(binary1, binary2);
        assertTrue( binary3.getValue().equals("100"));
    }

    @Test
    public void AND2(){ //tests if it can AND with a 0
        Binary binary1 = new Binary("100");
        Binary binary2 = new Binary("0");
        Binary binary3 = Binary.AND(binary1, binary2);
        assertTrue( binary3.getValue().equals("0"));
    }

     @Test
    public void AND3(){ //tests if it can AND with 2 numbers of different lengths
        Binary binary1 = new Binary("100");
        Binary binary2 = new Binary("10110110");
        Binary binary3 = Binary.AND(binary1, binary2);
        assertTrue( binary3.getValue().equals("100"));
    }

    /**
     * 3 MULT tests
     */
     @Test
    public void MULT1(){ //tests if it can MULT 2 binary numbers
        Binary binary1 = new Binary("100");
        Binary binary2 = new Binary("101");
        Binary binary3 = Binary.MULT(binary1, binary2);
        assertTrue( binary3.getValue().equals("10100"));
    }

    @Test
    public void MULT2(){ //tests if it can MULT with a 0
        Binary binary1 = new Binary("100");
        Binary binary2 = new Binary("0");
        Binary binary3 = Binary.MULT(binary1, binary2);
        assertTrue( binary3.getValue().equals("0"));
    }

     @Test
    public void MULT3(){ //tests if it can MULT with 2 numbers of different lengths
        Binary binary1 = new Binary("100");
        Binary binary2 = new Binary("10110110");
        Binary binary3 = Binary.MULT(binary1, binary2);
        assertTrue( binary3.getValue().equals("1011011000"));
    }
}
