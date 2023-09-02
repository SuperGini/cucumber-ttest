package com.gini.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 *https://medium.com/@bcarunmail/sharing-state-between-cucumber-step-definitions-using-java-and-spring-972bc31117af
 *https://github.com/eugenp/tutorials/blob/master/spring-cucumber/src/test/java/com/baeldung/SpringIntegrationTest.java
 *https://www.baeldung.com/cucumber-spring-integration
 * */

//MERGE DOAR DACA ADAUGAM CLASA SpringBDDTest
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/test2",
        glue = {"com.gini.step.definition2","com.gini"}, //com.gini -> adauga clasa de SpringBDDTest
        plugin = {"pretty", "html:build/reports/tests/cucumber.html", "json:build/reports/tests/cucumber.json"}
)
public class JunitRunner2 {


}
