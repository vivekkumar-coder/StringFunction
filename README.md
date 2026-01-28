# Java String Methods Example
This project demonstrates the use of **commonly used String methods in Java**.  
It is designed for beginners to understand how Java strings work and how different built-in methods behave.

## Topics Covered

The program explains and demonstrates the following `String` methods:

- length()
- toUpperCase()
- toLowerCase()
- trim()
- substring()
- replace()
- startsWith()
- endsWith()
- charAt()
- indexOf()
- lastIndexOf()
- equals()
- == (reference comparison)
- equalsIgnoreCase()
- compareTo()

---

## Key Concepts

### String Length
Returns the number of characters in a string.

### Case Conversion
- toUpperCase() → converts string to uppercase
- toLowerCase() → converts string to lowercase

### Trimming
trim() removes leading and trailing whitespace.

### Substring
Extracts a portion of a string using index positions.

### Replace
Replaces characters or substrings with new values.

### Searching
- indexOf() → first occurrence
- lastIndexOf() → last occurrence
- Returns -1 if not found

### Comparison
- equals() → compares content
- == → compares memory reference
- equalsIgnoreCase() → ignores case
- compareTo() → dictionary (lexicographical) comparison


## Example Code

---java
String str = "Welcome";
System.out.println(str.length());
System.out.println(str.toUpperCase());

