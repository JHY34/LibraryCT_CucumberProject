package com.library2.cybertekschool.step_definitions;

import com.library2.cybertekschool.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Add_New_User_StepDefinitions {

    @Given("I am on the {string} module")
    public void i_am_on_the_module(String string) {

        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");



    }



    @When("I click  on the {string} button,")
    public void i_click_on_the_button(String string) {

    }


    @When("providing all necessary information and clicking  on {string}")
    public void providing_all_necessary_information_and_clicking_on(String string) {

    }


    @Then("I should be able to create a new  {string} which will be appear on the Users page.")
    public void i_should_be_able_to_create_a_new_which_will_be_appear_on_the_users_page(String string) {

    }



}
