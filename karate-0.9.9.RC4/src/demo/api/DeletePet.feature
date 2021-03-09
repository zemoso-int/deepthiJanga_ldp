Feature: Delete pet

        Background:
        * url baseUrl
        * def list = call read('Get.feature@tag5')

        Scenario: Get available dogss
            
         * def firstResponse = list.response[1]
         * print 'id is : ', firstResponse.id
            Given path '/v2/pet/'+ firstResponse.id
             When method delete
                * print 'Response is: ', response
             Then status 200


            Given path '/v2/pet/'+ firstResponse.id
             When method get
                * print 'Response is: ', response
             Then status 404
              And assert response.message == "Pet not found"

        
