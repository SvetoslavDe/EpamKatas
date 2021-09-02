package katas.birdmountain;

public class Dinglemouse {

		public static int peakHeight(char[][] mountain) {
	    int max=0;
			int[][] moun = new int[mountain.length][mountain[0].length];
			for(int i = 0; i<moun.length;i++) {
				for(int j=0; j<mountain[i].length;j++) {
					if(mountain[i][j]==' ')moun[i][j]=0;
					if(mountain[i][j]=='^')moun[i][j]=1;
				}
			}
			int limit = Math.max(mountain.length,mountain[0].length);
			for(int c=0; c<=limit/2; c++) {
				 for(int i=0; i<moun.length;i++) {
					 for(int j=0; j<moun[i].length; j++) {
						 if(moun[i][j]==0)continue;
						try {
							moun[i][j] = min(moun, i ,j);
						}catch(RuntimeException e) {
							continue;
						}
					 }
				 }
			}
			for(int i =0 ;i<moun.length;i++) {
				for(int j=0; j<moun[i].length;j++) {
					if(max<moun[i][j])max=moun[i][j];
				}
			}
			return max;
		}
		
		private static int min(int[][] moun, int i, int j) {
			int min = 100;
			if(moun[i-1][j]<min) min = moun[i-1][j];
			if(moun[i+1][j]<min) min = moun[i+1][j];
			if(moun[i][j+1]<min) min = moun[i][j+1];
			if(moun[i][j-1]<min) min = moun[i][j-1];
			return min+1;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
