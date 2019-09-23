package First;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstTest {

	@Test
	void test() {
		FirstProj o=new FirstProj();
		int output=o.square(3);
		assertEquals(9,output);
	}

}
