import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testDoesReverseInPlaceR()
  {
    int[] input1 = {1,2,3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3,2,1}, input1);
  }

  @Test
  public void testDoesReversedR()
  {
    int[] input1 = {1,2,3};
    int[] output1 = ArrayExamples.reversed(input1);
    assertArrayEquals(new int[]{3,2,1}, output1 );
  }

  @Test
  public void testForAverageLength()
  {
    double[] input1 = { 2.0 , 2.0 , 4.0};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }

  @Test
  public void testForAverageLength2()
  {
    double[] input1 = { 2.0 , 3.0 , 4.0};
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }
}
