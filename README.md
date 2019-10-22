# PPKWU-Zad2

General response format (for 1, 2, 3, 4 endpoints) : 
 Response format :
  {
    "error": true/false, 
    "amount": x,
    "positions": [i1, i2, i3, i....]
  }
  
  Legend : 
  "error"     - true, if "amount" and "possition" contain right data
              - false, if "amount" equals zero
  
  "amount"    - contains how much characters (upper, lower, etc) exists in string
  "positions" - contains where, in string, characters are. Position starts from 0.
  
Response format for endpoint 5 :
  {
    "result": [
      {
        "error": true/false, 
        "amount": x,
        "positions": [i1, i2, i3, i....]
      },
      {
        "error": true/false, 
        "amount": x,
        "positions": [i1, i2, i3, i....]
      },
      {
        "error": true/false, 
        "amount": x,
        "positions": [i1, i2, i3, i....]
      },
      {
        "error": true/false, 
        "amount": x,
        "positions": [i1, i2, i3, i....]
      }
    ]
  }
  
  First block is responsible for upper case character
  Second block is responsible for lower case character
  Third block is responsible for digits character
  Fourth is responsible for special character

Endpoints : 

1. GET /stringAnalyzer/hasUpperCaseCharacter?input=text
  Check amount and positions of upper case character in input string
  
2. GET /stringAnalyzer/hasLowerCaseCharacter?input=text
  Check amount and positions of lower case character in input string

3. GET /stringAnalyzer/hasDigitCharacter?input=text
  Check amount and positions of digits character in input string

4. GET /stringAnalyzer/hasSpecialCharacter?input=text
  Check amount and positions of special character in input string

5. GET /stringAnalyzer/hasMixedCharacter?input=text
  Check amount and positions of upper case character in input string
