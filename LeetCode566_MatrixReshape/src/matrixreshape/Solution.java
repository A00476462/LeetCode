package matrixreshape;

public class Solution {
	public int[][] matrixReshape(int[][] nums,int r,int c){
		
		int[][] newNums=new int[r][c];
        int[] oneRow=new int[r*c];
        int row = nums.length;
        int column = nums[0].length;
        //����������������������ģ��ͷ��س�ʼ����
        if(row*column < r*c||row*column>r*c){
            return nums;
        }
        else{
            int SUM1=0;
            int SUM2=0;
            //������һ��һ�еľ���
            for(int i=0;i<row;i++)
                for(int j=0;j<column;j++)
                {
                    oneRow[SUM1]=nums[i][j];
                    SUM1++;
                }
            //����һ�еľ�����������Ҫ��r*c�ľ���
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    newNums[i][j]=oneRow[SUM2];
                    SUM2++;
                }
            }
        }
        return newNums;
	}
}
