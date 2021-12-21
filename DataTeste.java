import java.util.Scanner;

public class DataTeste {
	public static void main(String[] args) {
		
		Data data = new Data();
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dia no nascimento: ");
		int dataDia = entrada.nextInt();
		data.dia = dataDia;
		System.out.print("Mês do nascimento: ");
		int dataMes = entrada.nextInt();
		data.mes = dataMes;
		System.out.print("Ano do nascimento: ");
		int dataAno = entrada.nextInt();
		data.ano = dataAno;
		
		System.out.printf("\n%d / %d / %d", data.dia, data.mes, data.ano);
		
		entrada.close();
		
	}

}
