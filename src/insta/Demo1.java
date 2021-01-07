package insta;

public class Demo1 {
	public static void main(String[] args) {
		int[] [] series = { {3,0},
							{2,0},
							{1,0},};
		int row, rowNew = 2,column = 0,columnNew = 1;
		for(row = 0; row<3;row++)
		{
			if(series[row] [0] !=0)
			{
				series[rowNew][columnNew] = series[row][column];
				series[row][column]= 0;
				break;
			}
		}
		goster(series);
	}
	public static void goster(int[][] series) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Dizi: "+series[i][j]);
				
			}
			
		}
		
	}

}
