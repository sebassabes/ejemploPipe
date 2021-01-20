package ejemplopipeline;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiezxcientoTest {

	@Test
	public void testDiezxciento() throws Exception {

		Diezxciento diezxciento = new Diezxciento(24000000,900000);
		assertEquals(2400000, diezxciento.diezxciento());
	}

	@Test
	public void testImpuesto() throws Exception {
		Diezxciento diezxciento = new Diezxciento(24000000,900000);
		assertEquals(90000, diezxciento.impuescd to());
		diezxciento=new Diezxciento();
		assertEquals(70000, diezxciento.impuesto());
		diezxciento=new Diezxciento(24000000,2500000);
		assertEquals(375000, diezxciento.impuesto());
	}

	@Test
	public void testSaldoAhorro() throws Exception {
		Diezxciento ahorro=new Diezxciento();
		assertEquals(18000000, ahorro.saldoAhorro());
		Diezxciento diezxciento = new Diezxciento(24000000,900000);
		assertEquals(21600000, diezxciento.saldoAhorro());
		
	}

}
