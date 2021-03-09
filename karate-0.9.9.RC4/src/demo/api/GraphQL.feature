Feature: GraphQL

        Background:
   * url baseUrlGraph
   * header Accept = 'application/json'
    
        @tag1
        Scenario: Get list of graph QL quries
        
            Given text query =
            """
            query{
                jobs{
                    id
                }
            }    
            """
            Given path '/'
              And request {query: '#(query)'}
             When method post
             Then status 200
              * print 'Response is: ', response