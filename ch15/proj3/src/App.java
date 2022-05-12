public class App {

  public long factorial(int n) {
    if (n == 0 || n == 1) /* base case */ {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

  public long power(int x, int n) {
    if (n == 0) /* base case */ {
      return 1;
    } else {
      return x * power(x, n - 1);
    }
  }

  public long fibonacci(int x) {
    if ((x == 0) || (x == 1)) {
      return x;// base case
    } else {
      return (fibonacci(x - 1) + fibonacci(x - 2)); // recursive call
    }
  }

  public int linearSearch(int[] arr, int target, int currIndex) {
    if ((currIndex < 0) || (currIndex >= arr.length)) {
      return -1; // base case no match in the array
    } else if (arr[currIndex] == target) {
      return currIndex; // base case return location of match in the array
    } else {
      return linearSearch(arr, target, currIndex + 1); // recursive call
    }
  }

  public int binarySearch(int[] arr, int target, int startIndex, int endIndex) {
    if (startIndex > endIndex) {
      return -1; // base case the value is NOT in the array
    } else {
      int midpoint = (startIndex + endIndex) / 2;
      if (target == arr[midpoint]) {
        return midpoint; // base case found the target at midpoint location
      } else if (target > arr[midpoint]) {
        return binarySearch(arr, target, midpoint + 1, endIndex);// go to the higher indices
      } else {
        return binarySearch(arr, target, startIndex, midpoint - 1);// go to the lower indices
      }
    }
  }

  public static void main(String[] args) throws Exception {

    App app = new App();

    // long result = app.factorial(30);
    // long result = app.power(3, 4);
    // long result = app.fibonacci(7);
    int[] scores = { 65, 87, 34, 90, 78, 99, 25 };
    // int result = app.linearSearch(scores, 19, 0);
    // sorted list
    int result = app.binarySearch(scores, 99, 0, scores.length - 1);
    System.out.println(result);
  }
}
