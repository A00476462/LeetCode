package array_Partition_1;
import java.util.Arrays;

//�������飬��������
public class Solution {
	public int arrayPairSum(int[] nums) {
		//ð������
		int temp;
		for(int i = 0;i<nums.length-1;i++)
		{
			for(int j=0;j<nums.length-i-1;j++)
			{
				if(nums[j]>nums[j+1])
				{
					temp =nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		for (int i=0;i<nums.length;i++)//�����ʾ
		System.out.println(nums[i]);
		
		System.out.println("*****************��һ�ָ��Ʒ���*****************");
		
		int[] copyNums1=new int [nums.length];
		for(int i=0;i<nums.length;i++)
		{
			copyNums1[i]=nums[i];
		}
		for(int i=0;i<copyNums1.length;i++)
			System.out.println(copyNums1[i]);
		
		System.out.println("*******************�ڶ����Ʒ���****************");
		int[] copyNums2 = new int[nums.length];
		System.arraycopy(nums, 0, copyNums2, 0, nums.length);
		for(int i=0;i<copyNums2.length;i++)
			System.out.println(copyNums2[i]);
		return 0;
		
	}
	
	//��һ������ֳ�ÿ������Ϊ2��N������
	public int someArray(int[] nums) {
		long SUM=0;
		int numsSum=0;
		int[][]groupArray = new int[(int) (nums.length*0.5)][2];
		for(int i=0;i<(int)(nums.length*0.5);i++)
		{
			int sum=0;
			for(int j=0;j<2;j++)
			{	
				groupArray[i][j]=nums[numsSum];
				sum++;
				numsSum++;
				
				if(sum%2==0)					
					break;
			}
		}
		
		for(int i=0;i<(int)(nums.length*0.5);i++)
		{
			int sum = 0;
			for(int j=0;j<2;j++) {
				System.out.print(groupArray[i][j]+"  ");
				sum++;
				if(sum%2==0)
					System.out.println("\n");
			}				
		}
		
		for(int i=0;i<(int)(nums.length*0.5);i++)
		{
			SUM =SUM +groupArray[i][0];
		}
		System.out.println("���յĽ���ǣ�"+SUM);
		return 0;
			
	}
	
	//�ۺ�������������ֵ���
	public int arrayPairSum2(int[] nums) {
        /**
        ��һ��������ð�ݷ���
        �ڶ�����forѭ������N������
        ��������forѭ���ҵ�N��������С���Ǹ��������ܺ�
        */
		if(nums==null)
		{
			return 0;
		}
        int SUM=0;//���յĽ��
        //���򲿷�
        
        int temp;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=0;j<nums.length-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        for(int i=0;i<nums.length;i++)
        {
        	System.out.print(nums[i]+"  ");
        	
        }
        System.out.println();System.out.println();
        //����N�����鲿��
        int[][] groupArray=new int[(int)(nums.length*0.5)][2];
        int numsSum=0;
        for(int i=0;i<(int)(nums.length*0.5);i++)
        {
            int sum = 0;
            for(int j=0;j<2;j++){
                groupArray[i][j]=nums[numsSum];
                sum++;
                numsSum++;
                if(sum%2==0)
                    break;
            }
            
        }
        
        //ȡ��������������С���Ǹ���ֵ���
        for(int i=0;i<(int)(nums.length*0.5);i++)
        {
            SUM = SUM+groupArray[i][0];
        }
        System.out.println(SUM);
        
        return 0;
    }
	
	//�򻯰�ķ��������
	public int simplifySolution(int[] nums) {
		int SUM=0;
		Arrays.sort(nums);
//		for(int i=0;i<nums.length;i++)
//		{
//			System.out.print(nums[i]+"  ");
//		}
//		System.out.println("\n");//��ʾ����������
		//�˲���ѭ�����������ռ򻯰��2�������ʺϲ���
//		for(int i=0;i<nums.length;i++)
//		{
//			if(i%2==0) {
//				SUM = SUM+nums[i];
//			}
//		}
		for(int i=0;i<nums.length;i=i+2)
		{
			SUM = SUM+nums[i];
		}
		System.out.println("�򻯰淽�����SUM=:"+SUM);
		return 0;
		
	}

	
}
