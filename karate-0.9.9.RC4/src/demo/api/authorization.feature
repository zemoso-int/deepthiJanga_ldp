Feature: Cat Store get calls with auth

        Background:
   * url catApi
   * header Content-Type = 'application/json'
   * header x-api-key = xApiKey
   * def expectedOutput = read('../testData/cat.json')
    
        Scenario: Get list of favorites
        
            Given path 'v1/favourites'
             When method get
             Then status 200
              * print 'Response is: ', response
              * def firstResponse = response[0]
             Then match response..user_id contains ['15']
             Then match response == expectedOutput

