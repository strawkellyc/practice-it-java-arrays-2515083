import java.util.Arrays;

public class App {

  /* public static Object[] rotateRight(Object[] arr) {
    Object current = 0;
    for (int i = arr.length -1; i > 0 && i <= arr.length - 1; i--) {
      current = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = current;

    }

    return arr; 
    */

    public static Object[] rotateRight(Object[] arr) {
      if (arr == null) {
        return null;
      }
      
      Object[] result = new Object[arr.length];
      // Result[] -> {null, null, null, null, null}
      for (int i = 0; i < arr.length; i++) {
        // arr[] -> {1, 2, 3, 4, 5}
        
        // failure
        // result[] -> {null, 1, 2, 3, 4} 
        // result[i + 1] = arr[i];   --> to prevent invalid index, this is not how it works
        
        // success
        // result[] -> {5, 1, 2, 3, 4}
        result[(i+1) % result.length] = arr[i];

      }
      return result;
  }

  public static void main(String args[]) {
    Object[] arr = new Integer[] { 1, 2, 3, 4, 5 };

    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));

    Object[] arr2 = new String[] { "Hello", "there", "my friend" };

    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}