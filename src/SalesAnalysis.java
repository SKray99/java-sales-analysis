public class SalesAnalysis {

    public static void main(String[] args) {

        String[] months = {
                "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        double[] salesChange = {
                12, -8, 15, 18, -22, 10,
                14, -5, 20, 8, -25, 6
        };

        int[] bestPositions = findBestSalesPeriod(salesChange);
        int bestStartIdx = bestPositions[0];
        int bestEndIdx = bestPositions[1];

        double maxSales = calculatePeriodTotal(salesChange, bestStartIdx, bestEndIdx);

        printReport(months, bestStartIdx, bestEndIdx, maxSales);
    }

    public static int[] findBestSalesPeriod(double[] salesChange) {
        double maxCombinedSales = Double.NEGATIVE_INFINITY;
        int bestStartIdx = 0;
        int bestEndIdx = 0;

        for (int start = 0; start < salesChange.length; start++) {
            double currentSum = 0;
            
            for (int end = start; end < salesChange.length; end++) {
                currentSum += salesChange[end];
                
                if (currentSum > maxCombinedSales) {
                    maxCombinedSales = currentSum;
                    bestStartIdx = start;
                    bestEndIdx = end;
                }
            }
        }
        return new int[]{bestStartIdx, bestEndIdx};
    }

    public static double calculatePeriodTotal(double[] salesChange, int start, int end) {
        double total = 0;
        for (int i = start; i <= end; i++) {
            total += salesChange[i];
        }
        return total;
    }

    public static void printReport(String[] months, int startIdx, int endIdx, double totalChange) {
        System.out.println("Sales Analysis");
        System.out.println("--------------------");
        System.out.println("Start Month: " + months[startIdx]);
        System.out.println("End Month: " + months[endIdx]);
        
        if (totalChange == (long) totalChange) {
            System.out.println("Total Sales Change: " + (long) totalChange + " million");
        } else {
            System.out.println("Total Sales Change: " + totalChange + " million");
        }
    }
}
