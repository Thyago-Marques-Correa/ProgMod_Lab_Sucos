
public class Vitamina extends Bebida {

	private static final double ACRESCIMO = 2.5;


	public Vitamina(EFruta fruta) {
		super("VITAMINA");
		if(fruta != null)
			frutas.add(fruta);
	
	}

	@Override 
	public int adicionar(EFruta fruta) {
		if(frutas.size() < 3  && fruta != null){
			frutas.add(fruta);
		}
		return  frutas.size();
	}

	@Override 
	public double preco() {
		double valor = 0;
		for (EFruta eFruta : frutas) {
			valor += eFruta.valor();
		}
		valor =  valor / frutas.size();
		valor += ACRESCIMO;
		if(frutas.size() > 1){
			double tamanho = 0.2 * frutas.size();
			valor *= (1+tamanho);
		}
		return  valor;
	}

	

}
