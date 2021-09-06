package katas.determinant;

public class Matrix2 {
	
	static boolean isRow=true;
	
	public static int determinant(int[][] matrix) {
	       	if(matrix.length==1)return matrix[0][0];
	       	int n = determineMostZeros(matrix);
	       	int sum=0;
	       	if(isRow) {
	       	for(int i=0 ;i<matrix[n].length;i++) {
	       		if(matrix[n][i]==0)continue;
	       		int sign = (i%2==0) ? 1 : -1;
	       		sum += sign * matrix[n][i] * determinant(det_minor(matrix, n, i));
	       	}
	        return sum;
	       	}
	       	else {
	       		for(int i=0 ;i<matrix[n].length;i++) {
		       		if(matrix[i][n]==0)continue;
		       		int sign = (i%2==0) ? 1 : -1;
		       		sum += sign * matrix[i][n] * determinant(det_minor(matrix, i, n));
		       	}
		        return sum;
	       		
	       	}
	}
	
	public static int[][] det_minor(int[][] matrix,int rowToBeSkipped, int columnToBeSkipped){
		int[][] det = new int[matrix.length-1][matrix.length-1];
		int row = 0;
		int col = 0;
		for(int i = 0; i < matrix.length; i++) {
			if(i==rowToBeSkipped)continue;
			for(int j = 0; j < matrix.length; j++) {
				if(j == columnToBeSkipped) continue;
				det[row][col++] = matrix[i][j];
			}
			col=0;
			row++;
		}
//		for(int i=0;i<det.length;i++) {
//			for(int j=0;j<det.length;j++) {
//				System.out.print(det[i][j]+ " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		System.out.println();
//		
		return det;
	}
	
	public static int determineMostZeros(int[][] matrix) {
		int result=0;
		int index=0;
		for(int i=0; i<matrix.length;i++) {
			int count = 0;
			for(int j=0; j<matrix.length;j++) {
				if(matrix[i][j]==0) count++;
			}
			if(result<count) {
				result= count;
				index = i;
			}
		}
		for(int i=0; i<matrix.length;i++) {
			int count = 0;
			for(int j=0; j<matrix.length;j++) {
				if(matrix[j][i]==0) count++;
			}
			if(result<count) {
				result= count;
				index = i;
				isRow = false;
			}
		}
		//System.out.println(isRow);
		//System.out.println(index);
		return index;
	}
	
	public static void main(String[] args) {
//		int[][] test = det_minor(new int[][] {{2,5,3}, {1,-2,-1}, {1, 3, 4}}, 1, 1);
//		for(int i=0; i<test.length;i++) {
//			for(int j=0;j<test.length;j++) {
//				System.out.print(test[i][j]+" ");
//			}
//			System.out.println();
//		}
		System.out.println(determinant(new int[][] {{2, -8, -7, -9, -7},
		{5, 9, 9, -3, 0}, 
		{-4, -7, -6, -4, 1}, 
		{-3, 2, -9, -9, 8}, 
		{-1, -2, 2, -10, -4}}));
		 
	}

}
