import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {
        arrow1();
        arrow2();
        arrow3();
        arrow4();
        arrow5();
        arrow6();
        arrow7();
    }

    public static void arrow1() {
        int[] nums = {1, 0, 0, 1, 0, 0, 1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = 1;
            } else nums[i] = 0;
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");
    }

    public static void arrow2() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public static void arrow3() {
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 6) {
                nums[i] = nums[i] * 2;
            }
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");
    }


    public static void arrow4() {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (arr[i] == arr[j]) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void arrow5() {
        Scanner cs = new Scanner(System.in);
        System.out.println("length arrow = ");
        int len = cs.nextInt();
        System.out.println("meaning arrow = ");
        int initialValue = cs.nextInt();
        cs.close();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

    }

    public static void arrow6() {
        int[] nums = {6, 10, 3, 17, -1, 1, 11, 99};
        int a = nums[0];
        int b = nums[0];
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            if (nums[i] >= a) {
                a = nums[i];
            }
            if (nums[i] <= b) {
                b = nums[i];
            }
        }
        System.out.println("\nmax = " + a);
        System.out.println("min = " + b);
        System.out.println("\n");
    }
    public static void arrow7() {
        int sum1 = 0;
        int sum2 = 0;
        int[] arr = {1, 1, 3, 1, 4, 6, 8, 8 };
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
            System.out.print(arr[i] + " ");
            if (sum2 == sum1 - sum2) {
                System.out.print(true + " ||| ");
            }
        }
    }
}


