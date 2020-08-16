package prgs.ForSamples;

import prgs.Prg;

public class Prg033 extends Prg{

	public void cozum() {
		int sum=0;
		for(int i=1 ; i<=5 ; i++) {
			System.out.print(i+". sayiyi giriniz : ");
			sum += scanner.nextInt();
		}
		System.out.print("Toplam = "+sum);
	}
}
