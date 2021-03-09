Feature: sample karate api test script
  

        Background:
    * url baseUrl
    * headers  Accept = 'application/json'
    #creates a random string
    * def randomStringusername = 
    """
    currTime = new Date();
      function(){ return "random username "+currTime.getMilliseconds() } 
    """
      
    * def username = call randomStringusername 
  
    * def user = read('../testData/data.json')
        Scenario: post a new user
            Given path 'v2/user'
              And request user[0]
             When method post
             Then status 200
             Then print response