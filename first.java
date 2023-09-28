import java.util.Scanner;

public class first {
  public static void main(String args[]) {
    System.out.println("Hello world");
    // This is a simple Hello world program
  }
}

class Array2D {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1 to add two matrices ");
    System.out.println("Enter 2 to subtract two matrices ");
    System.out.println("Enter 3 to Transpose the matrix");
    System.out.println("Enter your choice");
    int choice = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.println("Enter the number of rows");
        int m = sc.nextInt();
        System.out.println("Enter the number of column");
        int n = sc.nextInt();
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        System.out.println("Enter the terms of the first array");
        for (int i = 0; i < m; i++) {
          for (int j = 0; j < n; j++) {
            arr1[i][j] = sc.nextInt();
          }
        }
        System.out.println("Enter the terms of the second array");
        for (int i = 0; i < m; i++) {
          for (int j = 0; j < n; j++) {
            arr2[i][j] = sc.nextInt();
          }
        }
        System.out.println("The elements of the 1st array: ");
        for (int i = 0; i < m; i++) {
          for (int j = 0; j < n; j++) {
            System.out.print(arr1[i][j] + "  ");
          }
          System.out.println();
        }
        System.out.println("The elements of the 2nd array: ");
        for (int i = 0; i < m; i++) {
          for (int j = 0; j < n; j++) {
            System.out.print(arr2[i][j] + "  ");
          }
          System.out.println();
        }
        addition2D(arr1, arr2);
        break;
      case 2:
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of column");
        int col = sc.nextInt();
        int[][] arr3 = new int[row][col];
        int[][] arr4 = new int[row][col];
        System.out.println("Enter the terms of the first array");
        for (int i = 0; i < row; i++) {
          for (int j = 0; j < col; j++) {
            arr3[i][j] = sc.nextInt();
          }
        }
        System.out.println("Enter the terms of the second array");
        for (int i = 0; i < row; i++) {
          for (int j = 0; j < col; j++) {
            arr4[i][j] = sc.nextInt();
          }
        }
        System.out.println("The elements of the 1st array: ");
        for (int i = 0; i < row; i++) {
          for (int j = 0; j < col; j++) {
            System.out.print(arr3[i][j] + "  ");
          }
          System.out.println();
        }
        System.out.println("The elements of the 2nd array: ");
        for (int i = 0; i < row; i++) {
          for (int j = 0; j < col; j++) {
            System.out.print(arr4[i][j] + "  ");
          }
          System.out.println();
        }
        subtract2D(arr3, arr4);
        break;
      case 3:
        System.out.println("Enter the number of rows");
        int l = sc.nextInt();
        System.out.println("Enter the number of columns");
        int k = sc.nextInt();
        int[][] trans = new int[l][k];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < l; i++) {
          for (int j = 0; j < k; j++) {
            trans[i][j] = sc.nextInt();
          }
        }
        System.out.println("The actual array is :");
        for (int i = 0; i < trans.length; i++) {
          for (int j = 0; j < trans[0].length; j++) {
            System.out.print(trans[i][j] + " ");
          }
          System.out.println();
        }
        System.out.println("The transposed array is: ");
        arrayTranspose(trans);
        break;

      default:
        System.out.println("You have entered the wrong input");
    }
  }

  public static void addition2D(int[][] arr1, int[][] arr2) {
    int length1 = arr1.length;
    int length2 = arr2.length;
    int[][] sum = new int[length1][length2];

    for (int i = 0; i < length1; i++) {
      for (int j = 0; j < length2; j++) {
        sum[i][j] = arr1[i][j] + arr2[i][j];
      }
    }
    System.out.println("The sum of the two array: ");
    for (int i = 0; i < length1; i++) {
      for (int j = 0; j < length2; j++) {
        System.out.print(sum[i][j] + "  ");
      }
      System.out.println();
    }
  }

  public static void subtract2D(int[][] arr1, int[][] arr2) {
    int length1 = arr1.length;
    int length2 = arr2.length;
    int[][] sub = new int[length1][length2];

    for (int i = 0; i < length1; i++) {
      for (int j = 0; j < length2; j++) {
        sub[i][j] = arr1[i][j] - arr2[i][j];
      }
    }
    System.out.println("The sum of the two array: ");
    for (int i = 0; i < length1; i++) {
      for (int j = 0; j < length2; j++) {
        System.out.print(sub[i][j] + "  ");
      }
      System.out.println();
    }
  }

  public static void arrayTranspose(int[][] arr) {
    int[][] transposedMatrix = new int[arr.length][arr[0].length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        transposedMatrix[i][j] = arr[j][i];
      }
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(transposedMatrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}