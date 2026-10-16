# Test Plan: Sales Analysis

## My Test Runs

### Test 1: Normal 12 Months
*   **Numbers given:** `[12, -8, 15, 18, -22, 10, 14, -5, 20, 8, -25, 6]`
*   **Expected:** Start in January, end in October, total should be 62 million.
*   **Actual:** Printed out January to October, total was 62 million.
*   **Result:** Pass!

### Test 2: Just One Good Month
*   **Numbers given:** `[-10, -5, 20, -5, -10]`
*   **Expected:** Only March stands out, so it should pick just March for 20 million
*   **Actual:** Skipped the negative months and picked March.
*   **Result:** Pass!

### Test 3: All Negative Numbers
*   **Numbers given:** `[-8, -3, -12, -5]`
*   **Expected:** February has the highest (least negative) value, so it should pick February (-3).
*   **Actual:** Picked February. Didn't include zero or anything off.
*   **Result:** Pass!

### Test 4: Best Months at the Start
*   **Numbers given:** `[50, 20, -10, -5]`
*   **Expected:** It should use January to February, totaling 70 million.
*   **Actual:** It chose the first two months as expected.
*   **Result:** Pass!

### Test 5: Best Months at the End
*   **Numbers given:** `[-10, -5, 15, 40]`
*   **Expected:** Should go from March to April, for a 55 million total.
*   **Actual:** It picked the expected result.
*   **Result:** Pass!

### Test 6: Testing a Tie
*   **Numbers given:** `[15, -20, 15]`
*   **Expected:** January and March both hit 15, but it should keep the first one (January).
*   **Actual:** Used the `>` check and kept January, skipped the tie in March.
*   **Result:** Pass!
