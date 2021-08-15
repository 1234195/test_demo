
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class BankTest
{

	@Test(expected=InsufficientBalException.class)
	
	public void withdrawnExceptionTest() throws InsufficientBalException
	{
		
		Junit3 customer = new Junit3();
		customer.withdraw(15000);
	}
	
	@SuppressWarnings("deprecation")
	@Rule
	public ExpectedException thrown=ExpectedException.none();
	
	@Test
	public void withdrawExceptionMessageTest() throws InsufficientBalException
	{
		thrown.expect(InsufficientBalException.class);
		thrown.expectMessage("Insufficent Balance");
		Junit3 customer = new Junit3();
		customer.withdraw(15000);
	}
}
	
	
	

