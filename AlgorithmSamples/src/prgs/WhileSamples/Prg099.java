package prgs.WhileSamples;

import prgs.Prg;

public class Prg099 extends Prg{
	public void cozum() {
		System.out.println("Girilen sayilarin toplami 1000'i gecince programdan cikilacak\n");
		
		System.out.print("a = ");
		int a = scanner.nextInt();
		int sum = a;
		
		while(sum<=1000) {
			System.out.print("a = ");
			a = scanner.nextInt();
			sum += a;
		}
		System.out.println("Toplam = "+sum);
	}
}