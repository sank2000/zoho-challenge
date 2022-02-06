public class Program1 {

  public static boolean isExists(int arr[], int num) {
    for (int val : arr) {
      if (val == num) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {

    int arr1[] = { 0, 5 };
    int arr2[] = { 1, 2, 34 };

    int output[] = new int[arr1.length + arr2.length];

    int i = 0, j = 0;
    int k = 0;

    for (int n = 0; n < output.length; n++) {
      output[n] = -1;
    }

    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] < arr2[j]) {
        if (!isExists(output, arr1[i]))
          output[k++] = arr1[i];
        i++;
      } else {
        if (!isExists(output, arr2[j]))
          output[k++] = arr2[j];
        j++;
      }
    }

    while (i < arr1.length) {
      if (!isExists(output, arr1[i]))
        output[k++] = arr1[i];
      i++;
    }
    while (j < arr2.length) {
      if (!isExists(output, arr2[j]))
        output[k++] = arr2[j];
      j++;
    }

    for (int val : output) {
      if (val != -1)
        System.out.print(val + " ");
    }

  }
}
