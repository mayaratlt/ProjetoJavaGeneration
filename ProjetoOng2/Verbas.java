package ProjetoOng2;

import java.text.NumberFormat;

public class Verbas extends Pessoa{
		
	private int codigoVerba;
	private float verba;
	private float total = 1000;
	
	public Verbas(  String nome, String cpf, int idade ,int codigoVerba,float verba) {
		super(nome,cpf,idade);
		this.codigoVerba = codigoVerba;
		this.verba = verba;
	}

	public int getCodigoVerba() {
		return codigoVerba;
	}

	public void setCodigoVerba(int codigoVerba) {
		this.codigoVerba = codigoVerba;
	}
	
	
	public float getVerba() {
		return verba;
	}

	public void setVerba(float verba) {
		this.verba = verba;
	}
	
	

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String formatarMoeda() {
		// pega a moeda corrente 
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		//número de casas depois da virgula 
		nf.setMinimumFractionDigits(2);
		//formata o atributo com uma formatação monetaria 
		String formatoMoeda = nf.format(verba);
		return formatoMoeda;
	}
	public void imprimirVerba() {
		System.out.println("\n Nome: "+getNome()+"\n CPF: "+getCpf()+"\n Idade : "+getIdade()+
				"\n Codigo do Voluntario: "+codigoVerba+"\n com Valor de entrada de  "+this.formatarMoeda());
	}
	public void imprimirVerba2() {
		System.out.println("\n Nome: "+getNome()+"\n CPF: "+getCpf()+"\n Idade : "+getIdade()+
				"\n Codigo do Voluntario: "+codigoVerba+"\n com Valor de Saida de "+this.formatarMoeda());
	}
}
