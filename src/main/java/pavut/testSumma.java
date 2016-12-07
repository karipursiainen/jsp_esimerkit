package pavut;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class testSumma {
	@Mock
	TilastoBean mockBean;
	
	@Test
	public void testGetSumma() {
		TilastoBean tilasto = new TilastoBean();
		
		assertEquals(1, tilasto.getSumma(),1.0);
	}

}
