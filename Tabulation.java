//Tabulation
import java.util.*;
class Tabulation{
	public static void main(String args[]){
		int n=5;
		int dp[] = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i=2; i<= n; i++){
			dp[i] = dp[n-1] +dp[n-2];
		}
		System.out.println(dp[n]);
	}
}