package u04;

public class Ej10 {

	public static void main(String[] args) {
		int[][] num = new int[3][6];
		num [1][0]=75;
		num [0][1]=30;
		num [0][2]=2;
		num [2][2]=-2;
		num [2][3]=9;
		num [0][5]=5;
		num [2][5]=11;
		System.out.println("num\tCol_0\tCol_1\tCol_2\tCol_3\tCol_4\tCol_5");
		for (int i = 0; i < num.length; i++) {
			System.out.printf("Fil_%d\t",i);
			for (int j = 0; j < num[i].length; j++) {
				int numActual=num[i][j];
				System.out.print(numActual+"\t");
			}System.out.println("");
		}
	}

}
