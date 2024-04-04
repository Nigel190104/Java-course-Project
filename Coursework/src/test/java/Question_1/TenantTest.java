package Question_1;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class TenantTest {

	@Test
    public void testTenant() {

	try {
		Tenant newtenant = new Tenant("n", "a", 0, TenantType.PROFESSIONAL);
	    fail("Expected NullPointerExceptionnot thrown");
	} catch (NullPointerException e) {

	}
    }
	@Test
    public void testTenant2() {

	try {
		Tenant newtenant = new Tenant("n", null, 67, TenantType.PROFESSIONAL);
	    fail("Expected NullPointerExceptionnot thrown");
	} catch (NullPointerException e) {

	}
    }

	@Test
    public void testTenant3() {

	try {
		Tenant newtenant = new Tenant(null , "a", 67, TenantType.PROFESSIONAL);
	    fail("Expected NullPointerExceptionnot thrown");
	} catch (NullPointerException e) {

	}
    }

	@Test
    public void testTenant4() {

	try {
		Tenant newtenant = new Tenant("n", "a", 67, null);
	    fail("Expected NullPointerException not thrown");
	} catch (NullPointerException e) {

	}
    }

	@Test
    public void testTenant5() {

	try {
		Tenant newtenant = new Tenant(null, null, 0, null);
	    fail("Expected NullPointerException not thrown");
	} catch (NullPointerException e) {

	}
    }

	@Test
    public void testTenant6() {
		Tenant newtenant = new Tenant("Nigel", "Karakut", 27, TenantType.PROFESSIONAL);
    }

	@Test
    public void testTenant7() {

	try {
		Tenant newtenant = new Tenant("n", "a", 27, TenantType.PROFESSIONAL);
	    fail("Expected IllegalArgumentException thrown");
	} catch (IllegalArgumentException e) {

	}
    }


}
