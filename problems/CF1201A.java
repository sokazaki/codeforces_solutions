import java.util.Scanner;


public class Main {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();
    int arr[][] = new int[m][5];

    for(int i=0; i<n; i++) {
      String str = s.next();
      for(int j=0; j<m; j++) {
        int ch = str.charAt(j)-'A';
        arr[j][ch] += 1;
      }
    }

    int points[] = new int[m];
    for(int j=0; j<m; j++) points[j] = s.nextInt();

    int res = 0;
    for(int j=0; j<m; j++) {
      int max = arr[j][0];
      for(int k=0; k<5; k++) {
        max = Math.max(max, arr[j][k]);
      }
      res = res + max*points[j];
    }
    System.out.println(res);
  }
}
