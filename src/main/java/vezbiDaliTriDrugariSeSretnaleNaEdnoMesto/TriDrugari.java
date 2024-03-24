/*Три другари: Игор, Младен и Драган треба да се сретнат на едно место . Се
договараат на следниот начин: Првиот кој че дојде 10 минути го чека другиот, па ако
овој дојде 5 минути го чекаат третиот.
Да се напише програма која го вчитува времето (0≤час≤23, 0≤минути≤59) да се
пресмета кој дошол прв и да се одговори на прашањето кој дошол прв.
Претпоставуваме дека времето е вчитано правилно и интервалите се
однесуваат на еден ден.
Пример:
Внес: 13 5 13 9 12 56 Излез: Драган стигнал прв. Се сретнале.
Внес: 13 5 12 54 13 9 Излез: Младен стигнал прв. Не се сретнале.*/

package vezbiDaliTriDrugariSeSretnaleNaEdnoMesto;
import java.util.Scanner;
public class TriDrugari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prv,vtor,tret;
		Scanner tastatura = new Scanner(System.in);
		System.out.print("Vreme na doagjanje na Igor (cas): ");
		int casI=tastatura.nextInt();
		System.out.print("Vreme na doagjanje na Igor (minuti): ");
		int minI=tastatura.nextInt();
		int vremeI=casI*60+minI;
		System.out.print("Vreme na doagjanje na Mladen (cas): ");
		int casM=tastatura.nextInt();
		System.out.print("Vreme na doagjanje na Mladen(minuti): ");
		int minM=tastatura.nextInt();
		int vremeM=casM*60+minM;
		System.out.print("Vreme na doagjanje na Dragan(cas): ");
		int casD=tastatura.nextInt();
		System.out.print("Vreme na doagjanje na Dragan(minuti): ");
		int minD=tastatura.nextInt();
		int vremeD=casD*60+minD;

		if(vremeI<vremeM && vremeI<vremeD) {
		System.out.print("Igor stignal prv");
		prv=vremeI;
		vtor=Math.min(vremeD,vremeM);
		tret=Math.max(vremeD,vremeM);
		}else if(vremeM<vremeI && vremeM<vremeD) {
		System.out.print("Mladen stignal prv");
		prv=vremeM;
		vtor=Math.min(vremeD,vremeI);
		tret=Math.max(vremeD,vremeI);
		}else{
		System.out.print("Dragan stignal prv, ");
		prv=vremeD;
		vtor=Math.min(vremeI,vremeM);
		tret=Math.max(vremeI,vremeM);
		}
		int razlika1=vtor-prv;
		int razlika2=tret-vtor;
		if(razlika1<=10 && razlika2<=5) {
		System.out.print("Se sretnale. :)");
		}else{
		System.out.print(" Ne se sretnale. :(");
		}
	}

}
