package stepDefinations;



import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination_Login {


    @Given("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
        
    	System.out.println("Given : Smoke test");
    }

    @When("^logins to the application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void logins_to_the_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }

    @Then("^HomePage is displayed$")
    public void homepage_is_displayed() throws Throwable {
    	
    	System.out.println("When");
        
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        
    	System.out.println(strArg1);
    }

    @When("^user sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
        
    List<List<String>> obj=data.asLists();
    System.out.println(obj.get(0).get(0));
    System.out.println(obj.get(0).get(1));
    System.out.println(obj.get(0).get(2));
    System.out.println(obj.get(0).get(3));
    System.out.println(obj.get(0).get(4));
    	
    System.out.println("Reg case");
    }
    
    @When("^signup to the application with (.+) and (.+)$")
    public void signup_to_the_application_with_and(String username, String password) throws Throwable {
    	 System.out.println(username);
    	 System.out.println(password);
    	 System.out.println("Reg");
    }
    
}
