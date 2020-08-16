package prgs;

import java.util.Scanner;

public abstract class Prg {
	public Scanner scanner = new Scanner(System.in);
	public abstract void cozum();
	public void cozum2() {
		System.out.println("Bu problemin alternatif cozumunu paylasabilirsen ne mutlu bize :)");
	}
}
