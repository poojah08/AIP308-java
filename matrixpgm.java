import java.util.Scanner;

public class matrixpgm
{
	public static void main(String[] args)
	{
		System.out.print("enter rows : ");
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		System.out.print("enter columns : ");
		int c = s.nextInt();
		Matrix m1 = new Matrix(r,c);

		System.out.print("enter matrix 1 : \n");

		m1.init();
		m1.printMatrix();
		Matrix m2 = new Matrix(r,c);
		System.out.print("enter matrix 2 : \n");

		m2.init();
		m2.printMatrix();

		Matrix m3 = new Matrix(r,c);

		m3 = m1.add(m2);
		System.out.print("printing matrix addition m3 : \n");
		m3.printMatrix();

		m3 = m1.sub(m2);
		System.out.print("printing matrix subtraction m3 : \n");
		m3.printMatrix();

		m3 = m1.multi(m2);
		System.out.print("printing matrix multiplication m3 : \n");
		m3.printMatrix();
	}



}

class Matrix
{
	int mat[][];
	int row,col;

	public Matrix(int r, int c)
	{
	row=r;col=c;
	mat = new int[row][col];
	}
	
	void init()
	{
		Scanner s = new Scanner(System.in);
		int n;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			System.out.print("pos[" + (i+1) + "]" + "[" + (j+1) + "] :") ;
			n = s.nextInt();
			mat[i][j]=n;
			}
		}
	}

	void printMatrix()
	{
			System.out.println();
		System.out.print("printing matrix \n\n");

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				//System.out.println("pos[" + (i+1) + "]" + "[" + (j+1) + "] :" + mat[i][j] + "  ");
				System.out.print(" " + mat[i][j]);
			}
			System.out.println();
		}
			System.out.println();

	}

	Matrix add(Matrix b)
	{
		Matrix c = new Matrix(row,col);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			c.mat[i][j]=mat[i][j] + b.mat[i][j];
			}
		}
		return c;
	}

	Matrix sub(Matrix b)
	{
		Matrix c = new Matrix(row,col);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			c.mat[i][j]=mat[i][j] - b.mat[i][j];
			}
		}
		return c;
	}
	Matrix multi(Matrix b)
	{
		Matrix c = new Matrix(row,col);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				c.mat[i][j]=0;
				for(int k=0 ;k<col ;k++)
				c.mat[i][j]  = c.mat[i][j] +( mat[i][j] + b.mat[i][k]);
			}
		}
		return c;
	}

}