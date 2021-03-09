Feature: Call from another class

        Scenario: Get available dogs
        * def myFeature = call read('example.feature')
        * print myFeature.response  
