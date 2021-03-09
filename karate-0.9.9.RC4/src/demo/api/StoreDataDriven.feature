Feature: test favorites
        Background:
   
    * configure headers = { 'Content-Type': 'application/json' }

        Scenario Outline: post a user

              * def user =  read('../testData/data.json')
              * url baseUrl
            Given path 'v2/user'
              And request  user[1]
             When method post
             Then status 200
             Then print response

        Examples:
                  | read('../testData/inputData.csv') |
                #   | id | username   | firstname | lastname | email                        | password | phone        |
                #   | 0  | zemosoTest | Zemoso    | Karate   | zemoso.karate@zemosolabs.com | Test@123 | 919867787654 |

