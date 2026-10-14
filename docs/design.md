# Project Design: Sales Analysis

## Problem Description
*   **Problem Being Solved:** The program looks through the given dataset over the year and finds a continuous sequence of months that had the most sales growth.
*   **Data Received:** The program receives a 12-month dataset with the sales change (in millions USD) for each month.
*   **Produced Results:** The Program will print out the highest total sales change in the dataset in a given time frame (month to month).

## Data Design
*   **How month names will be stored:** The months will be stored in an array of Strings. Each month will be given its shorthand name (Jan - Feb).
*   **How sales values will be stored:** The sales values will be stored in an array of doubles (12 numbers total).
*   **Connecting a month to sales value:** Both of their arrays will share the same index. Therefore, index 0 will be January & January sales value.
*   **Variables used to track totals:** 
    *   `maxCombinedSales` (`double`): Holds the highest total sum found so far.
    *   `currentSum` (`double`): Keeps a running total as we add up the months in a specific timeframe/period.
*   **Remembering the best starting and ending points:** The code will use two integer variables (`bestStartIdx` and `bestEndIdx`) to save the best period in the index.
*   **Handling Ties:** The code will use a “greater than” sign (`>`). If another period has the same total as the first one, then the program will skip it and keep the original.

## Program Organization
*   **`main` method**: The starting point of the program. It sets up the data arrays, calls our helper methods, and prints out the final report.
*   **`findBestSalesPeriod` method**: This does the main work. It’ll use two loops (nested loops) to look through every combination of months to find the best one.
*   **`printReport` method**: This takes the final results and prints them to the screen.

## Program Flow
Start ➔ Create Arrays ➔ Examine Consecutive Periods ➔ Calculate Totals ➔ Compare Results ➔ Store Best Period ➔ Display Results ➔ End

