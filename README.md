# RacesofThreads



Assignment

Create an ArrayList consisting of numbers from 1 to 10,000. Then, divide these 10,000 elements in the ArrayList into 4 equal parts, each containing 2500 elements. Design 4 separate Threads to find odd and even numbers within these 4 separate ArrayLists of 2500 elements.

Each of the 4 Threads will add the even numbers it finds to a common ArrayList.

Each of the 4 Threads will add the odd numbers it finds to a common ArrayList.

The ArrayLists that store odd and even numbers will be empty when initially created. And there will be two ArrayLists in total.

When each of the 4 Threads starts processing its own 2500-element ArrayList, it will fill the ArrayLists for odd and even numbers.
