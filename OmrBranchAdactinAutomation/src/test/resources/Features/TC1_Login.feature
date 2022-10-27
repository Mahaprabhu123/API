@Login
Feature: Verifying the login page of Adactin Hotel

  Scenario Outline: Verifying the login page of Adactin Hotel using valid Credentials
    Given User should be in login page of Adactin Hotel webpage
    When User should  login using "<username>","<password>"
    Then User should verify after login success message"HelloGreens8767!"

    Examples: 
      | username   | password |
      | Greens8767 | L4R739   |

  Scenario Outline: Verifying the login page of Adactin Hotel using Enter Key
    Given User should be in the login page of Adactin Hotel webpage
    When User should  login using "<username>","<password>" with Enter Key
    Then User should verify after login success message "HelloGreens8767!"

    Examples: 
      | username   | password |
      | Greens8767 | L4R739   |

  Scenario Outline: Verifying the login page of Adactin Hotel using Invalid Credentials
    Given User should be in the login page of Adactin Hotel webpage
    When User should  login using "<username>","<password>"
    Then User should verify after login with invalid credentials error message contains "verify invalid login details or password must have been expired"

    Examples: 
      | username    | password |
      | Greens12344 | Abcdfehg |
