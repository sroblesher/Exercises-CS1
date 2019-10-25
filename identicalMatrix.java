public class identicalMatrix{
  public static void main(String[] args) {

    int[][] array1 = {{4,16,10,12},{7,5,3,9},{10,8,1,2},{10,18,15,11},{6,2,1,4}};

    int[][] array2 = {{4,16,10,12},{7,5,3,9},{10,8,1,2},{10,18,15,11},{6,2,1,4}};

    boolean result = identical(array1, array2);

    System.out.println(result);

  }

  public static boolean identical(int[][]a, int[][]b)
  {
    if (a.length != b.length)
      return false;

    for (int i = 0; i < a.length ;i++)
    {
      if (a[i].length != b[i].length)
        return false;
    }

    for (int i = 0; i < a.length; i++)
    {
      for (int j = 0; j < a[i].length; j++)
      {
        if (a[i][j] != b[i][j])
          return false;
      }
    }

    return true;
  }
}
