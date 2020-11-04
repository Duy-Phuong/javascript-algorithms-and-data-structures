

[TOC]







# Udemy - JavaScript Algorithms and Data Structures Masterclass



## 1. Introduction
### 1. Curriculum Walkthrough
### 2. What Order Should You Watch In
### 3. How I'm Running My Code
## 2. Big O Notation
### 1. Intro to Big O
### 1.1 BIG O Slides.html

https://cs.slides.com/colt_steele/big-o-notation#/0/0/0

![image-20201104001839116](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104001839116.png)  

![image-20201104001915788](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104001915788.png)  

![image-20201104002150129](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104002150129.png)

![image-20201104002258589](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104002258589.png)

![image-20201104002413446](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104002413446.png)

![image-20201104002541829](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104002541829.png)

![image-20201104072413035](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104072413035.png)

![image-20201104072502422](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104072502422.png)

![image-20201104072601722](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104072601722.png)

![image-20201104072645169](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104072645169.png)

![image-20201104072748985](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104072748985.png)

![image-20201104073131150](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104073131150.png)

![image-20201104073200892](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104073200892.png)

![image-20201104073239661](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104073239661.png)

![image-20201104073442213](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104073442213.png)

![image-20201104073515446](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104073515446.png)

![image-20201104073552018](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104073552018.png)![image-20201104073621857](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104073621857.png)

![image-20201104073638752](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104073638752.png)

![image-20201104073737767](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104073737767.png)



![image-20201104073802698](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104073802698.png)

![image-20201104073849529](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104073849529.png)

### 2. Timing Our Code

![image-20201104074315401](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20201104074315401.png)

### 3. Counting Operations
### 4. Visualizing Time Complexities
### 4.1 Performance Tracker Tool.html

https://rithmschool.github.io/function-timer-demo/

### 5. Official Intro to Big O
### 6. Simplifying Big O Expressions
### 7. Big O Time Complexity Quiz.html
### 8. Big O Time Complexity Quiz 2.html
### 9. Space Complexity
### 10. Big O Space Complexity Quiz.html
### 11. Logs and Section Recap

## 3. Analyzing Performance of Arrays and Objects
### 1. PREREQUISITES.html
### 2. Section Introduction
### 2.1 SLIDES.html

https://cs.slides.com/colt_steele/built-in-data-structures-25

### 3. The BIG O of Objects

![image-20200924231359969](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20200924231359969.png)

### 4. Object Operations Quiz.html
### 5. When are Arrays Slow
### 7. Array Operations Quiz.html
### 6. Big O of Array Methods
## 4. Problem Solving Approach
### 1. PREREQUISITES.html
### 2.1 SLIDES.html

https://cs.slides.com/colt_steele/problem-solving-patterns

### 2. Introduction to Problem Solving
### 3. Step 1 Understand The Problem

![image-20200924234639436](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20200924234639436.png)

### 4. Step 2 Concrete Examples

### 5. Step 3 Break It Down

### 6. Step 4 Solve Or Simplify

Count character in string

Dòng 55 gọi hàm toLowercase

![image-20200924235321230](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20200924235321230.png)

### 7. Step 5 Look Back and Refactor

![image-20200925002531560](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20200925002531560.png)  

![image-20200925003112103](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20200925003112103.png)  

![image-20200925003151530](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20200925003151530.png)  

![image-20200925003348360](JavaScript%20Algorithms%20and%20Data%20Structures.assets/image-20200925003348360.png)

### 8. Recap and Interview Strategies



## 5. Problem Solving Patterns
### 1. PREREQUISITES.html
### 2. Intro to Problem Solving Patterns
### 2.1 SLIDES.html

https://cs.slides.com/colt_steele/problem-solving-patterns



### 3. Frequency Counter Pattern

```js
function same(arr1, arr2){
    if(arr1.length !== arr2.length){
        return false;
    }
    for(let i = 0; i < arr1.length; i++){
        let correctIndex = arr2.indexOf(arr1[i] ** 2)
        if(correctIndex === -1) {
            return false;
        }
        console.log(arr2);
        arr2.splice(correctIndex,1)
    }
    return true;
}

same([1,2,3,2], [9,1,4,4])
=> O(n2)

------------------------- O(n) -------------------------------

function same(arr1, arr2){
    if(arr1.length !== arr2.length){
        return false;
    }
    let frequencyCounter1 = {}
    let frequencyCounter2 = {}
    for(let val of arr1){
        frequencyCounter1[val] = (frequencyCounter1[val] || 0) + 1
    }
    for(let val of arr2){
        frequencyCounter2[val] = (frequencyCounter2[val] || 0) + 1        
    }
    console.log(frequencyCounter1);
    console.log(frequencyCounter2);
    for(let key in frequencyCounter1){
        if(!(key ** 2 in frequencyCounter2)){
            return false
        }
        if(frequencyCounter2[key ** 2] !== frequencyCounter1[key]){
            return false
        }
    }
    return true
}

same([1,2,3,2,5], [9,1,4,4,11])

```



