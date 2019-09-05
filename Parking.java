package project;

import java.util.Scanner;
class Parking{
int count1=0,count2=0;
Scanner input=new Scanner(System.in);
public static void main(String args[]){
Scanner input=new Scanner(System.in);
int n;
System.out.println("Welcome to KLU prepaid parking system");
System.out.println("1.Car Parking");
System.out.println("2.Bike parking");
System.out.println("Enter your choice");
n=input.nextInt();
Parking P=new Parking();
if(n==1)
{
 P.carparking();
}
else if(n==2)
{
 P.bikeparking();
}
}
void carparking()
{
 if(count1==100)
 {
  System.out.println("The parking slots are full");
 }
 else
 {
  System.out.println("enter car number");
  int a= input.nextInt();
  System.out.println("enter 1 for hours,2 for days");
  int b=input.nextInt();
  if(b==1)
  {
   System.out.println("enter number of hours of parking");
   int c=input.nextInt();
   int d=c*40;
   System.out.println("Car number is"+a);
   System.out.println("Number of hours of parking"+c);
   System.out.println("The amount to be paid is"+d);
   System.out.println("Thank You");
  }
  else if(b==2)
  {
   System.out.println("enter number of days of parking required");
   int k=input.nextInt();
   int l=k*850;
   System.out.println("Car number is"+a);
   System.out.println("Number of days of parking required is"+k);
   System.out.println("The amount to be paid is"+l);
   System.out.println("Thank you");
  }
  else
  System.out.println("wrong choic please exit");
  count1++;
 }
}
void bikeparking()
{
 if(count2==100)
 {
  System.out.println("The parking slots are full");
 }
 else
 {
  System.out.println("enter bike number");
  int z=input.nextInt();
  System.out.println("enter 1 for hours,2 for days");
  int y=input.nextInt();
  if(y==1)
  {
   System.out.println("enter number of hours of parking");
   int x=input.nextInt();
   int w=x*20;
   System.out.println("Bike number is"+z);
   System.out.println("Number of hours of parking"+y);
   System.out.println("The amount to be paid is"+x);
   System.out.println("Thank You");
  }
  else if(y==2)
  {
   System.out.println("enter number of days of parking required");
   int v=input.nextInt();
   int u=v*450;
   System.out.println("Bike number is"+z);
   System.out.println("Number of days of parking required is"+v);
   System.out.println("The amount to be paid is"+u);
   System.out.println("Thank you");
  }
  else
  System.out.println("wrong choic please exit");
  count2++;
 }
}
}
