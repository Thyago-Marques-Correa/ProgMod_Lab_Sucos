import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Bebida {

	private String descricao;
	protected List<EFruta> frutas;

	public Bebida(String descricao) {
		this.descricao = descricao;
		frutas = new ArrayList<>(3);
	}

	public abstract int adicionar(EFruta fruta);

	public abstract double preco();

	@Override
	public String toString() {
		String usadas = frutas.stream()
				.map(fruta -> fruta.name().toLowerCase())
				.collect(Collectors.joining(", "));
		return String.format("%s com %s: R$ %.2f", descricao, usadas, preco());
	}

}
