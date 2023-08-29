public class matrix1
{
	
	
	public static void main(String [] args)
	{
		System.out.println("nlsriugvk,s");
		Matrix m = new Matrix(3,3);
		m.display();
	}
}

class Matrix 
{
	int r,c;
	int [][] mat =new int[10][10];
		// constructor --- 
	Matrix (int n,int m)
	{
		r=n;
		c=m;

		for(int i=0;i<c;i++)
			for(int j=0;i<r;j++)
				mat[i][j]=0;
	}

	Matrix()
	{
	}

	void display()
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{	
				System.out.println(mat[r][c]);
			}
			System.out.println("\n");
		}
	}
}