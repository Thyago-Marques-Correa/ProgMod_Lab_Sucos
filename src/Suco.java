
public class Suco extends Bebida {

	public Suco(EFruta fruta) {
		super("Suco");
		adicionar(fruta);
	}

	@Override 
	public int adicionar(EFruta fruta) {
		if(fruta != null && podeAdicionarFruta(fruta))
			frutas.add(fruta);
		
		return  frutas.size();
	}

	private boolean podeAdicionarFruta(EFruta fruta){
			return switch(frutas.size()) {
				case 0 -> true; 
				case 1 -> fruta.equals(EFruta.LARANJA) || frutas.get(0).equals(EFruta.LARANJA);				
				default -> false;
			};
	}

	@Override 
	public double preco() {
		double valor = 0;
		for (EFruta eFruta : frutas) {
			valor += eFruta.valor();
		}
		return  valor / frutas.size();
	}

	

}
