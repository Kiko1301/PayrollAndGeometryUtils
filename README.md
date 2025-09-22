# PayrollAndGeometryUtils 🧮📐

A Java utility repository for payroll calculations and triangle validation. Includes SalaryCalculator for computing salaries with overtime, night, and holiday pay, and TriangleValidator for checking and classifying triangles. Contributed by Kristijan Jordanovski.

---

## Features ✨

### SalaryCalculator

- Computes base salary, overtime (35%), night (35%), and holiday (250%) pay.
- Validates inputs to ensure non-negative values.
- Displays a detailed salary breakdown.

### TriangleValidator

- Validates triangle existence using the triangle inequality theorem.
- Classifies triangles as right, acute, or obtuse.
- Ensures robust input handling for side lengths.

---

## Requirements 🛠️

- Java Development Kit (JDK) 8 or higher.
- Command-line interface or IDE (e.g., IntelliJ, Eclipse).

---

## Installation 🔧

- Clone the repository:git clone https://github.com/<your-username>/PayrollAndGeometryUtils.git
- Navigate to the project directory:cd PayrollAndGeometryUtils
- Compile and run either program:
    ```bash 
  SalaryCalculator:javac triangle/SalaryCalculator.java
  java triangle.SalaryCalculator
  TriangleValidator:javac triangle/TriangleValidator.java
  java triangle.TriangleValidator

---

## Usage 🚀

### SalaryCalculator

- Enter base salary, total hours, night hours, and holiday hours.
- View a formatted salary breakdown.
- Example:Enter base monthly salary: 1000
- Enter total hours worked: 50
- Enter total night hours worked: 10
- Enter total holiday hours worked: 5

### Salary Breakdown:

- Base Salary: $1000.00
- Overtime Pay: $87.50
- Night Pay: $87.50
- Holiday Pay: $312.50
- Total Salary: $1487.50

###TriangleValidator

- Enter three side lengths.
- Get validation and classification (right, acute, or obtuse).
- Example:Enter side A: 3
- Enter side B: 4
- Enter side C: 5
- A triangle exists with the given sides.
    -It is a right triangle.

---

## Future Improvements 🔮

- Add tax calculations to SalaryCalculator.
- Support multiple employee processing.
- Export results to files.
- Add area and perimeter calculations for triangles.

---

## Contributing 🤝
Fork the repository, make changes, and submit a pull request. Contributions are welcome!

---

## License 📜
This project is open source under the MIT License.

