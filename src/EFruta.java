public enum EFruta {

	CUPUACU(10),
	GRAVIOLA(10),
	LARANJA(8),
	MANGA(7),
	MORANGO(12);

	private double valor;
	
	EFruta(double preco){
		valor = preco;
	}

	public double valor(){
		return valor;
	}
}
