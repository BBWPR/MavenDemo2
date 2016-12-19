package mavenDemo;

import static org.junit.Assert.*;
import org.junit.Test;

import mavenDemo.Calculator;


public class CalculaterTest
{
   Calculator testee;
   
   @Test
   public void testSummeZweiPositiveIsOk()
   {
      testee = new Calculator();      
      assertTrue(testee.summe(10, 25) == 35);
   }
   @Test
   public void testSummeNeagtivPositivIsOk()
   {
      testee = new Calculator();      
      assertTrue(testee.summe(-10, 25) == 15);
   }
   @Test
   public void testSummePositivNegativ()
   {
      testee = new Calculator();      
      assertTrue(testee.summe(10, -25) == -15);
   }
   @Test
   public void testSummeNullNull()
   {
      testee = new Calculator();      
      assertTrue(testee.summe(0, 0) == 0);
   }
   @Test
   public void testSummeNullPositiv()
   {
      testee = new Calculator();      
      assertTrue(testee.summe(0, 10) == 10);
   }
   @Test
   public void testSummePositivNull()
   {
      testee = new Calculator();      
      assertTrue(testee.summe(10, 0) == 10);
   }
}
