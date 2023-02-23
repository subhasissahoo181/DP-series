// Space optimization
import java.util.*;

class State{
	public static void main(String args[]){
		int n=5;
		 int pre =0;
		 int pre_2=1;
		 
		 for(int i=0; i<=n; i++){
			 int answer = pre+pre_2;
			 pre_2 = pre;
			 pre_2 = answer;
			 
			 
		 }
		 System.out.print(pre);
	}
}