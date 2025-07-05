# String Calculator TDD Kata

This project is a solution to the classic String Calculator TDD Kata, implemented using Java and JUnit as part of a Test-Driven Development (TDD) exercise.

---

## 📌 Problem Statement

Implement a method with the following signature:

```java
int add(String numbers)
```

This method takes a string of comma-separated numbers and returns their sum.

## ✔ Supported Features

- Returns `0` for an empty string
- Returns the number itself if only one number is provided
- Handles two or more comma-separated numbers
- Supports newline characters (`\n`) as valid delimiters along with commas
- Supports custom single-character delimiters using the `//[delimiter]\n` syntax
- Throws an exception when negative numbers are passed, listing all negative numbers in the error message

## 🧪 Test-Driven Development (TDD)

This solution was developed using strict TDD practices:

1. **Write a failing test** ❌
2. **Make the test pass** ✅
3. **Refactor** 🔄
4. **Repeat** 🔁

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6 or higher
- IDE (IntelliJ IDEA, Eclipse, VS Code)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/aayushaghera/Incubyte_task.git
   cd stringcalculator
   ```

2. Build the project:
   ```bash
   mvn clean compile
   ```

## 🧾 How to Run Tests

### Using Maven:
```bash
mvn test
```

### Using IDE:
- Right-click the test class and choose "Run All Tests"
- Or use the keyboard shortcut (Ctrl+Shift+F10 in IntelliJ)

## 📸 Screenshots

### ✅ All Test Cases Passed

![Screenshot 2025-07-05 155453](https://github.com/user-attachments/assets/ea43c0d9-cd73-44e8-b2d1-c552eddb2897)

## 🧪 Test Cases Covered

1. **Empty String Test** - Returns 0 for empty input
2. **Single Number Test** - Returns the number itself
3. **Two Numbers Test** - Sums two comma-separated numbers
4. **Multiple Numbers Test** - Sums multiple comma-separated numbers
5. **Newline Delimiter Test** - Handles newline as delimiter
6. **Custom Delimiter Test** - Supports custom single-character delimiters
7. **Negative Numbers Test** - Throws exception for negative numbers
8. **Multiple Negative Numbers Test** - Lists all negative numbers in exception

## 🛠️ Tech Stack

- **Java 17** - Programming language
- **JUnit 5** - Testing framework
- **Maven** - Build tool and dependency management
- **IntelliJ IDEA** - IDE (optional)

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
