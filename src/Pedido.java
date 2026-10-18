import java.util.LinkedList;
import java.util.List;

public class Pedido {

	private List<Bebida> itens;

	public Pedido() {
		itens = new LinkedList<>();
	}

	public int adicionar(Bebida item) {
		if(item != null)
			itens.add(item);
		return  itens.size();
	}

	public double preco() {
		double valor = 0;
		for (Bebida bebida : itens) {
			valor+= bebida.preco();
		}
		return  valor;
	}

	@Override 
	public String toString() {
		StringBuilder cupom = new StringBuilder("PEDIDO COM "+itens.size()+" ITENS\n");
		for (Bebida bebida : itens) {
			cupom.append("\t"+bebida+"\n");
		}
		cupom.append("A PAGAR: R$ "+preco());
		return  cupom.toString();
	}

}
