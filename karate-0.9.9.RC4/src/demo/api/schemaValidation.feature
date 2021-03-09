Feature: Json schema validation

        Background:
   * url baseUrl
   * header Accept = 'application/json'
#    * header Authorization = 'Bearer #'
* def expectedJsonSchema = read('../testData/schema.json')
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
              * def firstResponse = response[0]
              * print 'Response is: ', firstResponse
             Then match firstResponse == expectedJsonSchema