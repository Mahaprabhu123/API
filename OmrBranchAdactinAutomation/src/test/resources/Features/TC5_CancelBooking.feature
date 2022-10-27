Feature: Verifying the Cancel booking of Adactin Hotel

  Scenario Outline: Verifying the Cancel booking of Adactin Hotel by created order id
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
    Then User should verify after booking hotel success message "Booking Confirmation" and saved Order id
    And User should cancel created order id
    Then User should verify after Cancel order id "The booking has been cancelled."

    Examples: 
      | username   | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName | lastName | billingAddress |
      | Greens8767 | L4R739   | Sydney   | Hotel Creek | Double   | 2 - Two   | 01/10/2022  | 02/10/2022   | 1 - One       | 1 - One         | maha      | prabhu   | chennai        |

  Scenario Outline: Verifying the Cancel booking of Adactin Hotel by existing order id
    Given User should be in the login page of Adactin Hotel webpage
    When User should  login using "<username>","<password>"
    Then User should verify after login success message "HelloGreens8767!"
    And User should cancel existing order id "<orderId>"
    Then User should verify after cancel order id success message "The booking has been cancelled."

    Examples: 
      | username   | password | orderId    |
      | Greens8767 | L4R739   | 3568741568 |