### 4. Frequency Counter Anagram Challenge

### 5. Frequency Counter - validAnagram.html

```js
function validAnagram(first, second) {
  if (first.length !== second.length) {
    return false;
  }

  const lookup = {};

  for (let i = 0; i < first.length; i++) {
    let letter = first[i];
    // if letter exists, increment, otherwise set to 1
    lookup[letter] ? lookup[letter] += 1 : lookup[letter] = 1;
  }
  console.log(lookup)

  for (let i = 0; i < second.length; i++) {
    let letter = second[i];
    // can't find letter or letter is zero then it's not an anagram
    if (!lookup[letter]) {
      return false;
    } else {
      lookup[letter] -= 1;
    }
  }

  return true;
}

// {a: 0, n: 0, g: 0, r: 0, m: 0,s:1}
validAnagram('anagrams', 'nagaramm')
```



### 6. Anagram Challenge Solution

### 7. Multiple Pointers Pattern

```js
function sumZero(arr){
    for(let i = 0; i < arr.length; i++){
        for(let j = i+1; j < arr.length; j++){
            if(arr[i] + arr[j] === 0){
                return [arr[i], arr[j]];
            }
        }
    }
}


sumZero([-4,-3,-2,-1,0,1,2,5])
```



### 8. Multiple Pointers Count Unique Values Challenge

### 9. Multiple Pointers - countUniqueValues.html

### 10. Count Unique Values Solution

### 11. Sliding Window Pattern

### 12. Divide And Conquer Pattern

