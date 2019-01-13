package testing.JunitProject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class sampleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After	
	public void tearDown() throws Exception {
	}	

	int getData(int a, int b)
	{
			return a+a;
	}
	
	
	@Test
	public void testadd() {
		
		Assert.assertEquals(10, getData(4, 5));
	}
	
	@Test
	public void test() {
		System.out.println("test -function");
		//fail("Not yet implemented");
	}

}
