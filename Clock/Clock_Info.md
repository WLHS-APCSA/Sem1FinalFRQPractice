You are given a class Clock. 
It has two int fields: hours and minutes. 
The clock has a minute scale from 0 to 59 and an hour scale from 1 to 12. The clock does not know whether it's day or night (no AM or PM).


Implement the Clock class with:
* Default constructor that make the time 12:00
* Contrustor that takes in two int parameters - hours and minutes
* setHours()
* setMinutes()
* getHours()
* getMinutes()
* next() that increases the value of minutes by 1. The minutes must be reset to zero when the current hour ends. Do not forget to change the hours as well.
* toString method that prints ```The time is hh:mm```. This has been done for you already

Example
```
Clock clock = new Clock(11,59);
clock.next();
System.out.println(clock) //should show 12:00
```

Possible times to test:
```
11:59 -> 12:00
1:14 -> 1:15
10:58 -> 10:59
11:01 -> 11:02
12:59 -> 1:00
12:01 -> 12:02
```