## 6. 100% OPTIONAL Challenges
### 1. IMPORTANT NOTE!.html
### 10. Sliding Window - findLongestSubstring.html
### 11. SOLUTIONS PART 3.html
### 2. Frequency Counter - sameFrequency.html
### 3. Frequency Counter  Multiple Pointers - areThereDuplicates.html
### 4. SOLUTIONS PART 1.html
### 5. Multiple Pointers - averagePair.html
### 6. Multiple Pointers - isSubsequence.html
### 7. SOLUTIONS PART 2.html
### 8. Sliding Window - maxSubarraySum.html
### 9. Sliding Window - minSubArrayLen.html
## 7. Recursion
### 1. PREREQUISITES.html
### 10. Common Recursion Pitfalls
### 11. Helper Method Recursion
### 2. Story Time Martin & The Dragon
### 2.1 Recursion Slides.html
### 3. Why Use Recursion
### 4. The Call Stack
### 6. Recursion Quiz.html
### 8. Writing Factorial Iteratively
### 9. Writing Factorial Recursively
### 12. Pure Recursion
### 5. Our First Recursive Function
### 7. Our Second Recursive Function
## 8. Recursion Problem Set
### 1. START HERE!.html
### 2. power.html
### 3. factorial.html
### 4. productOfArray.html
### 5. recursiveRange.html
### 6. fib.html
### 7. SOLUTIONS FOR THIS SECTION.html
## 9. Bonus CHALLENGING Recursion Problems
### 1. NOTE ON THIS SECTION.html
### 10. stringifyNumbers.html
### 11. collectStrings.html
### 12. SOLUTIONS PART 2.html
### 2. reverse.html
### 3. isPalindrome.html
### 4. someRecursive.html
### 5. flatten.html
### 6. SOLUTIONS PART 1.html
### 7. capitalizeFirst.html
### 8. nestedEvenSum.html
### 9. capitalizeWords.html
## 10. Searching Algorithms
### 1. PREREQUISITES.html
### 10. Binary Search Solution
### 11. Binary Search BIG O
### 12. Naive String Search
### 13. Naive String Search Implementation
### 14. KNP COMING SOON.html
### 2. Intro to Searching
### 2.1 Slides.html
### 4. Linear Search Exercise.html
### 5. Linear Search Solution
### 6. Linear Search BIG O
### 7. Intro to Binary Search
### 8. Binary Search PseudoCode
### 9. Binary Search Exercise.html
### 3. Intro to Linear Search
## 11. Bubble Sort
### 1. PREREQUISITES.html
### 2. Introduction to Sorting Algorithms
### 2.1 Sorting Slides.html
### 2.2 Sorting Animations Website.html
### 3. Built-In JavaScript Sorting
### 3.1 Built-In JS Sort Documentation.html
### 4. Bubble Sort Overview
### 4.1 Visualgo Sorting (Click Bubble Sort).html
### 5. Bubble Sort Implementation
### 6. Bubble Sort Optimization
### 7. Bubble Sort BIG O Complexity
## 12. Selection Sort
### 1. PREREQUISITES.html
### 2. Selection Sort Introduction
### 2.1 Sorting Slides.html
### 2.2 Visualgo Sorting (Click Selection Sort).html
### 3. Selection Sort Implementation
### 4. Selection Sort Big O Complexity
## 13. Insertion Sort
### 1. PREREQUISITES.html
### 2. Insertion Sort Introduction
### 2.1 Visualgo Sorting (Click Insertion Sort).html
### 2.2 Sorting Slides.html
### 3. Insertion Sort Implementation
### 4. Insertion Sort BIG O Complexity
## 14. Comparing Bubble, Selection, and Insertion Sort
### 1. Comparing Bubble, Selection, and Insertion Sort
### 1.1 Sorting Animations Website.html
## 15. Merge Sort
### 1. PREREQUISITES.html
### 2. Intro to the Crazier Sorts
### 2.1 Slides.html
### 3. Merge Sort Introduction
### 3.1 Visualgo Sorting  (click the merge tab).html
### 4. Merging Arrays Intro
### 5. Merging Arrays Implementation
### 6. Writing Merge Sort Part 1
### 7. Writing Merge Sort Part 2
### 8. Merge Sort BIG O Complexity
### 8.1 Big O Cheat Sheet.html
## 16. Quick Sort
### 1. PREREQUISITES.html
### 2. Introduction to Quick Sort
### 2.1 Slides.html
### 2.2 Visualgo Sorting (Click Quick Sort).html
### 3. Pivot Helper Introduction
### 4. Pivot Helper Implementation
### 5. Quick Sort Implementation
### 6. Quick Sort Call Stack Walkthrough
### 7. Quick Sort Big O Complexity
## 17. Radix Sort
### 1. PREREQUISITES.html
### 2. Radix Sort Introduction
### 2.1 Visualgo Sorting (Click Radix Sort).html
### 2.2 Slides.html
### 3. Radix Sort Helper Methods
### 4. Radix Sort Pseudocode
### 5. Radix Sort Implementation
### 6. Radix Sort BIG O Complexity
## 18. Data Structures Introduction
### 1. Which Data Structure Is The Best
### 2.1 SLIDES.html
### 2.2 MDN JS Class Guide.html
### 4. Data Structures Adding Instance Methods
### 5. Data Structures Adding Class Methods
### 1.1 SLIDES.html
### 2. ES2015 Class Syntax Overview
### 3. Data Structures The Class Keyword
## 19. Singly Linked Lists
### 1. PREREQUISITES.html
### 10. Singly Linked List Unshift Solution
### 11. Singly Linked List Get Intro
### 12. Singly Linked List Get Solution
### 13. Singly Linked List Set Intro
### 14. Singly Linked List Set Solution
### 15. Singly Linked List Insert Intro
### 16. Singly Linked List Insert Solution
### 17. Singly Linked List Remove Intro
### 18. Singly Linked List Remove Solution
### 19. Singly Linked List Reverse Intro
### 2. Intro to Singly Linked Lists
### 2.1 Visualgo - Linked Lists.html
### 2.2 SLIDES.html
### 20. Singly Linked List Reverse Solution
### 21. Singly Linked List BIG O Complexity
### 3. Starter Code and Push Intro
### 4. Singly Linked List Push Solution
### 5. Singly Linked List Pop Intro
### 6. Singly Linked List Pop Solution
### 7. Singly Linked List Shift Intro
### 9. Singly Linked List Unshift Intro
### 8. Singly Linked List Shift Solution

