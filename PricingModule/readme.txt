Design Considerations:

Approach followed : Coding in interfaces
 
   Considered this approach as it is easy to modify,  if at all new variations of cycles are manufactured in future.

   Each component is considered is a class and is derived from generic type.

   for wheel component wheel is interface and alloywheel , steel wheel are classes.

   for frame component frame is interface and ironframe, steelframe are classes.

   for seating component seating is interface and two seating , two seating are classes.
  
   The prices of the parts can be changed at any point of time so i had a seperate class for changing price values and retrieve it statically.(PriceSheet.java)

Used Factory DesignPattern: (PricingController.java)

  The input configuration class contains details about components
  ex: {
    "frame": "ironFrame",
    "seating": "twoseater",
    "wheels": "alloywheels",
    "season": "summer"
      }
  
  As every model of cycle is different component in my case, i am using factory design to get my objects and then call their 
 respective calculate price classes;

 The output is in Output Class contains price details
 ex:{
    "price": 1000,
    "wheelPrice": 400,
    "seatPrice": 400,
    "framePrice": 200
    }

Using Rest call to provide input:

Used rest because it is easy to consume (if we consider writing ui it will be easy.)

URL:http://localhost:8080/calculatePrice/getPrice

TestCases:
input:
 {
    "frame": "ironFrame",
    "seating": "oneseater",
    "wheels": "alloywheels",
    "season": "summer"
  }
outPut:
 ex:{
    "price": 800,
    "wheelPrice": 400,
    "seatPrice": 200,
    "framePrice": 200
    }
2.
if any invalid input is provided the default values are taken 
ex: for frame frame:steel default
    for wheel wheel default
    for seat twoseater default

input:
 {
    "frame": "test",
    "seating": "test",
    "wheels": "test",
    "season": "test"
  }
outPut:
 ex:{
    "price": 1000,
    "wheelPrice": 400,
    "seatPrice": 400,
    "framePrice": 200
    }


execution steps:
Import this project as a springboot project and run it on available port.
Hit this url URL:http://localhost:8080/calculatePrice/getPrice to get the result.


As it is time bound didnt get time to use multithreading:

Approach:

As input says 10 threads , we should use thread pool that is executor service's fixed thread pool should be used.
input can be given as a list and output as a list of future objects containg results.
