Feature: Pet Store post calls

        Background:
   * url baseUrl
   * header Accept = 'application/json'
    * def jsonData = read('../testData/dataPost.json')
#    * header Authorization = 'Bearer #'

        Scenario: Add new pet
            Given path '/v2/pet'
              And request jsonData[0]
             When method post
             Then status 200
              And def userResponse = response
             Then print 'Url is : ',
              * print 'Response is: ', userResponse
              * def id = response.id
              * print 'created id is: ', id


        Scenario: Post new pet as user
            Given path '/v2/user/createWithArray'
              And request jsonData[1]
             When method post
             Then status 200
              And def userResponse = response
              * print 'Response is: ', userResponse
              * def id = response.id
              * print 'created id is: ', id