## 20. Doubly Linked Lists
### 1. PREREQUISITES.html
### 10. Unshift
### 11. Unshift Solution
### 12. Get
### 13. Get Solution
### 14. Set
### 15. Set Solution
### 16. Insert
### 17. Insert Solution
### 18. Remove
### 2. Doubly Linked Lists Introduction
### 2.1 Visualgo (Click DLL In Nav).html
### 2.2 SLIDES.html
### 20. Comparing Singly and Doubly Linked Lists
### 21. DLL push - Exercise.html
### 22. DLL unshift  - Exercise.html
### 23. DLL shift - Exercise.html
### 24. DLL set - Exercise.html
### 25. DLL- remove Exercise.html
### 26. DLL pop - Exercise.html
### 27. DLL get - Exercise.html
### 28. Doubly Linked Lists insert  remove - Exercise.html
### 29. DLL reverse - Exercise.html
### 3. Setting Up Our Node Class
### 4. Push
### 5. Push Solution
### 6. Pop
### 7. Pop Solution
### 8. Shift
### 9. Shift Solution
### 19. Remove Solution
## 21. Stacks + Queues
### 1. PREREQUISITES.html
### 2. Intro to Stacks
### 2.1 Stacks Slides.html
### 3. Creating a Stack with an Array
### 4. Writing Our Own Stack From Scratch
### 5. BIG O of Stacks
### 6.1 Queues Slides.html
### 7. Creating Queues Using Arrays
### 8. Writing Our Own Queue From Scratch
### 9. BIG O of Queues
### 6. Intro to Queues
## 22. Binary Search Trees
### 1. PREREQUISITES.html
### 12. Big O of Binary Search Trees
### 2. Introduction to Trees
### 2.1 Trees Slides.html
### 4. Intro to Binary Trees
### 4.1 Visualgo Trees.html
### 5. POP QUIZ!
### 6. Searching A Binary Search Tree
### 7. Our Tree Classes
### 8. BST Insert
### 9. BST Insert Solution
### 3. Uses For Trees
### 10. BST Find
### 11. BST Find Solution
## 23. Tree Traversal
### 1. PREREQUISITES.html
### 10. Depth First InOrder Solution
### 11. When to Use BFS and DFS
### 2. Intro To Tree Traversal
### 2.1 Tree Traversal Slides.html
### 7. Depth First PostOrder Intro
### 8. Depth First PostOrder Solution
### 9. Depth First InOrder Intro
### 3. Breadth First Search Intro
### 4. Breadth First Search Solution
### 5. Depth First PreOrder Intro
### 6. Depth First PreOrder Solution
## 24. Binary Heaps
### 1. PREREQUISITES.html
### 10. Priority Queue Solution
### 11. BIG O of Binary Heaps
### 2. Intro to Heaps
### 2.1 Heaps Slides.html
### 3. Storing Heaps
### 4. Heap Insert Intro
### 4.1 Visualgo Binary Heap.html
### 5. Heap Insert Solution
### 6. Heap ExtractMax Intro
### 7. Heap ExtractMax Solution
### 8. Priority Queue Intro
### 9. Priority Queue Pseudocode
## 25. Hash Tables
### 1. PREREQUISITES.html
### 10. Hash Table Get Solution
### 11. Hash Table Keys and Values
### 12. Hash Table Keys and Values Solution
### 13. Hash Table Big O Complexity
### 2. Intro to Hash Tables
### 2.1 Hash Table Slides.html
### 3. More About Hash Tables
### 4. Intro to Hash Functions
### 5. Writing Our First Hash Function
### 6. Improving Our Hash Function
### 7. Handling Collisions
### 8. Hash Table Set and Get
### 9. Hash Table Set Solution
## 26. Graphs
### 1. PREREQUISITES.html
### 10. Add Edge Intro
### 11. Add Edge Solution
### 12. Remove Edge Intro
### 13. Remove Edge Solution
### 14. Remove Vertex Intro
### 15. Remove Vertex Solution
### 2. Intro to Graphs
### 2.1 Graphs Slides.html
### 3. Uses for Graphs
### 3.1 Music Map Website.html
### 4. Types of Graphs
### 5. Storing Graphs Adjacency Matrix
### 6. Storing Graphs Adjacency List
### 8. Add Vertex Intro
### 9. Add Vertex Solution
### 7. Adjacency Matrix Vs. List BIG O
## 27. Graph Traversal
### 1. PREREQUISITES.html
### 10. BFS Solution
### 2. Intro to Graph Traversal
### 2.1 Graph Traversal Slides.html
### 4. DFS Recursive Intro
### 5. DFS Recursive Solution
### 6. DFS Iterative Intro
### 7. DFS Iterative Solution
### 8. Breadth First Graph Traversal
### 9. BFS Intro
### 3. Depth First Graph Traversal
## 28. Dijkstra's Algorithm!
### 1. PREREQUISITES.html
### 2. Intro to Dijkstra's and Prerequisites
### 2.1 Slides.html
### 3. Who was Dijkstra and what is his Algorithm
### 4. Writing a Weighted Graph
### 5. Walking through the Algorithm
### 6. Introducing Our Simple Priority Queue
### 7. Dijkstra's Pseudo-Code
### 9. Upgrading the Priority Queue
### 8. Implementing Dijkstra's Algorithm
## 29. Dynamic Programming
### 1. Intro to Dynamic Programming
### 1.1 Slides.html
### 2. Overlapping Subproblems
### 4. Writing A Recursive Solution
### 5. Time Complexity of Our Solution
### 7. Enter Memoization!
### 8. Time Complexity of Memoized Solution
### 3. Optimal Substructure
### 6. The Problem With Our Solution
### 9. Tabulation A Bottom Up Approach


