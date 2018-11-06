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
      //Returns an array with the column sum of each column of ary.
      //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)
      //Index i of the return array contains the sum of elements in column i, ignoring any rows that are too short.
      //The length of the returned array should be the length of the LONGEST array in ary.

}
