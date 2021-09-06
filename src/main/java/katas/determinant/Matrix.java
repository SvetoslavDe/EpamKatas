package katas.determinant;

public class Matrix {
	
	public static int determinant(int[][] matrix) {
        if(matrix.length==1)return matrix[0][0];
	       	int sum=0;
	       	for(int i=0 ;i<matrix[0].length;i++) {
	       		if(matrix[0][i]==0)continue;
	       		int sign = (i%2==0) ? 1 : -1;
	       		sum += sign * matrix[0][i] * determinant(det_minor(matrix, i));
	       	}
	        return sum;
    }
    public static int[][] det_minor(int[][] matrix,int index){
		  int[][] det = new int[matrix.length-1][matrix.length-1];
		  int row = 0;
		  int col = 0;
		  for(int i = 1; i < matrix.length; i++) {
			  for(int j = 0; j < matrix.length; j++) {
				  if(j == index) continue;
				  det[row][col++] = matrix[i][j];
			  }
			  col=0;
			  row++;
		  }
		  return det;
	  }
	public static void main(String[] args) {
		System.out.println(determinant(new int[][] {{2, -8, -7, -9, -7},
			{5, 9, 9, -3, 0}, 
			{-4, -7, -6, -4, 1}, 
			{-3, 2, -9, -9, 8}, 
			{-1, -2, 2, -10, -4}}));
	}

}
