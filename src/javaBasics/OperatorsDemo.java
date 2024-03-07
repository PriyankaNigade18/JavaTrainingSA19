package javaBasics;

public class OperatorsDemo {

	public static void main(String[] args) 
	{
		
		System.out.println("*****Arithemetic operation********");
		int a=20,b=10;
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Modulus is: "+(a%b));
		
		/*
		 * Unary ++ --
		 * 
		 * Increment(++) post Increment   Pre Increment
		 * 					a++					++a
		 */
		
		int a1=100;
		System.out.println(a1);//100
		System.out.println(++a1);//101
		
		int b1=200;
		System.out.println(b1);//200
		System.out.println(b1++);//200
		System.out.println(b1);//201
		
		int c1=100;
		System.out.println(c1);//100
		System.out.println(--c1);//99
		
		int d1=200;
		System.out.println(d1);//200
		System.out.println(d1--);//200
		System.out.println(d1);//199
		
		int a2=85;
		int b2=a2++;
		System.out.println(b2);//85
		System.out.println(a2);//86
		
		int p=589;
		int q=p++;
		System.out.println(p);//590
		System.out.println(q);//589
		
		int i=478;
		int j=++i;
		System.out.println(i);//479
		System.out.println(j);//479
		
		
		int u=90;
		int v=++u;
		
		System.out.println(u);//91
		System.out.println(v);//91
		
	//decrement
		int s=69;
		int r=s--;
		System.out.println(s);//68
		System.out.println(r);//69
		
		int o=599;
		int g=o--;
		System.out.println(o);//598
		System.out.println(g);//599
		
		int e=78;
		int k=--e;
		System.out.println(e);//77
		System.out.println(k);//77
		
		int l=350;
		int m=--l;
		System.out.println(l);//349
		System.out.println(m);//349
		
		System.out.println("******Relational Opretaors*********");
		//e=k=77 l=m=349 u=v=91 a2=86 b2=85
		
		System.out.println("Less than <: "+(e<a2));//true
		System.out.println("Greater than >: "+(v>a2));//true
		System.out.println(v<b2);//false
		System.out.println(l<v);//false
		System.out.println("Less than equalTo <=: "+(v<=u));//true
		System.out.println("greater than equal To >=: "+(l>=a2));//true
		System.out.println("Comparison Operator: ==: "+(e==k));//true
		System.out.println(l==b2);//false
		System.out.println("Not equal to !=: "+(e!=k));//false
		System.out.println(a2!=b2);//true
		
		System.out.println("******Logical Opretaors*********");
		/*
		 * a     b         a&&b(AND)         a||b(Or)    !(Not)a
		 * true  true		true				true		false
		 * true  false		false				true		false
		 * false true		false				true		true
		 * false false		false				false		true
		 * 
		 */
		
		//e=k=77 l=m=349 u=v=91 a2=86 b2=85
		System.out.println(e<a2 && e==k);//true
		System.out.println(e==k && e>b2);//false
		System.out.println(l<e && e==k);//false
		System.out.println(l!=m && e!=k);//false
		
		
		System.out.println(e<a2 || e==k);//true
		System.out.println(e==k || e>b2);//true
		System.out.println(l<e || e==k);//true
		System.out.println(l!=m || e!=k);//false
		
		
		System.out.println("****Not*******");
		
		System.out.println(e==k);//true
		System.out.println(!(e==k));//false
		
		System.out.println(e!=k);//false
		System.out.println(!(e!=k));//true
		

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
