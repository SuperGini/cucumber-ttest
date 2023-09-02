package com.gini.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * ATENTIE!! -> la format la features si glue
 *
 * glue = "com.gini.stepdefinition1" -> de unde sa ia step definition
 *
 * cand punem tags = => vom rula doar acele scenarii care au @SmokeTest deasupra lor
 *
 *
 * tags = "@SmokeTest and @RegressionTest" -> inseamana ca ambele adnotari trebuie sa fie pe scenariu ca sa fie rulat -> la mine dadea eroare
 * tags = "@SmokeTest and @RegressionTest" -> rleaza toate testele care au aceste 2 adnotari
 * tags = "not @RegressionTest" -> nu va executa testele cu tagul de @RegressionTest
 *
 *plugin = {"pretty"} -> raportul va fi colorat -> testele care trec -> verde, testele care pica -> rosu
 *
 *plugin = {"pretty", "html:build/reports/tests/cucumber.html"} -> ii spunem sa genereze un raport la final in fisierul
 *  html:build/reports/tests/cucumber.html -> acest este de tipul html unde cheia este html si valoarea build/reports/tests/cucumber.html
 *  rapostul va fi generat in fisierul cucumber.html
 *
 *
 * dryRun = true -> nu executa scenariul daca lipseste unul din step execution ca: Given, When sau Then -> arunca eroare
 *              se pare ca nu merge la mine
 *
 * */
@RunWith(Cucumber.class) // deoarece Cucumber nu foloseste Junit5
@CucumberOptions(
        features = "classpath:features",
        glue = "com.gini.stepdefinition1",
        tags = "@SmokeTest or @RegressionTest",                         //generez rapostul si ca json ->pt third party plugins
        plugin = {"pretty", "html:build/reports/tests/cucumber.html", "json:build/reports/tests/cucumber.json"},
        dryRun = true
)
public class JunitRunner1 {


}
