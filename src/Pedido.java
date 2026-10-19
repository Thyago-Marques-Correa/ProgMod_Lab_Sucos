import java.util.LinkedList;
import java.util.List;

public class Pedido {

	private List<Bebida> itens;

	public Pedido() {
		itens = new LinkedList<>();
	}

	public int adicionar(Bebida item) {
		if (item != null)
			itens.add(item);
		return itens.size();
	}

	public double preco() {
		double total = 0;
		for (Bebida bebida : itens)
			total += bebida.preco();
		return total;
	}

	@Override
	public String toString() {
		StringBuilder cupom = new StringBuilder("PEDIDO COM " + itens.size() + " ITENS\n");
		for (Bebida bebida : itens)
			cupom.append("\t").append(bebida).append("\n");
		cupom.append(String.format("A PAGAR: R$ %.2f", preco()));
		return cupom.toString();
	}

}
