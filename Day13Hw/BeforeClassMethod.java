package Day13;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassMethod {
	@Test
    public void signUp(){
        System.out.println("sign up complete");
    }

    @Test
    public void enterPassword(){
        System.out.println("password entered");
    }

    @Test
    public void reEnterPassword(){
        System.out.println("password re-entered");
    }
    
    @BeforeMethod
    public void beforeEveryTestCase(){
        System.out.println("I am creating a method");
    }

    @AfterMethod
    
    public void afterEveryTestCase(){
        System.out.println("I am running after the methods"
        		+ "");
    }
    
    @BeforeClass
    
    public void afterClass() {
    	System.out.println("execute");
    }
}



