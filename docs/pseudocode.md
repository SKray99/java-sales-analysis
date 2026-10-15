# Pseudocode: Sales Analysis

START


    // 1. Set up the lists from the data.
    months = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]
    salesChange = [12, -8, 15, 18, -22, 10, 14, -5, 20, 8, -25, 6]
    
    // 2. Set up our variables.
    // Starts at negative infinity so there aren’t any errors if all the numbers are negative.
    maxCombinedSales = NEGATIVE_INFINITY
    bestStartIdx = 0
    bestEndIdx = 0
    
    // 3. Loops through each month to test each starting month.
    FOR EACH startIdx FROM 0 TO the end of the sales list DO
        
        currentSum = 0
        
        // 4. From the given starting month, it checks the consecutive months.
        FOR EACH endIdx FROM startIdx TO the end of the sales list DO
            
            // Add current month sales to the running total.
            currentSum = currentSum + salesChange[endIdx]
            
            // 5. If the new total is better than the previous. 
            IF currentSum > maxCombinedSales THEN

                // Saves the new total and period
                maxCombinedSales = currentSum
                bestStartIdx = startIdx
                bestEndIdx = endIdx
                
            END IF
            
        END FOR
        
    END FOR
    
    // 6. Print all the information wanted.
    PRINT "Maximum Combined Sales Change: " + maxCombinedSales
    PRINT "Starting Month: " + months[bestStartIdx]
    PRINT "Ending Month: " + months[bestEndIdx]

END
