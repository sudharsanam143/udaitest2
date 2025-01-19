package revise;

public class StarProgram {

	public static void main(String[] args) 
	{
		
		for(int i=0;i<6;i++)
		{
			for(int j=(11-2*i)*2;j>0;j-=2) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}

//   * * * * * * *
//   * * * * *
//   * * *
//   *