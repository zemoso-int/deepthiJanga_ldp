Feature: Select Skill in Your skills page

User should be able to select and remove skills

Scenario: Enter input in skill field with valid data and see auto suggestion
    Given User have launched the green commute application
    And User will navigate to Your skills page
    When User enter valid skill in enter your skill field
    Then User will see the auto suggestions of skill entered

Scenario: No skill should be selected on page refreshing
    Given User have launched the green commute application
    And User will navigate to Your skills page
    When User select a skill 
    And refreshes the page
    Then User will see no skill selected

Scenario: Should be able to remove selected skill from input field
    Given User have launched the green commute application
    And User will navigate to Your skills page  
    When User select a skill 
    And removes selected skill
    Then User will see no skill selected  

Scenario: Enter input in skill field with valid data and see "No options" message
    Given User have launched the green commute application
    And User will navigate to Your skills page
    When User enter invalid skill in enter your skill field
    Then User will see "No Options" message