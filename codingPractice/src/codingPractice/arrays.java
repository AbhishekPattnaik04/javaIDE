package codingPractice;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array1");
		int size1=sc.nextInt();
		System.out.println("enter size of array2");
		int size2=sc.nextInt();
		System.out.println("enter size of array3");
		int size3=sc.nextInt();
		int i=0,j=0,k=0;
		int flag=0;
		int[] array1=new int[size1];
		int[] array2=new int[size2];
		int[] array3=new int[size3];
		System.out.println("enter elements for array1");
		for(i=0;i<size1;i++) {
			array1[i]=sc.nextInt();
		}
		System.out.println("enter elements for array2");
		for(j=0;j<size2;j++) {
			array2[j]=sc.nextInt();
		}
		System.out.println("enter elements for array3");
		for(k=0;k<size3;k++) {
			array3[k]=sc.nextInt();
		}
	for(i=0;i<size1;i++) {
		for(j=0;j<size2;j++) {
			if(array1[i]==array2[j]) {
				for(k=0;k<size3;k++) {
					if(array3[k]==array1[i]) {
						flag=1;
						System.out.println(array1[i]+" ");
					}
				}
			}
		}
			
			}
		
		
		}
		
		
	
	}

//6 7 20 80 100
//enter elements for array3
//3 4 15 20 30 70 80 120