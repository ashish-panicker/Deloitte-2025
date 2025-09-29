public class Arrays {
    public static void main(String[] args) {
        // Arrays: Collection of elements of same data type
        // Declare an array: dataType[] arrayName;
        // [] indicates that it's an array
        int[] numbers;
        // To initialize an array: arrayName = new dataType[size];
        numbers = new int[5]; // Array of size 5, can hold 5 integers
        // You can also declare and initialize in one line
        int[] moreNumbers = new int[3]; // Array of size 3
        // When an array is created, all elements are initialized to default value of
        // the data type
        // For int, default is 0; for double, default is 0.0
        System.out.println("Default values in numbers array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]); // Prints 0 five times
        }

        // String[] names = new String[4]; // Array of size 4 for Strings
        // Default value for String is null
        String[] names = new String[4];
        System.out.println("Default values in names array:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]); // Prints null four times
        }

        // size of the array can be obtained using length property
        System.out.println("Size of numbers array: " + numbers.length); // 5
        // access the array, we can use index
        // index starts from 0 to size-1
        numbers[0] = 10; // Assigning value to first element
        numbers[1] = 20; // Assigning value to second element
        System.out.println("First element: " + numbers[0]); // 10
        System.out.println("Second element: " + numbers[1]); // 20
        // Enhanced for loop to iterate through array
        System.out.println("Iterating through numbers array:");
        for (int num : numbers) {
            System.out.println(num); // Prints all elements in numbers array
        }

        // Array of Strings
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        System.out.println("Iterating through names array:");
        for (String name : names) {
            System.out.println(name); // Prints all elements in names array
        }

        // Declare an array with values
        int[] primes = { 2, 3, 5, 7, 11 };
        System.out.println("Primes array: Length = " + primes.length);
        for (int prime : primes) {
            System.out.print(prime + " "); // Prints all prime numbers
        }
        System.out.println();

        // Multi-dimensional arrays
        int[][] matrix = new int[2][3]; // 2 rows, 3 columns
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) { // Iterate
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // While declatring multi-dimensional arrays, inner arrays can have different sizes
        int[][] jaggedArray = { {1, 2}, {3, 4, 5}, {6} };
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}