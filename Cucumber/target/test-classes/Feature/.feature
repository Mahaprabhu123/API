Feature: verifying Adactin Hotel login Details

Scenario:  Verifying Adactin Hotel Login With Valid Credentials
Given User is on the Adactin Hotel Page
When User Should Enter "<username>","<password>"
And User Should search hotels "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<childrenPerRoom>"
And User should select hotels
And User should book hotels "<firstname>","<lastname>","<billingaddress>","<creditcardno>","<creditcardtype>","<month>","<year>","<cvvnumber>"

Examples: 

|username  | password|location|hotels|roomType|numberOfRooms|checkInDate|checkOutDate|adultsPerRoom|childrenPerRoom|firstname|lastname|billingaddress|creditcardno|creditcardtype|month|year|cvvnumber|
|Greens8767| L4R739  |Sydney|Hotel Creek|Double|2 - Two|30/09/2022|01/09/2022|2 - Two|1 - One|kishore|kumar|w12|1234567891023654|VISA|May|2022|4578|	 
