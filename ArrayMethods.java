public class ArrayMethods{
  public static int rowSum(int[][] ary, int x){
    int var = 0;
    int[] newarr = ary[x];
    for (int y = 0; y < newarr.length;y++){
      var += newarr[y];
    }
    return var;
  }

  public static int columnSum(int[][] ary, int x){
    int var = 0;
    for(int y = 0; y < ary.length;y++){
      if (x < ary[y].length){
        var += ary[y][x];
      }
    }
    return var;
  }
  public static int[] allRowSums(int[][] ary){
    int[] arr = new int[ary.length];
    for (int x = 0; x < ary.length;x++){
      arr[x] = rowSum(ary, x);
    }
    return arr;
  }

  public static int[] allColSums(int[][] ary){
    int count = 0;
    for (int x = 0; x < ary.length;x++){
      if (ary[x].length > count){
        count = ary[x].length;
      }
    }
    int[] arr = new int[count];
    for (int x = 0; x < count;x++){
      arr[x] = columnSum(ary, x);
    }
    return arr;
  }

  public static boolean isRowMagic(int[][] ary){
    boolean diff = true;
    int[] arr = allRowSums(ary);
    for (int x = 0; x < arr.length - 1; x++){
      if (arr[x] != arr[x + 1]){
        diff = false;
      }
    }
    return diff;
  }

  public static boolean isColumnMagic(int[][] ary){
    boolean diff = true;
    int[] arr = allColSums(ary);
    for (int x= 0; x < ary.length - 1;x++){
      if (arr[x] != arr[x + 1]){
        diff = false;
      }
    }
    return diff;
  }
   //checks if the array is column-magic (this means that every column has the same column sum).


}
