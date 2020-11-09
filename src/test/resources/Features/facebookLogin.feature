Feature: Validating facebook login page


Scenario Outline: Verify if user is able to login successfully
  Given user is in facebook login page
  When user enters correct "<email>" address
  And user enter correct "<password>"
  And user click on login button
  Then user should successfully login to facebook
  Examples:
    | email  | password  |
    | test_fqipdsy_user@tfbnw.net | test1234 |
    | test_rcygypc_duplicate@tfbnw.net | test1234 |

#  Scenario: Verify if user is unable to login successfully
#    Given user is in facebook login page
#    When user enters incorrect email address
#    And user enter incorrect password
#    Then user should not be able to login to facebook




	
		