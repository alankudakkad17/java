package program1; 

 

import java.util.Scanner; 

 

public class Matrix_multi { 

 

public static void main(String[] args) { 

// TODO Auto-generated method stub 

int r1,c1,i,j = 0,k,r2,c2; 

int [][] a = new int[10][10]; 

Scanner scan =new Scanner(System.in); 

System.out.println("enter the number of rows"); 

r1=scan.nextInt(); 

System.out.println("enter the number of columns"); 

c1=scan.nextInt(); 

System.out.println("Enter the first matrix"); 

for(i=0;i<r1;i++) 

for(j=0;j<c1;j++) 

{  

 a[i][j]=scan.nextInt(); 

 

} 

int [][] b =new int[10][10] ; 

System.out.println("enter the number of rows of second matrix"); 

r2=scan.nextInt(); 

System.out.println("enter the number of columns of second matrix"); 

c2=scan.nextInt(); 

System.out.println("Enter the second matrix"); 

for(i=0;i<r2;i++) 

for(j=0;j<c2;j++) 

{  

 b[i][j]=scan.nextInt(); 

 

} 

int d[][]=new int[10][10];	 

for(i=0;i<r1;i++) 

 { for(j=0;j<c1;j++) 

    { 

  for(k=0;k<r2;k++) 

  { 

  d[i][j]=d[i][j]+(a[i][k]*b[k][j]); 

  } 

       

    } 

   

 } 

System.out.println("new matrix\n"); 

for(i=0;i<r1;i++) 

{ 

  for(j=0;j<c2;j++) 

  { 

  System.out.print(d[i][j]+" "); 

   

  } 

  System.out.print("\n"); 

} 

} 

 

} 

 
