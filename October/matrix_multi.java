import java.util.Scanner;
public class matrix_multi {
	public static void main(String[] args) {
	int R1,C1,R2,C2,i,j,k;
	Scanner scan =new Scanner(System.in);
	System.out.print("Enter ROW and COLUMN size of matrix 1\n");
	R1=scan.nextInt();
	C1=scan.nextInt();
	System.out.print("Enter ROW and COLUMN size of matrix 2\n");
	R2=scan.nextInt();
	C2=scan.nextInt();
	int MAT1[][]=new int[R1][C1];
	int MAT2[][]=new int[R2][C2];
	int MAT3[][]=new int[R1][C2];
	if (R1 == C2) {
		System.out.print("Enter elements of Matrix 1\n");
	for (i=0; i<R1; i++) {
		for(j=0; j<C1;j++)
			MAT1[i][j]=scan.nextInt();
	}
	System.out.print("Enter elements of Matrix 2\n");
	for (i=0;i<R2;i++) {
		for(j=0;j<C2;j++)
			MAT2[i][j]=scan.nextInt();
	}
	for (i=0; i<R1; i++) {
		for(j=0; j<C2; j++) {
			MAT3[i][j] = 0;
			for(k=0; k<C1; k++)
				MAT3[i][j] += MAT1[i][k] * MAT2[k][j];
		}
	}
	System.out.print("The product of 2 matrices is:\n");
	for(i=0; i<R1; i++) {
		for(j=0; j<C2; j++) {
			System.out.print("\t");
			System.out.print(MAT3[i][j]);
		}
		System.out.print("\n");
		}
	}
	else System.out.print("Product cannot be found; Matrix order error");
	}
}
