import java.util.Scanner;
public class matrix_multiplication
{
	int[][] read(int r,int c)
	{
		Scanner in = new Scanner(System.in);
		int[][] a=new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				a[i][j]=in.nextInt();
		return a;
	}
	int[][] multiply(int[][] a,int[][] b,int r1,int r2,int c2)
	{
		int[][] c=new int[r1][c2];
		for(int i=0;i<r1;i++)
			for(int j=0;j<c2;j++)
			{
				c[i][j]=0;
				for(int k=0;k<r2;k++)
					c[i][j]+=a[i][k]*b[k][j];
			}
		return c;
	}
	void display(int[][] a,int r,int c)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		int r1,r2,c1,c2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the order of first matrix");
		r1=in.nextInt();
		c1=in.nextInt();
		System.out.println("Enter the order of second matrix");
		r2=in.nextInt();
		c2=in.nextInt();
		if(c1!=r2)
			System.out.println("Invalid order for matrix multiplication");
		else
		{
			matrix_multiplication ob = new matrix_multiplication();
			System.out.println("Enter the elements in first matrix");
			int [][] m1 = ob.read(r1,c1);
			System.out.println("Enter the elements in second matrix");
			int [][] m2 = ob.read(r2,c2);
			int [][] m3 = ob.multiply(m1,m2,r1,r2,c2);
			System.out.println("Matrix 1");
			ob.display(m1,r1,c1);
			System.out.println("Matrix 2");
			ob.display(m2,r2,c2);
			System.out.println("Result after multiplying the two matrix");
			ob.display(m3, r1, c2);
		}
	}
}
