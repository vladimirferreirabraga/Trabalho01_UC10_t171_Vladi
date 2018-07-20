package Clientes_Multitecnologia;

/**
 *
 * @author assparremberger
 */
public class Cadastro_Clientes {
    public static final String PESSOA_FISICA = "pf";
    public static final String PESSOA_JURIDICA = "pj";
    
    private int codigo;
    private String nome, endereco ;
    private Cidade cidade;
    
    public Cadastro_Clientes(){
        
    }
    
    public Cadastro_Clientes(String nome){
        this.nome = nome;
    }
     
    public Cadastro_Clientes(String nome, String endereco, String tipo, Cadastro_Clientes cadastro) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    private static class Cidade {

        public Cidade() {
        }
    }

   
    
}






