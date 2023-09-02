package com.gini.step.definition2;

import com.gini.model.Person;
import com.gini.step.context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class StepDefinition2 {


    TestContext x = new com.gini.step.context.TestContext();

    @Given("User is trying to login")
    public void user_is_trying_to_login() {
        Person p = new Person();
        p.setName("gica");
        p.setAddress(" unde vrea gica s astea");
        x.set("gica", p);
    }

    @When("^User enters application with (.+) and password (.+)$")
    public void user_enters_application_with_gigel_and_password(String username, String password) {
       // System.out.println("executing WHEN with username: " + username + " and password: " + password);
        Person z = x.get("gica", Person.class);
        System.out.println(z);

    }

    @Then("Home Page is displayed at the end")
    public void home_page_is_displayed_at_the_end() {
        //   log.info("executing THEN");
      //  assertEquals(1, 2);

    //    System.out.println(testContext.getRandomString());

    }


}
