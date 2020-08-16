package prgs.IfElseSamples;

import prgs.Prg;

public class Prg018 extends Prg {

	public void cozum() {
		int a,b,c,ort;
		System.out.print("a : ");
		a = scanner.nextInt();
		System.out.print("b : ");
		b = scanner.nextInt();
		System.out.print("c : ");
		c = scanner.nextInt();
		
		if(a>b)
			if(b>c)
				ort = b;
			else
				if(a>c)
					ort = c;
				else
					ort = a;
		else
			if(a>c)
				ort = a;
			else
				if(b>c)
					ort = c;
				else
					ort = b;
		System.out.println("Ortanca olani : " + ort);
				
	}
	public void cozum2() {
		int a,b,c;
		System.out.print("a : ");
		a = scanner.nextInt();
		System.out.print("b : ");
		b = scanner.nextInt();
		System.out.print("c : ");
		c = scanner.nextInt();
		
		if((a-b)*(a-c)<0)
			System.out.println("Ortanca olani : " + a);
		if((b-a)*(b-c)<0)
			System.out.println("Ortanca olani : " + b);
		if((c-a)*(c-b)<0)
			System.out.println("Ortanca olani : " + c);
	}
}
