/*
 * 1- Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
 */
public class atv1 {

	public static void main(String[] args) {
		int num;
		
		for(num=1000;num<2000;num++) {
			if(num%11==5) {
				System.out.println(num+"\n");
			}
		}

	}

}
