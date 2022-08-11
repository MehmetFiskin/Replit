package questions;

import java.util.Arrays;

public class QA02_Interview_GrupCalismasi {/*Write a code that returns the duplicate chars in a String array. (interview Question)
    Input :
    String str="Javaisalsoeasy"
    Output: [a, s]
    */

    public static void main(String[] args) {

        String str = "javaisalsoeasy";

        String[] arr = str.split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {//sıfırıncı index birinci indexe esitmi
                    count++;
                }
            }
            if (count > 1) {
                System.out.print(arr[i]);
                count=0;

            }

        }

    }
}
