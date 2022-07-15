import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.entity.MyClass;

class MyClassTest {
	
	MyClass c = new MyClass();
	@Test
	public void testadd()
	{
		int r = c.add(100, 200);
		Assertions.assertEquals(300, r);
	}
	@Test
	public void AssertTest()
	{
		Assertions.assertEquals("Hello", "Hello");
		Assertions.assertFalse("vaibhav".length()==5);
		Assertions.assertFalse(10>20,"checked conditions");
	}
	@Test
	public void testAssertNull()
	{
		String str1 = null;
		String str2 = "Sudhir";
		Assertions.assertNull(str1);
		Assertions.assertNotNull(str2);
	}
	@Test
	public void testAssertInteger()
	{
		ArrayList<Integer> myList = new ArrayList<Integer>();
		Assertions.assertEquals(0, myList.size(),"Size is zero");
		myList.add(100);
		myList.add(200);
		Assertions.assertEquals(2,myList.size());
	}
}
