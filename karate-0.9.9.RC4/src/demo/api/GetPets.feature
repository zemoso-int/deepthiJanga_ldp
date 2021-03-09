Feature: Pet Store get calls

        Background:
   * url baseUrl
   * header Accept = 'application/json'
#    * header Authorization = 'Bearer #'
    * def parameters =
      """
            {
              status: 'available'
            }
      """

        @tag1
        Scenario: Get list of available pets
        
            Given path findByStatusPath
              And params parameters
             When method get
             Then status 200
              * print 'Response is: ', response
              * def firstResponse = response[0]
             Then match response..name contains ["doggie"]

        @tag2
        Scenario: Get list of available pets
            Given path findByStatusPath
              And param status = 'available'
             When method get
             Then status 200
             * def uploadStatusCode = responseStatus
            * print 'Response status is: ', uploadStatusCode
              And match responseStatus == 200
              And match responseType == 'json'
              # And assert responseTime < '10000'
              And match response.id == '#notnull'
              And def userResponse = response
             Then match userResponse..name contains ["doggie"]

        @tag3
        Scenario: Get pet by id
        * def petId = '112233'
            Given path '/v2/pet/'
              And path petId
             When method get
             Then status 200
              And match response.id == 112233


        @tag4
        Scenario: get all pets and then get the first pet by id
            Given path '/v2/pet/findByStatus'
              And params parameters
             When method get
             Then status 200
              * print 'Response is: ', response
      
       * def firstResponse = response[1]

            Given path '/v2/pet/'+ firstResponse.id
             When method get
             Then status 200
             Then match responseStatus == 200
             * print 'Response is: ', response


        @tag5
        Scenario: Get the list of available pets
        
            Given path findByStatusPath
              And params parameters
             When method get
             Then status 200
