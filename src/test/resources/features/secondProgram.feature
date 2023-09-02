


Feature: Application NrTwo
  I want to test something

#ce este in Backgroud -> putem sa bagam intr-un hook daca este comun pentru mai multe fisiere .feature si il facem sa se
#execute inainte de un anumit tag din orice fisier .feature
#
#  Background:
#    Given setup the entries in database
#    And launch the browser from config variables
#    And hit the home page url of banking site


    @RegressionTest @NetBanking
    Scenario: Admin Page default login
        Given User is on NetBanking landing page
            #codul din gilimele "admin si "1234" va fi introdus in step in variabila {string}, si implicit in argumentele
            #metodei
        When  User login into application with "admin" and password "1234"
        Then  Home Page is displayed
        And   Cards are displayed

    @RegressionTest
    @SmokeTest #este un tag si putem cupla mai multe scenarii pentru a le rula doar pe acelea -> putem avea oride denumire ex: @TestAdnShit
    Scenario Outline: User Page default login
        Given User is on NetBanking landing page
        When  User login into application with "<Username>" and password "<Password>"
        Then  Home Page is displayed
        And   Cards are displayed
        Examples:
        | Username | Password |
        |   ggggg  | hello    |
        |   baubau | booom    |
