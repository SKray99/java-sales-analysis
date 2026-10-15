# Pseudocode: Sales Analysis

START

    months = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]
    salesChange = [12, -8, 15, 18, -22, 10, 14, -5, 20, 8, -25, 6]
    
    maxCombinedSales = NEGATIVE_INFINITY
    bestStartIdx = 0
    bestEndIdx = 0
    
    FOR EACH startIdx FROM 0 TO the end of the sales list DO
        
        currentSum = 0
        
        FOR EACH endIdx FROM startIdx TO the end of the sales list DO
            
            currentSum = currentSum + salesChange[endIdx]
            
            IF currentSum > maxCombinedSales THEN

                maxCombinedSales = currentSum
                bestStartIdx = startIdx
                bestEndIdx = endIdx
                
            END IF
            
        END FOR
        
    END FOR
    
    PRINT "Maximum Combined Sales Change: " + maxCombinedSales
    PRINT "Starting Month: " + months[bestStartIdx]
    PRINT "Ending Month: " + months[bestEndIdx]

END
