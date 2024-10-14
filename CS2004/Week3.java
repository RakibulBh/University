public class Main {
    public static void main(String[] args) {
        double[] X = {7, 3, -1, 2, 9 ,0, 0.8, 52, 2.2, 900};
        double[] res = getAvgArray(X);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static double[] getAvgArray(double[] X) {
        double curr_sum = 0;
        double[] ans = new double[X.length];
        for (int i = 0; i < X.length; i++) {
            curr_sum += X[i];
            ans[i] = (curr_sum / (i+1));
        }

        return ans;
    }
}
