public class exercise1022{
  public static void main(String[] args) {

    /*Arrays review 3*/
    int[] arr1 = new int[4];
    int n = arr1.length;

    /*Arrays review 4*/
    int[] arr2 = {6,14,2,9};
    int m = arr2.length;

    /*Arrays review 3*/
    int[][] arr3 = new int[5][4];

    /*Array review 4*/
    int[][] arr4 = {{3,5,9,10},{11,2,3,7},{9,4,5,4},{22,1,7,7},{2,3,5,12}};

    /*Spooky Array Exercises 1*/
    String[] spooky1 = {"a", "b","spOoky"};

    int exists1 = 0;

    for (int i = 0; i < spooky1.length; i++)
    {
          if (spooky1[i].equalsIgnoreCase("spooky"))
            exists1++;
    }
    System.out.println(((exists1 > 0)? "Spooky" : "Normal") + " array");

    /*Spooky Array Exercises 2*/
    String[][] spooky2 =
    {
      {"array"},
      {"spook", "halo", "albert"},
      {"SpoOky","exercise"},{"psoo", "a", "sdf"}
    };

    int exists2 = 0;

    for (int i = 0; i < spooky2.length; i++)
    {
      for (int j = 0; j < spooky2[i].length; j++)
      {
        if (spooky2[i][j].equalsIgnoreCase("spooky"))
          {
            exists2++;
            System.out.println("Spooky array on row " + i);
          }
      }
    }

    if (exists2 == 0)
      System.out.println("Normal array");
  }
}
