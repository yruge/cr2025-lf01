package primitive_obsession;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MahasiswaTest {

	@Test
	void testSuccess() {
		try {
			Mahasiswa m = new Mahasiswa(new FullName("Amir Budianto"), "reguler", new BirthDate(20, 11, 1999));	
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	void testErrorName() {
		try {
			Mahasiswa m = new Mahasiswa(new FullName("amir budianto123"), "reguler", new BirthDate(20, 11, 1999));	
		} catch (Exception e) {
			return;
		}
		fail("exception is expected");
	}
	
	@Test
	void testErrorDoB() {
		try {
			Mahasiswa m = new Mahasiswa(new FullName("Amir Budianto"), "reguler", new BirthDate(37, 11, 1999));	
		} catch (Exception e) {
			return;
		}
		fail("exception is expected");
	}
}
