package Modelo;
//@author d518615
public abstract class absPropriedades implements intMetodos
{
    public String mensagem;
    protected String numero;
    protected Double n1;
    protected Double cosseno;
    protected Double seno;
    protected Double tangente;
    protected String resposta;

    public absPropriedades(String numero)
    {
        this.numero = numero;
        Executar();
    }

    public absPropriedades(Double n1)
    {
        this.n1 = n1;
        Executar();
    }

    @Override
    public String toString()
    {
        return this.resposta;
    }
   
    @Override
    public void Executar()
    {
        
    }        

}
