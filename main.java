class SalesData {
    int dayOfYear;
    double totalSales;
    int numberOfTransactions;

    public SalesData(int dayOfYear, double totalSales, int numberOfTransactions) {
        this.dayOfYear = dayOfYear;
        this.totalSales = totalSales;
        this.numberOfTransactions = numberOfTransactions;
    }

    @Override
    public String toString() {
        return "Day of year: " + dayOfYear + ", Total sales ($): " + totalSales + ", Number of Transactions: "
                + numberOfTransactions + " transactions";
    }
}

class MergeSort {
    public void merge(SalesData[] salesData, int lowerBound, int mid, int upperBound) {
        // Lest sub array size
        int leftSize = mid - lowerBound + 1;
        // Right sub array size
        int rightSize = upperBound - mid;

        // Divide
        SalesData[] leftSubArray = new SalesData[leftSize];
        SalesData[] rightSubArray = new SalesData[rightSize];

        //
        for (int i = 0; i < leftSize; ++i)
            leftSubArray[i] = salesData[lowerBound + i];
        for (int j = 0; j < rightSize; ++j)
            rightSubArray[j] = salesData[mid + 1 + j];

        int i = 0, j = 0, k = lowerBound;

        while (i < leftSize && j < rightSize) {
            if (leftSubArray[i].totalSales <= rightSubArray[j].totalSales) {
                salesData[k] = leftSubArray[i];
                i++;
            } else {
                salesData[k] = rightSubArray[j];
                j++;
            }
            k++;
        }

        // for left overs in the left array
        while (i < leftSize) {
            salesData[k] = leftSubArray[i];
            i++;
            k++;
        }

        // for left overs in the right array
        while (j < rightSize) {
            salesData[k] = rightSubArray[j];
            j++;
            k++;
        }
    }

    public void sort(SalesData[] array, int lowerBound, int upperBound) {
        // Start explanation
        if (lowerBound < upperBound) {
            int mid = (lowerBound + upperBound) / 2;
            sort(array, lowerBound, mid);
            sort(array, mid + 1, upperBound);
            merge(array, lowerBound, mid, upperBound);
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        SalesData[] sales = {
                new SalesData(1, 200.00, 50),
                new SalesData(2, 150.00, 40),
                new SalesData(3, 250.00, 45),
                new SalesData(4, 300.00, 30)
        };

        // Print unsorted sales data
        System.out.println("┌──────────────────────────────────────┐");
        System.out.println("│     Unsorted Sales Data              │");
        System.out.println("└──────────────────────────────────────┘");
        for (SalesData sd : sales) {
            System.out.println(sd);
        }

        // Sorting the sales data
        MergeSort sorter = new MergeSort();
        sorter.sort(sales, 0, sales.length - 1);

        // Print sorted sales data
        System.out.println("┌──────────────────────────────────────┐");
        System.out.println("│     Sorted Sales Data (by Total)     │");
        System.out.println("└──────────────────────────────────────┘");
        for (SalesData sd : sales) {
            System.out.println(sd);
        }
    }
}
