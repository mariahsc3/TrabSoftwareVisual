
import model.Produto;
import model.PessoaFisica;
import dao.PessoaFisicaDao;
import dao.ProdutoDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;





public class ArquivosDeTexto {

    public static void main(String[] args) {
        String opcao = "0";
        String textoMenu = "******* Menu ******* \n"
                + "****Digite o número da opcão desejada:****\n"
                + "1 - Carregar Pessoa Fisica \n"
                + "2 - Carregar Produto \n"
                + "0 - Sair";
        ArrayList<PessoaFisica> listaPessoa = new ArrayList<PessoaFisica> ();
        ArrayList<Produto> listaProduto = new ArrayList<Produto> ();
                
        do {
            opcao = JOptionPane.showInputDialog(null,textoMenu);
            switch (opcao) {
                case "1":
                	PessoaFisicaDao pessoaDao = new PessoaFisicaDao();
                    listaPessoa = pessoaDao.convertCsvPessoaFisica();
                    String texto = "";
                    int i = 1;
                    for(PessoaFisica pessoaf: listaPessoa){
                        texto += ++i +" - "+ pessoaf.toString();
                    }
                    JOptionPane.showMessageDialog(null, texto);
                    break;
                case "2":
                    if(listaPessoa.size() >= 1){
                    ProdutoDao cd = new ProdutoDao();
                    listaProduto = cd.convertCsvConta(listaPessoa);
                    String textoproduto = "";
                    int j = 1;
                    for(Produto produto: listaProduto){
                        textoproduto += ++j +" - "+ produto.toString();
                    }
                    JOptionPane.showMessageDialog(null, textoproduto);
                    }else{
                        JOptionPane.showMessageDialog(null, "Carregue a lista de clientes ");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"O sistema foi encerrado.");
            }
        } while (!opcao.equals("0"));
    }
}