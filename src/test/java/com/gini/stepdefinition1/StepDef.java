package com.gini.stepdefinition1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class StepDef {


    @Given("User is on NetBanking landing page")
    public void user_is_on_net_b_anking_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User landed in application page");
    }

//    @When("User login into application")
//    public void user_login_into_application() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("User login into application page");
//    }

    /**
     * primul {string} va intra in primul argument al metodei si al doilea {string} in al doilea argument al metodei
     * */

//    @When("User login into application with {string} and password {string}")
//    public void userLoginIntoApplicationWithAndPassword(String username, String password) {
//        System.out.println("username: " + username + " password: " + password + " ++++++++");
//    }
    /**
     * (.+) -> inseamana ca poate primi orice tip de date string, int etc -> regular expresion
     * ATENTIE! -> pentru a putea folosi regular expresion trbuie sa incepem stringul cu ^ si sa il terminam cu $
     * */
    @When("^User login into application with (.+) and password (.+)$")
    public void userLoginIntoApplicationWithAndPasswordx(String username, String password) {
        System.out.println("username: " + username + " password: " + password + " ++++++++");
    }
    
    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Home page is displayed");
    }

    @And("Cards are displayed")
    public void cardsAreDisplayed() {

    }

    @Given("User is on Practice page")
    public void userIsOnPracticePage() {

    }

    /**
     * la When in fisierul .feature definim o lista de stringuri
     * */
    @When("User SignUP into application")
    public void userSignUPIntoApplicationWithAndPassword(List<String> data) {
        System.out.println(data.get(0) + "-------");
    }

    @Given("setup the entries in database")
    public void setupTheEntriesInDatabase() {
        System.out.println("*****************************");
    }

    @And("launch the browser from config variables")
    public void launchTheBrowserFromConfigVariables() {
    }

    @And("hit the home page url of banking site")
    public void hitTheHomePageUrlOfBankingSite() {
    }
}
