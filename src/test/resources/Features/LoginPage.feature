@Syed
Feature: Datatable Verification
  To Check after every transaction that the correct account has been transfered

  @smokeTest
  Scenario Outline: To veriy the last transaction
  	Given navigate to the "<url>"
    And User is loggedin to the application with the "<username>" and "<password>" in Browser
    When user click on primary account details
    Then User lands on Account details Tab
    And Logs out of the application

    Examples: 
      | url                                        | username | password   |
      | http://elastic.rapidtestpro.com:8086/index | labuser  | labuser@01 |