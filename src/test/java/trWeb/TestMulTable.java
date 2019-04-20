package trWeb;

import org.junit.Test;

import com.tr.web.mulTable;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestMulTable extends TestCase {
	@Test
	public void testMulTable() {
		mulTable m= new mulTable(); 
		double k=9;
		Assert.assertEquals(k, m.table(3));
	}
}
