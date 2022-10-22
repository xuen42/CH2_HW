package HW2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class hw2 
{

	public static void main(String[] args)throws IOException
	{	
		while(true) 
		{
		System.out.println("請輸入功能測試號碼");
		BufferedReader br1 =
			new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br1.readLine());
		switch(num) 
		{
			case 1 :
				System.out.println("輸入的號碼是1");
				break;
			case 2 :
				System.out.println("輸入的號碼是2");
				System.out.println("請再此輸入a或b");
				BufferedReader br2 =
						new BufferedReader(new InputStreamReader(System.in));
				String str1 = br2.readLine();
				char  letter = str1.charAt(0);
				if(letter == 'a' || letter == 'A') 
				{
					System.out.println("輸入的是a");
				}
				else if(letter == 'b'|| letter == 'B')
				{
					System.out.println("輸入的是b");
				}
				else
				{
					System.out.println("只能輸入a/A或b/B");
				}
				break;
			case 3:
				System.out.println("輸入的號碼是3");
				System.out.println("請再次一個輸入整數號碼");
				BufferedReader br3 = 
						new BufferedReader(new InputStreamReader(System.in));
				String str2 = br3.readLine();
				int res1 = Integer.parseInt(str2);
				char ans = (res1 == 1)?'A':'B';
				System.out.println("選擇了"+ans+"路綫");
				break;
			case 4:
				System.out.println("輸入的號碼是4");
				System.out.println("請輸入内圈loop的數量（0-2）");
				BufferedReader br4 = 
						new BufferedReader(new InputStreamReader(System.in));
				String str3 = br4.readLine();				
				int res2 = Integer.parseInt(str3);
				System.out.println("請輸入外圈loop的數量(0-9）");
				BufferedReader br5 = 
						new BufferedReader(new InputStreamReader(System.in));
				String str4 = br5.readLine();				
				int res3 = Integer.parseInt(str4);
				for(int i = 1;i<10;i++)
				{
					for(int j=0;j<3;j++) {
						System.out.println("i圈"+i+"j圈"+j);
						if(res2 == j)
							break;
					}
					if(res3 == i)
						break;
				}
				break;
			case 5:
				System.out.println("輸入的號碼是4");
				System.out.println("請輸入5個人的分數");
				BufferedReader br6 = 
						new BufferedReader(new InputStreamReader(System.in));
				int test[] = new int[5];
				for(int i=0;i<test.length;i++)
				{
					String str5 = br6.readLine();
					test[i]=Integer.parseInt(str5);
				}
				System.out.println("選擇牌排序的方式（1：forloop 2:Java Method）");
				BufferedReader br7 =
						new BufferedReader(new InputStreamReader(System.in));
				int num2 = Integer.parseInt(br7.readLine());
				switch(num2)
				{
					case 1:
					for(int s=0;s<test.length;s++)
					{
						for(int t=s+1;t<test.length;t++) 
						{
							if(test[t]>test[s]) 
							{
								int tmp = test[t];
								test[t] = test[s];
								test[s] = tmp;
							}
						}
					}
					for(int i =0;i<test.length;i++) 
					{
						System.out.println("第"+(i+1)+"名的分數是"+test[i]);
					}
					break;
					case 2:
						 Arrays.sort(test);
						for(int i = 0; i < test.length;i++) 
						{
							System.out.println("第"+(i+1)+"名的分數是"+test[i]);
						}
					break;
				}
				break;
			case 6:
				int[][]test1;
				test1 = new int[2][5];
				test1[0][0]=80;
				test1[0][1]=70;
				test1[0][2]=60;
				test1[0][3]=50;
				test1[0][4]=50;
				test1[1][0]=40;
				test1[1][1]=30;
				test1[1][2]=20;
				test1[1][3]=10;
				test1[1][4]=90;
				for(int i=0;i<test1[1].length;i++)
				{
					System.out.println("第"+(i+1)+"個人的國語分數是"+test1[0][i]+"分");
					System.out.println("第"+(i+1)+"個人的英文分數是"+test1[1][i]+"分");
				}
				break;
				
				
		}
		}

	}

}
