Feature: Add a user

        Background:

* configure headers = { 'Content-Type': 'application/json' }

        Scenario Outline: Add a user

        * url baseUrl
        * def user =  read('../testData/data.json')
            Given path '/v2/user/createWithList'
              And request user[1]
             When method post
             Then status 200
             Then match responseStatus == 200

        Examples:
                  | read('../testData/inputData.csv') |