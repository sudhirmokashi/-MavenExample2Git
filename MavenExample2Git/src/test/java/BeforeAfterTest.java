import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.entity.MyClass;

class BeforeAfterTest {
	int sum =0;
	MyClass c = new MyClass();
	@BeforeAll
	public static void AllTestStartup()
	{
		System.out.println("First startup");
	}
	@BeforeEach
	public void TestStartup()
	{
		sum=0;
		System.out.println("startup");
	}
	@Test
	public void testadd()
	{
		sum = c.add(100, 200);
		Assertions.assertEquals(300, sum);
	}
	@Test
	public void testadd1()
	{
		sum = c.add(100, 200);
		Assertions.assertEquals(300, sum);
	}
	@AfterEach
	public void shutDown()
	{
		sum=0;
		System.out.println("shutdown");
	}
	@AfterAll
	public static void LastshutDown()
	{
		System.out.println("Final shutdown");
	}
}
