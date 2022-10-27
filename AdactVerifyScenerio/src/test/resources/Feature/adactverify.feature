Feature: Veriffy Adactin Hotel login credentials

  Scenario Outline: Verify Adactin Hotel Login valid
    Given user is on the adactin page
    When user should perform login "<username>","<password>"
    Then user should verify after login success msg"HelloGreens8767!"

    Examples: 
      | username   | password |
      | Greens8767 | L4R739   |

  Scenario Outline: Verifying Adact Hotel using Enter
    Given user is on the Adactin login page
    When user should perform login "<username>","<password>" with EnterKey
    Then user should verify after login success message "HelloGreens8767!"

    Examples: 
      | username   | password |
      | Greens8767 | L4R739   |

  Scenario Outline: Verifying Adactin Hotel login Invalid Credentials
    Given user is on the adactin page
    When user should perform login "<username>","<password>"
    Then user should verify after login with Invalid Credential error msg contains "password must have expired"

    Examples: 
      | username    | password |
      | Greens12344 | Abcdfehg |
