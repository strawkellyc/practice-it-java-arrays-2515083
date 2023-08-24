public class App {

  public static void printTriangle(Object[] arr) {
     
    for (int i = 0; i < arr.length; i++) {
      //if (arr.length < 1) {  --> meaningless, coz if arr.length is 0, can't 
      //  System.out.println();  --> get through the for loop
     // } 
        if (arr.length <= 1 + i) 
        {for (int j = 0; j <= i; j++) {
          for (int x = 0; x < 1 + j; x++) {
            System.out.print(arr[x]);
          }
          System.out.println();
        }
        

        
        }}
      System.out.println();
    }


    // {A, B, C}
    // A
    // AB
    // ABC
/* 
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col <= row; col++) {
        System.out.print(arr[col]);  
        }
        System.out.println();
      }
      System.out.println();
    }
*/
  

  // System.out.println(arr);

  public static void main(String args[]) {
    printTriangle(new Integer[] { 1, 2, 3, 4 });
    printTriangle(new Character[] { 'A', 'B', 'C', 'D', 'E' });
    printTriangle(new String[] {});
    printTriangle(new String[] { "Hello" });
    printTriangle(new String[] { "Hello", "There", "Friend" });
  }
}