#sintaxa unui fisier .feature -> acest fisier va fi folosit la urma de un fisier de tipul step definition care
# va fi de tipul .java

#1. definim Feature -> de obicei numele feater-ului va fi si numele fisierului
#2. sub Feature, vom avea description a acelui feature -> este optional
#3. Definim apoi un Scenario -> in care definim Given, When, Then
#4. in calsa StepDef se va uita dupa @Given si va asocia denumirea din adnotare -> 'User is on NetBanking landing page'
#   cu ce avem in Given aici -> ATENTIE!! -> textul trebuie sa fie identic
#
#5. Atentie!! -> daca stringul deinGiven de la 2 scenarii este identic atunci acelasi Given din step poate fi folist pentru
#   ambel scenarii
#
#6. Scenario Outline -> inseamanca avem test parametrizat si ca trebuie sa definim o serie de exemple in sectiunea Examples:
#   pentru a trimite informatie in testul parametrizat trebuie sa funem variabilele intre  ---> <>
#
#7. @SmokeTest -> este un tag -> poate avea oricedenumire dar sa incepa cu @. Putem sa folosim tag-uri pentru a grupa teste
#   astfel incat sa rulam doar acele teste si nu pe toate
#
#8. Background: -> este echivalentul lui @BeforeEach -> ce e in background va fi executat inaintea fiecarui scenariu din
#   acel fisier
#
#
#
#
#
#
Feature: Application Login
    I want to test something

    #se va executa doar pentru acest fisier
    Background:
        Given setup the entries in database
        And launch the browser from config variables
        And hit the home page url of banking site

    @RegressionTest @NetBanking
    Scenario: Admin Page default login
        Given User is on NetBanking landing page
        #codul din gilimele "admin si "1234" va fi introdus in step in variabila {string}, si implicit in argumentele
        #metodei
        When  User login into application with "admin" and password "1234"
        Then  Home Page is displayed
        And   Cards are displayed

        #exemplu pentru regular expresion
    @RegressionTest
    Scenario: User Page default page
        Given User is on NetBanking landing page
        When  User login into application with "user" and password 0953
        Then  Home Page is displayed
        And   Cards are displayed

    @RegressionTest
    @SmokeTest #este un tag si putem cupla mai multe scenarii pentru a le rula doar pe acelea -> putem avea oride denumire ex: @TestAdnShit
        #Scenario Outline: -> trebuie sa adaugam Outinle la scenariu ca sa putem face un test parametrizat. Practic acum toate cele 3 stepuri
        # vor fi executate de 2 ori, cate odata pentru fiecare exemplu.
    Scenario Outline: User Page default login
        Given User is on NetBanking landing page
        When  User login into application with "<Username>" and password "<Password>"
        Then  Home Page is displayed
        And   Cards are displayed
        Examples:
            | Username | Password |
            |   ggggg  | hello    |
            |   baubau | booom    |

        # la When data va veni sub forma de List<String>
    @SmokeTest
    Scenario: Admin Page default Sign up
        Given User is on Practice page
        When  User SignUP into application
        #in cazul de fata se va creea o lista pe care o va primi metoda de When
            | user |
            | mail |
            | dasdasdasd |
        Then  Home Page is displayed
        And   Cards are displayed
