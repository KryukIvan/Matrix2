import java.util.Random;


public class Matrix2 {
    public static void main (String[] args) {
        int arr_n [];
        arr_n = new int[15];
        Random random = new Random();
        int maxn = arr_n[0];
        int minn = arr_n[0];
        int mod;
        for (int i=0; i<arr_n.length; i++) {
            arr_n[i] = random.nextInt(-20, 21);
            System.out.print(arr_n[i] + " ");
            if (arr_n[i] > maxn)
                maxn = arr_n[i];
            if (arr_n[i] < minn)
                minn = arr_n[i];
        }
        int result = Math.abs(minn);
        int result2 = Math.abs(maxn);
        if (result > result2)
             mod = minn;
        else
             mod = maxn;
        //int result_all = Math.max(result, result2);
        System.out.println();
        System.out.println("Минимальное число = " + minn);
        System.out.println("Максимальное число = " + maxn);
        System.out.println("Наибольшее по модулю = " + mod);
    }
}
