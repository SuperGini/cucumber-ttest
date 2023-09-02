package com.gini.stepdefinition1;

import io.cucumber.java.After;
import io.cucumber.java.Before;

/**
 * Hooks:
 *
 *  @Before("@RegressionTest") -> vine din pacehtul de cucumber si se va executea inainte pentru orice scenariu
 *  adnotat cu @RegressionTest, indiferent de fisierul unde se afla adnotarea
 *
 * Ordine Executie:
 *
 *@Before -> Background -> Scenario -> After  ---> mai intai se executa Before, dupa care se executa Background din fisier
 *  dupa care se executa scenariul din fisier si dupa se executa @After
 *
 *  Recapitulare:
 * @Before -> se va executa inaintea oricarui scenariu din TOATE fisierele .feature-> similar cu @BeforeEach din Junit
 * @After -> se va executa la finalul fiecarui scenariu din TAOTE fisierele .feature
 *
 * */

public class Hooks {

    @Before("@RegressionTest")
    public void firstProgramSetup() {

        System.out.println("first program hook ++++++++++++");

    }


    /**
     * se va executa inaintea scenariilor din toate fisierele .feature care au tag-ul @SmokeTest
     * */
    @Before("@SmokeTest")
    public void secondProgramSetup() {
        System.out.println("second program hook ++++++++++++");
    }

     // -> se va executa dupa fiecare scenariu din toate fisierele .feature care in JunitRunner au tagurile respective
     // -> daca in calsa JunitRunner nu am definite tagurile pt care sa se execute se va executa pt tote scenariile
    @After
    public void tearDwon() {
        System.out.println("--------dupa fiecare scenariu-------");
    }

}
