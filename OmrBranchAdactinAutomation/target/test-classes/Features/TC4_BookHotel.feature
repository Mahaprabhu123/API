Feature: Verifying the Bookpage of Adactin Hotel

  Scenario Outline: Verifying the Bookpage of Adactin Hotel by Entering all fields
    Given User should be in the login page of Adactin Hotel webpage
    When User should  login using "<username>","<password>"
    Then User should verify after login success message "HelloGreens8767!"
    And User should search  hotels by selecting all the fields using"<location>","<hotels>","<roomType>", "<noOfRooms>","<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after Search Hotel  "Select Hotel"
    And User should select a hotel name
    Then User should verify after select hotel name success message "Book A Hotel"
    And User should Book a Hotel "<firstName>","<lastName>","<billingAddress>"
      | cardNo           | cardType         | expMonth  | expYear | cvv |
      | 2345678954322345 | American Express | July      |    2023 | 123 |
      | 2345678954322345 | VISA             | September |    2024 | 234 |
      | 1234567890123456 | Master Card      | October   |    2025 | 345 |
    Then User should verify after booking hotel success message "Booking Confirmation"

    Examples: 
      | username   | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName | lastName | billingAddress |
      | Greens8767 | L4R739   | Sydney   | Hotel Creek | Double   | 2 - Two   | 01/10/2022  | 02/10/2022   | 1 - One       | 1 - One         | maha      | prabhu   | chennai        |

  Scenario Outline: Verifying the Bookpage of Adactin Hotel by Without Entering all fields
    Given User should be in the login page of Adactin Hotel webpage
    When User should login using "<username>" and "<password>"
    Then User should verify after login success message "Hello Greens8767!"
    And User should search hotels by selecting only the mandatory fields using "<location>", "<noOfRooms>","<checkInDate>", "<checkOutDate>"and "<adultsPerRoom>"
    Then User should verify after Search Hotel  "Select Hotel"
    And User should click continue without select any hotel name
    Then User should verify without select any hotel name error message "Please Select a Hotel"
    And User should click Book Now without enter any fiedls
    Then User should verify without enter any fields while booking error message "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | username   | password | location | noOfRooms | checkInDate | checkOutDate | adultsPerRoom |
      | Greens8767 | L4R739   | Sydney   | 2 - Two   | 01/10/2022  | 02/10/2022   | 1 - One       |