## 30. The Wild West
### 1. VERY IMPORTANT NOTE! PLEASE READ!.html
### 10. Divide and Conquer - findRotatedIndex.html
### 11. Bubble Sort.html
### 12. Selection Sort.html
### 13. SLL - remove Exercise.html
### 14. Insertion Sort.html
### 15. Sorting Exercise - merge helper.html
### 16. Merge Sort.html
### 17. Sorting Exercise - pivot helper.html
### 18. Quick Sort.html
### 19. Radix Sort Helper - getDigit.html
### 2. SLL - push Exercise.html
### 20. Radix Sort Helper - digitCount.html
### 21. Radix Sort Helper - mostDigits.html
### 22. Radix Sort.html
### 23. Singly Linked Lists - reverse.html
### 24. Singly Linked Lists - set  get.html
### 25. Singly Linked Lists unshift.html
### 26. Stacks - push Exercise.html
### 27. Stacks - pop Exercise.html
### 28. Stack with 2 Queues.html
### 29. Queues - enqueue Exercise.html
### 3. SLL - pop exercise.html
### 30. Queue with 2 stacks.html
### 31. Queues - dequeue Exercise.html
### 32. Binary Search Tree - insert Exercise.html
### 33. BinarySearchTree - find.html
### 34. Binary Search Tree - DFS Exercise.html
### 35. Binary Search Tree - BFS Exercise.html
### 36. Binary Search Tree - remove Exercise.html
### 37. Binary Search Tree Exercise - Find 2nd largest node.html
### 38. Binary Search Tree Exercise - Check if balanced.html
### 39. BinaryHeap - insert Exercise.html
### 4. SLL - get Exercise.html
### 40. BinaryHeap - extractMax Exercise.html
### 41. Binary Heaps - maxHeapify Exercise.html
### 42. Heap Sort Exercise.html
### 43. Priority Queue Exercise.html
### 44. Hash Table - set  get Exercise.html
### 45. Hash Table - keys  values Exercise.html
### 46. Graphs Exercise - addVertex.html
### 47. Graphs Exercise - removeEdge.html
### 48. Graphs Exercise - removeVertex.html
### 49. Graphs - DFS Exercise.html
### 5. SLL -  insert Exercise.html
### 50. Graphs Exercise - addEdge.html
### 51. Graphs - BFS Exercise.html
### 52. Graphs Exercise - Determine if there is a cycle.html
### 53. Graphs - Dijkstra Exercise.html
### 54. Dynamic Programming - Coin Change.html
### 55. Coin Change - Greedy Algorithm.html
### 56. Frequency Counter - constructNote.html
### 57. Frequency Counter - findAllDuplicates.html
### 58. Frequency Counter  Multiple Pointer - findPair.html
### 59. Trie Exercise - addWord.html
### 6. SLL - Rotate Exercise.html
### 60. Trie Exercise - removeWord.html
### 61. Trie Exercise - findWord.html
### 62. Trie Exercise - getWords.html
### 63. Trie - autocomplete.html
### 7. SLL - set Exercise.html
### 8. Divide and Conquer - countZeroes.html
### 9. Divide and Conquer - sortedFrequency.html


======== list file ========

Process finished with exit code 0