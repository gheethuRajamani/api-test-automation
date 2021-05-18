package com.gheethsey;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppSteps {

    @Given("I am a client")
    public void i_am_a_client() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("x");
    }
    @When("I do a GET on http:\\/\\/dog-api.kinduff.com\\/api\\/facts")
    public void i_do_a_get_on_http_dog_api_kinduff_com_api_facts() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("y");
    }
    @Then("I should get {int} dog fact")
    public void i_should_get_dog_fact(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("z");
    }
    
}
