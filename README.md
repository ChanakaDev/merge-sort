# Sorting "Sales Data" Using "Merge Sort"

## Overview
This project implements a simple system to manage and sort sales records. The main components include a `SalesData` class to store individual sales records and a `MergeSort` class to sort these records based on the total sales amount using the Merge Sort algorithm.

## Features
- **SalesData Class**: Stores information about each sales record, including the day of the year, total sales amount, and number of transactions.
- **MergeSort Class**: Implements the Merge Sort algorithm to sort an array of `SalesData` objects based on their total sales amount.

## Components

### SalesData Class
The `SalesData` class is designed to store individual sales records. Each record includes:
- `dayOfYear`: The day of the year the sales were recorded.
- `totalSales`: The total sales amount for that day.
- `numberOfTransactions`: The number of transactions that occurred on that day.

### MergeSort Class
The `MergeSort` class provides the functionality to sort an array of `SalesData` objects using the Merge Sort algorithm. It includes methods for merging and sorting the data.

#### Merge Method
The `merge` method combines two subarrays into a single sorted array.

#### Sort Method
The `sort` method recursively divides the array into smaller subarrays and sorts them using the `merge` method.

## How to Use
1. **Compile the Code**: Ensure you have Java installed on your system. Compile the code using `javac`.
   ```sh
   javac SalesData.java MergeSort.java
   ```

2. Run the Program: Execute the compiled Java program.

3. Output: The program will print the unsorted and sorted sales data to the console.

```
┌──────────────────────────────────────┐
│   Unsorted Sales Data                │
└──────────────────────────────────────┘
Day of year: 1, Total sales ($): 200.0, Number of Transactions: 50 transactions
Day of year: 2, Total sales ($): 150.0, Number of Transactions: 40 transactions
Day of year: 3, Total sales ($): 250.0, Number of Transactions: 45 transactions
Day of year: 4, Total sales ($): 300.0, Number of Transactions: 30 transactions

┌──────────────────────────────────────┐
│   Sorted Sales Data (by Total)       │
└──────────────────────────────────────┘
Day of year: 2, Total sales ($): 150.0, Number of Transactions: 40 transactions
Day of year: 1, Total sales ($): 200.0, Number of Transactions: 50 transactions
Day of year: 3, Total sales ($): 250.0, Number of Transactions: 45 transactions
Day of year: 4, Total sales ($): 300.0, Number of Transactions: 30 transactions
```

## Conclusion
This project provides a clear and concise implementation of managing and sorting sales data using the Merge Sort algorithm. The SalesData class encapsulates the sales records, and the MergeSort class efficiently sorts the data, demonstrating the power and elegance of the Merge Sort algorithm in handling real-world data.