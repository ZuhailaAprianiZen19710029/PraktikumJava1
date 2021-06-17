import javax.swing.JOptionPane;
import javax.util.Scanner;

public class inputdenganscanner{
	public static void main(String[] args){

		Scanner Scanner = new Scanner(System.in);

		String namaDepan = "Riski";
		String namaBelakang = "Nurliana";
		int usia = 20;
		int targetTahunKuliah = 4;
		double ipk = 3.45;
		char nilaiAbjad = 'A';
		boolean tampan = true;

		System.out.print("Input Nama Depan : ");
		namaDepan = Scanner.nextLine();
		System.out.print("Input Usia : ");
		usia = Scanner.nextint();
		System.out.print("Input IPK: ");
		ipk = Scanner.nextDouble();
		System.out.print("");
		System.out.print("Input Nilai Abjad : ");
		nilaiAbjad = scanner.next().charAt(0);
		system.out.print("Tampan? : ");
		tampan = scanner.nextBoolean();

System.out.println("============= OUTPUT ==============")
System.out.println("Nama Depan : " + namaDepan);
System.out.println("Nama Belakang : " + namaBelakang);
System.out.println("Usia :" + usia);
System.out.println("Target Kuliah : " + targetTahunKuliah + " tahun");
System.out.println("IPK : " + ipk);
System.out.println("Nilai PBO : " + nilaiAbjad);
System.err.println("Tampan : " + tampan);

JOptionPane.showMessageDialog(null, "Hai, " + namaDepan + namaBelakang);
	}
}