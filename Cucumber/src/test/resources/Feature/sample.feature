Feature: Verifying Adactinhotel login page

  Scenario Outline: Verifying Adactinhotel login with valid credentials
    Given User is on the Adactinhotel page
    When User should enter "<UserName>" and "<Password>"
    And USer should click the login button
    And User should search the hotels "<location>", "<hotels>","<roomtype>", "<Noofrooms>","<checkindate>", "<checkoutdate>", "<adultsperroom>" and "<childrenperroom>"
    And User should select the hotel
    And User should Book a hotel "<FirstName>", "<LastName>","<Address>", "<CardNo>","<CardType>", "<CardExMonth>", "<CardExYear>" and "<CVVno>"
    And User should click book button
    Then User should verify the orderID

    Examples: 
      | UserName   | Password | location    | hotels         | roomtype | Noofrooms | checkindate | checkoutdate | adultsperroom | childrenperroom | FirstName  | LastName | Address | CardNo           | CardType | CardExMonth | CardExYear | CVVno |
      | Greens8767 | L4R739   | Sydney      | Hotel Creek    | Double   | 2 - Two   | 01/10/2022  | 02/10/2022   | 1 - One       | 1 - One         | Mahaprabhu | Ram      | Chennai | 5434123465437865 | VISA     | December    |       2022 |   345 |
      | Greens8767 | L4R739   | Melbourne   | Hotel Sunshine | Double   | 2 - Two   | 01/10/2022  | 02/10/2022   | 1 - One       | 1 - One         | Maha       | D        | Chennai | 5465342176896543 | VISA     | December    |       2022 |   987 |
      | Greens8767 | L4R739   | Brisbane    | Hotel Hervey   | Double   | 2 - Two   | 01/10/2022  | 02/10/2022   | 1 - One       | 1 - One         | Raman      | DJ       | Chennai | 5434123465437865 | VISA     | December    |       2022 |   654 |
      | Greens8767 | L4R739   | London      | Hotel Sunshine | Double   | 2 - Two   | 01/10/2022  | 02/10/2022   | 1 - One       | 1 - One         | Priya      | J        | Chennai | 5434123465437866 | VISA     | December    |       2022 |   234 |
      | Greens8767 | L4R739   | New York    | Hotel Cornice  | Double   | 2 - Two   | 01/10/2022  | 02/10/2022   | 1 - One       | 1 - One         | Dhanvi     | JP       | Chennai | 5434123465437867 | VISA     | December    |       2022 |   436 |
      | Greens8767 | L4R739   | Adelaide    | Hotel Creek    | Double   | 2 - Two   | 01/10/2022  | 02/10/2022   | 1 - One       | 1 - One         | Siddharth  | S        | Chennai | 5434123465437868 | VISA     | December    |       2022 |   638 |
      | Greens8767 | L4R739   | Los Angeles | Hotel Hervey   | Double   | 2 - Two   | 01/10/2022  | 02/10/2022   | 1 - One       | 1 - One         | Sriram     | S        | Chennai | 5434123465437869 | VISA     | December    |       2022 |   812 |
      | Greens8767 | L4R739   | Paris       | Hotel Cornice  | Double   | 2 - Two   | 01/10/2022  | 02/10/2022   | 1 - One       | 1 - One         | Tharun     | V        | Chennai | 5434123465437863 | VISA     | December    |       2022 |   479 |
      | Greens8767 | L4R739   | London      | Hotel Hervey   | Double   | 2 - Two   | 01/10/2022  | 02/10/2022   | 1 - One       | 1 - One         | kani       | P        | Chennai | 5434123465437865 | VISA     | December    |       2022 |   257 |
      | Greens8767 | L4R739   | Adelaide    | Hotel Cornice  | Double   | 2 - Two   | 01/10/2022  | 02/10/2022   | 1 - One       | 1 - One         | Daniel     | P        | Chennai | 5434123465437865 | VISA     | December    |       2022 |   681 |
