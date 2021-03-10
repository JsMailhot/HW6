# HW6
## How many bugs did you find in the unit testing?  What were they?

###I found only a few bugs in the code. My first test ran into an issue with the ThreadLocalRandom as it was attempting to get an item at index of 1 + 1 from a list of 1 item. This was solved by changing the origin of the ‘.nextInt()’ method call to 0 and setting the if ‘(upperRange > 1)’ to ‘if(upperRange > 0’, allowing for the ‘.drawToken()’ method to be called with only 1 item in the list by getting the index of 0 + 1 from a list of 1 item. The next error I encountered was in the second test to get the string. As it was not utilizing the ‘@Override’ feature the ‘.toString()’ method call would simply return the type. This was fixed by adding the ‘@Override’ feature before the ‘public String toString()’ method definition in the DiceBag.java file. The third test ran without fail as the issues that would have been brought up in this test were discovered and taken care of in the two prior tests. After I completed writing the tests I moved on to attempt to get the application in a working order. I ran the application and found that it only really had one fatal bug and a few syntax errors. The fatal error was due to the int die in the .drawToken() method of the DiceBag class being outside the if (upperRange > 0) statement causing it to fail on the final pull of a for loop on the indexed length. The other errors were syntactual in nature like the prints being off, some missing logic code and adding @Override to the toString() method of the OrderDie class which was not returning the variable it was generating.

## Did you find any bugs when using the debugger?  What were they?

###I used the debugger when I was alerted to the issues in the given tests to examine the variables at the time of the test being ran so I could compare them to their respective results and see how they were obtained. I was able to find out using the debugger how the second test was missing the ‘@Override’ feature as when stepping into the ‘.toString()’ method call it did not execute the expected code. This saved me some time from having to comb through each line of each file to discover where there might have been an issue. Once I had finished running the tests and ran the GameController.java file to see if I could complete the challenge and discovered the fatal error I used the debugger to look at exactly what variable was causing the issue. This was fairly easy to set up and lead me directly to the answer, not having to open the file and search through each line of code makes the process much faster.

## Provide link to code to your GitHub account.

###https://github.com/JsMailhot/HW6

## Put the fixed code into your GitHub account.

### Here it be!

## Are there any unit tests that could have found the bugs you found in the debugger?  Describe one of those tests.

###I could have found the fatal bug in a test if I had ran the myDiceBag through a for loop on the index of its length. I also could have found the .toString() method error in the OrderDie class if I had compared the string like in one of the other tests done.

## Propose 1 extra credit question for the exam.

###Do you think combining user stories, JUnit testing and Umlet diagrams together can be useful for anything? Why (or not) and how so?
