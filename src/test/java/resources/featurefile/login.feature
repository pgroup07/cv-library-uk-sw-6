@regression
Feature: Search functionality

  @smoke
  Scenario Outline: verify job Search Result Using Different Dataset
    Given I am on Homepage
    When I accept cookies
    And I Enter Job title "<JobTitle>"
    And I Enter Location "<Location>"
    And I select Distance "<Distance>"
    And I click on more Search Option Link
    And I Enter Minimum Salary"<Min Salary>"
    And I Enter Maximum Salary"<Max Salary>"
    And I Enter Salary Type "<Salary Type>"
    And I select Job type "<Job Type>"
    Then I click on find job Button
    Then Verify the "<Result>"

    Examples:
      | JobTitle                 | Location              | Distance | Min Salary | Max Salary | Salary Type | Job Type  | Result                                                 |
      | Tester                   | Harrow                | 5 miles  | 30000      | 500000     | Per annum   | Permanent | Permanent Tester jobs in Harrow                        |
      | Automation Tester        | Leeds                 | 7 miles  | 35000      | 55000      | Per month   | Contract  | Contract Automation Tester jobs in Leeds               |
      | Automotive Technician    | Raymond's Hill, Devon | 15 miles | 10         | 12         | Per hour    | Temporary | Temporary Automotive Technician jobs in Raymond's Hill |
      | Manual Tester            | Luton                 | 25 miles | 30000      | 45000      | Per annum   | Permanent | Permanent Manual Tester jobs in Luton                  |
      | Administration Assistant | Manchester            | 25 miles | 1500       | 2000       | Per week    | Permanent | Permanent Administration Assistant jobs in Manchester  |
      | Supervisor               | London                | 25 miles | 20000      | 30000      | Per annum   | Contract  | Contract Supervisor jobs in London                     |
