package Tests_Banking;

import Tests_Banking.Challenge.Utilities;
import junit.framework.TestCase;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BankAccountTest{
    private BankAccount account;
    private static int count;
    @Before
    public void setUp(){
        account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        System.out.println("running test");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test cases. Count = " + count++);
    }


    @Test
    public void testDeposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200, balance, 0);
    }

    @Test
    public void testWithdraw() {
        double balance = account.withdraw(600.00, true);
        assertEquals(400, balance, 0);

    }

    @Test (expected = IllegalArgumentException.class)
    public void testWithdraw_notBranch() throws Exception{
        double balance = account.withdraw(600.00, false);
        assertEquals(400, balance, 0);

    }

    @Test
    public void testGetBalance_deposit() {
        account.deposit(200, true);
        assertEquals(1200, account.getBalance(), 0);
    }

    @Test
    public void testGetBalance_withdraw() {
        account.withdraw(200, true);
        assertEquals(800, account.getBalance(), 0);
    }


    @Test
    public void isChecking_true() {
        assertTrue("The account is NOT a checking account", account.isChecking());

    }

    @AfterClass
    public static void afterClass(){
        System.out.println("This executes after any testcases. Count = " + count++);

    }

    @After
    public void after(){
        System.out.println("Count = " + count++);
    }
}