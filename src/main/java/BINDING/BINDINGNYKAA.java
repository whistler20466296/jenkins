package BINDING;



import PAGE.nykaahomepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class BINDINGNYKAA {



 // public String Searchtext ="libstic" ;



 @Given("I launch the Website")



 public void i_launch_the_website() {



 }



 @When("I click the Search area")



 public void i_click_the_search_area() {



	 nykaahomepage.clickInElement();



 }



 @When("I enter the search items")



 public void i_enter_the_search_items() {



 }



 @Then("I verify the i got the item")



 public void i_verify_the_i_got_the_item() {



 }



}

