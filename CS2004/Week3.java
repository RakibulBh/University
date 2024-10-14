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

    
    // O(N^2) Run time
    public static double[] alg1(double[] X) {
        double[] A = new double[X.length];
        for (int i = 0; i<X.length; i++) {
            double s = X[0];
            for (int j = 0; j < A.length; j++) {
                if (j <= i){
                    s = s + X[j];
                }
            }
            A[i] = s / (i + 1);
        }
        return A;
    }

    // O(N) runtime
    public static double[] alg2(double[] X) {
        double[] A = new double[X.length];
        double s = 0;
        for (int i = 0; i<X.length; i++) {
            s = s + X[i];
            A[i] = s / (i + 1);
        }
        return A;
    }
}
