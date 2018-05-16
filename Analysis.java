/* Problem Statement

A college offers a course that prepares students for the state
licensing exam for real-estate brokers. Last year, ten of the
students who completed this course took the exam. You've been
asked to write a program to summarize the results. You've been
given a list of the 10 students. Next to each name is written
a 1 if the student passed the exam or a 2 if the student failed.

Your program should analyze the results of the exam as follows:

1. Input each test result (i.e. a 1 or a 2). Display the message
"Enter result" on the screen each time the program requests 
another test result.

2. Count the number of test result of each type.

3. Display a summery of the test results, indicating the number
of students who passed and the number who failed.

4. If more than eight students passed the exam, print "Bonus to
instructor!"

*** Let's begin the top-down, stepwise refinement ***

Initialize passes o zero
Initialize failures to zero
Initialize student counter to one

While student counter is less than or equal to 10
	Prompt the user to enter the next exam result
	Input the next exam result

	If the student passed
		Add one to passes
	Else
		Add one to failures

	Add one to student counter

Print the number of passes
Print the number of failures
If more than eight students passed
	Print "Bonus to instructor!"


