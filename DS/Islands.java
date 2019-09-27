package New;

public class Islands {
	 
	public int count(char[][] grid)
	{
		if(grid==null || grid.length==0 || grid[0].length==0)
		{
			return 0 ; 
		}
		
		int island=0;
		for(int i = 0 ; i < grid.length;i++)
		{
			for(int j = 0 ; j <grid[0].length;j++)
			{
				if(grid[i][j]=='1')
				{
					island++;
					dfs(grid,i,j);
					
				}
			}
			
		}
		
		return island;
		
		
	}
	
	
	public char dfs(char[][] grid ,int i ,int j )
	{
		if(i<0 || i>=grid.length || j <0 || j>= grid[0].length || grid[i][j]=='0')
		{
			return 0;
		}
		
		grid[i][j]='0';
		dfs(grid,i-1,j);
		dfs(grid,i+1,j);
		dfs(grid,i,j+1);
		dfs(grid,i,j-1);
		return 1;
		
		
	}
	public static void main(String[] args) 
	{
		Islands i = new Islands();
		char[][] grid = { { '1', '1', '1' }, { '1', '0', '0' }, { '1', '0', '1' } };
		System.out.println("Count :" + i.count(grid));
		
		

	}
	
	

}

//O(mxn) T S