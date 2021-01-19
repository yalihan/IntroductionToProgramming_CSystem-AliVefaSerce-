package prgs.WhileSamples;

import prgs.Prg;

public class Prg102 extends Prg{
	public void cozum() {
		System.out.print("n : ");
		int n = scanner.nextInt();
		
		int s = n;
		int basamakDegeri = 1;
		
		while(s != 0) {
			basamakDegeri *= 10;
			s /= 10;
		}
		
		while(n != 0) {
			basamakDegeri /= 10;
			s += (n%10) * basamakDegeri;
			n /= 10;
		}
		
		System.out.println(s);
	}
}