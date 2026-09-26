package TestNgLearning;

import org.testng.annotations.Test;

public class TestNgGroups {

    @Test(groups = {"Smoke"})
    public void validLogin() {
        System.out.println("Valid Login");
    }

    @Test(groups = {"Regression"})
    public void invalidLogin() {
        System.out.println("Invalid Login");
    }

    @Test(groups = {"Smoke", "Regression"})
    public void forgotPassword() {
        System.out.println("Forgot Password");
    }
}
