package GeneralCon;

import org.junit.Test;

import junit.framework.Assert;


  public class Tester{
	
	@Test
	public void test() throws Exception {
		zadanie s= new zadanie();
		Object r = (Object)s.COMPANY;
		Assert.assertNotNull(r);

}
}
