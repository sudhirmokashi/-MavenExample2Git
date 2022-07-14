import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

class ParamsTest {
	
	@Disabled
	@ParameterizedTest
	@ValueSource(ints= {8,10,20,50,100})
	public void testArrays(int arg)
	{
		System.out.println("arg = " +arg);
		Assertions.assertTrue(arg%2==0);
	}
	@Disabled
	@ParameterizedTest
	@DisplayName("Passes all non-null arguments to method")
	@ValueSource(strings = {"Hello","World","Sudhir"})
	public void testString(String msg)
	{
		System.out.println("string = " + msg);
		Assertions.assertNotNull(msg);
	}
	
	@RepeatedTest(3)
	public void shouldRepeat()
	{
		int x=10,y=20;
		Assertions.assertEquals(200,x*y);
	}
	
	@Test
	public void IntegerTest()
	{
		Integer[] intArr = {2,3,5,7,10};
		
		List<Integer> newArr = Arrays.asList(intArr);
		Assertions.assertAll(
				()->assertEquals(2,newArr.get(0)),
				()->assertEquals(3,newArr.get(1)),
				()->assertEquals(5,newArr.get(2)),
				()->assertEquals(7,newArr.get(3)),
				()->assertEquals(10,newArr.get(4))
				);
	}
	@Test
	void TestExceptions()
	{
		Assertions.assertThrows(NumberFormatException.class, ()-> Integer.parseInt("one"));
	}
}
