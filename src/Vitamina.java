public class Vitamina extends Bebida {

	private static final double ACRESCIMO = 2.5;
	private static final int MAXIMO_FRUTAS = 3;

	public Vitamina(EFruta fruta) {
		super("Vitamina");
		adicionar(fruta);
	}

	@Override
	public int adicionar(EFruta fruta) {
		if (fruta != null && frutas.size() < MAXIMO_FRUTAS)
			frutas.add(fruta);
		return frutas.size();
	}

	@Override
	public double preco() {
		if (frutas.isEmpty())
			return 0;
		double media = frutas.stream().mapToDouble(EFruta::valor).average().getAsDouble();
		return (media + ACRESCIMO) * fatorTamanho();
	}

	private double fatorTamanho() {
		return switch (frutas.size()) {
			case 2 -> 1.4;
			case 3 -> 1.6;
			default -> 1.0;
		};
	}

}
