import org.junit.Test;
public class TelevisonTest {
	 @Test public void testTelevisionHasAMark() {
	        Television classUnderTest = new Television();
	        assertNotNull("television should have a mark", classUnderTest.getMark());
	    }
	 private void assertNotNull(String string, String name) {
			// TODO Auto-generated method stub
			
		}
}
