public class Searching {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int num_to_find = 20;
        System.out.println(BinarySearchRecursive(numbers, num_to_find, 0, numbers.length - 1));
    }

    // returns the index if the target was found, else -1
    public static int BinarySearchRecursive(int[] inputData, int target_number, int start, int end) {

        while(start <= end) {
            int mid = (start + end) /2;

            // found the target
            if (target_number == inputData[mid]) {
                System.out.printf("Index of %d is %d%n", target_number, mid);
                return mid;
            }
            if (target_number < inputData[mid]) {
                return BinarySearchRecursive(inputData, target_number, start, mid -1);
            }
            else {
                return BinarySearchRecursive(inputData, target_number, mid + 1, end);
            }

        }
        System.out.printf("The target number %d is not in the given data set.", target_number);
        return -1;
    }
}
