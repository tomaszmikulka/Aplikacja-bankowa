import org.example.Account;
import org.junit.Assert;
import org.junit.Test;

public class BankAccountTesting {
    @Test
    public void methodToCheckIfDepositMethodIsWorking()
            {
                Account account = new Account();
                account.setBalance(100);
                long expectedResult = account.getBalance();
                Assert.assertEquals(expectedResult,account.getBalance());
            }

}
