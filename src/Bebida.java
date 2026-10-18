import java.util.ArrayList;
import java.util.List;

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
		StringBuilder frutasUsadas = new StringBuilder(frutas.get(0).toString().toLowerCase());
		if(frutas.size() > 1){
			for (int i = 1; i < frutas.size(); i++) {
				frutasUsadas.append(", "+frutas.get(i).toString().toLowerCase());
			}
		}

		return String.format("%s com %s: R$ %.2f", descricao, frutasUsadas.toString(), preco());
	}

}
