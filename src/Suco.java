public class Suco extends Bebida {

	public Suco(EFruta fruta) {
		super("Suco");
		adicionar(fruta);
	}

	@Override
	public int adicionar(EFruta fruta) {
		if (fruta != null && podeAdicionar(fruta))
			frutas.add(fruta);
		return frutas.size();
	}

	private boolean podeAdicionar(EFruta fruta) {
		return switch (frutas.size()) {
			case 0 -> true;
			case 1 -> fruta == EFruta.LARANJA || frutas.get(0) == EFruta.LARANJA;
			default -> false;
		};
	}

	@Override
	public double preco() {
		return frutas.stream().mapToDouble(EFruta::valor).average().orElse(0);
	}

}
