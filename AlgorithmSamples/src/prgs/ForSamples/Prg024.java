package prgs.ForSamples;

import prgs.Prg;

public class Prg024 extends Prg{

	public void cozum() {
		System.out.println("0 dan buyuk bir sayi giriniz : ");
		int n = scanner.nextInt();
		for(int i=0 ; i<n ; i++)
			System.out.println(i+1);
	}
}
