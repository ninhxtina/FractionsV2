# FractionsV2
## Summary
Build two classes (Fraction and FractionCounter) and a Driver for use in counting the number of unique fractions read from a text file.   We’ll also reuse the ObjectList class we built in lab to store our list of unique FractionCounters, instead of directly using arrays or the ArrayList. Rather than designing a monolithic chunk of code in main like we did in the previous homework, we’ll practice distributing our code into containers (called classes) that you will design specifically to tackle this same problem in a different and more logically organized fashion.

Remember

- NO DECIMALS!
- Handle input of any length

## Introduction
Your project is to read in a series of fractions from a text file, which will have each line formatted as follows:   “A/B”.  A sample text file is listed below, and the purpose of your program is to read in one line at a time and build a Fraction object from A and B.  For each unique Fraction seen, your program will create a FractionCounter object used to track the number of occurrences of that specific fraction.  When all the input is consumed, your program will print out its ObjectList of unique FractionCounters, which should report the fraction and its count – see output below. You can assume no blank lines or misleading characters; see the text file link above for the some of the input I’ll use when testing your submission. Your program must reduce fractions, as demonstrated in the output below.
