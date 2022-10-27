Feature: Verifying the Search page of Adactin Hotel

  Scenario Outline: Verifying the Search page of Adactin Hotel by Selecting all the fields
    Given User should be in the login page of Adactin Hotel webpage
    When User should  login using "<username>","<password>"
    Then User should verify after login success message "HelloGreens8767!"
    And User should search  hotels by selecting all the fields using"<location>","<hotels>","<roomType>", "<noOfRooms>","<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after Search Hotel success  "Select Hotel"

    Examples: 
      | username   | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Greens8767 | L4R739   | Sydney   | Hotel Creek | Double   | 2 - Two   | 01/10/2022  | 02/10/2022   | 1 - One       | 1 - One         |

  Scenario Outline: Verifying the Search page of Adactin Hotel by selecting only the mandatory fields
    Given User should be in the login page of Adactin Hotel webpage
    When User should login using "<username>" and "<password>"
    Then User should verify after login success message "Hello Greens8767!"
    And User should search hotels by selecting only the mandatory fields using "<location>", "<noOfRooms>","<checkInDate>", "<checkOutDate>"and "<adultsPerRoom>"
    Then User should verify after Search Hotel  "Select Hotel"

    Examples: 
      | username   | password | location | noOfRooms | checkInDate | checkOutDate | adultsPerRoom |
      | Greens8767 | L4R739   | Sydney   | 2 - Two   | 01/10/2022  | 02/10/2022   | 1 - One       |

  Scenario Outline: Verifying the Search page of Adactin Hotel by invalid date
    Given User should be in the login page of Adactin Hotel webpage
    When User should login using "<username>" and "<password>"
    Then User should verify after login success message "Hello Greens8767!"
    And User should Search  hotels by selecting all the fields using "<location>", "<hotels>","<roomType>", "<noOfRooms>","<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after date error message after search "Check-In Date shall be before than Check-Out Date","Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username   | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Greens8767 | L4R739   | Sydney   | Hotel Creek | Double   | 2 - Two   | 01/10/2023  | 02/10/2022   | 1 - One       | 1 - One         |

  Scenario Outline: Verifying the Search page of Adactin Hotel without selecting any of the fields
    Given User should be in the login page of Adactin Hotel webpage
    When User should login using "<username>" and "<password>"
    Then User should verify after login success message "Hello Greens8767!"
    And User should Search the Hotel without selecting any fields
    Then User should verify a location error message after search "Please Select a Location"

    Examples: 
      | username   | password |
      | Greens8767 | L4R739   |
