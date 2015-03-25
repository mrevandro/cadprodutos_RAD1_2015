
package cadprodutos;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProdutos {
    private static final List<Produto> produtos = new ArrayList<>();
    
    public void salvar(Produto p){
        produtos.add(p);
    }
    
    public List<Produto> getProdutos(){
        return produtos;
    }
}
