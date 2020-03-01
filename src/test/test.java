package test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import  calculator.cal;



class test {
	int a=8,b=7;
	@Test
	public void testadd() throws RuntimeException {
		
		cal x=new cal();
		a=x.add(a, b);
		if(a<0||a<15||a>15) {
		fail("The add operation does not work correctly");
		
		}
		else
		assertEquals(15,a);
	
		
	}
	@Test
	public void testsub() {
		cal x=new cal();
		a=x.sub(a, b);
		if(a!=1) {
			fail("Subtract operation does not work correctly");
		}
		else
			assertEquals(1,a);
		
	}
	@Test
	public void testmult() {
		cal x=new cal();
		a=x.mult(a, b);
		if(a!=56) {
			fail("Multiple operation does not work correctly");
			
		}
		else
			assertEquals(56,a);
	}
	@Test
	public void testdiv()throws ArithmeticException{
		cal x = new cal();
		float z;
		z=x.div(a, b);
		if(z!=1.142857142857143) {
			fail("Division operation does not work correctly");
			
		}
		else
			assertEquals(1.142857142857143,z);
	}

}

