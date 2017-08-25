package algorithms4th;

public class Part1 {
	
	/**
	 * 求最大公约数，欧几里得算法
	 * @param p 整数
	 * @param q 整数
	 * @return 最大公约数
	 */
	public static int gcd(int p, int q) {
		if(q == 0) return p;
		int r = p % q;
		return gcd(q, r);
	}
	
	/**
	 * 判断一个数是否为素数
	 * @param N 整数
	 * @return 是素数返回true,不是返回false.
	 */
	public static boolean isPrim(int N) {
		if(N < 2) return false;
		for(int i = 2; i*i <= N; i++)
			if(N % i == 0) return false;
		return true;
	}
	
	/**
	 * 计算平方根(牛顿迭代法)
	 * @param c 求c的平方根
	 * @return c的平方根
	 */
	public static double sqrt(double c) {
		if(c < 0) return Double.NaN;
		double err = 1e-15; //阈值
		double t = c;
		while(t - c/t > err * t) {
			t = (t + c/t) / 2; //t与c/t在目标值两侧
		}
		return t;
	}
}
