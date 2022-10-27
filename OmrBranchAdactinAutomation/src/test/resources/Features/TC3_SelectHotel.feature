Feature: Verifying the Selectpage of Adactin Hotel

  Scenario Outline: Verifying the Selectpage of Adactin Hotel by Select a hotel name
    Given User should be in the login page of Adactin Hotel webpage
    When User should  login using "<username>","<password>"
    Then User should verify after login success message "HelloGreens8767!"
    And User should search  hotels by selecting all the fields using"<location>","<hotels>","<roomType>", "<noOfRooms>","<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after Search Hotel  "Select Hotel"
    And User should select a hotel name
    Then User should verify after select hotel name success message "Book A Hotel"

    Examples: 
      | username   | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Greens8767 | L4R739   | Sydney   | Hotel Creek | Double   | 2 - Two   | 01/10/2022  | 02/10/2022   | 1 - One       | 1 - One         |

  Scenario Outline: Verifying the Selectpage of Adactin Hotel by Without Select the hotel name
    Given User should be in the login page of Adactin Hotel webpage
    When User should login using "<username>","<password>"
    Then User should verify after login success message "Hello Greens8767!"
    And User should search hotels by selecting only the mandatory fields using "<location>", "<noOfRooms>","<checkInDate>", "<checkOutDate>"and "<adultsPerRoom>"
    Then User should verify after Search Hotel  "Select Hotel"
    And User should click continue without select any hotel name
    Then User should verify without select any hotel name error message "Please Select a Hotel"

    Examples: 
      | username   | password | location | noOfRooms | checkInDate | checkOutDate | adultsPerRoom |
      | Greens8767 | L4R739   | Sydney   | 2 - Two   | 01/10/2022  | 02/10/2022   | 1 - One       |
