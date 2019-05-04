
package Modelo;
//@author d518615
public abstract class absPropriedades implements intMetodos
{
    protected String valor;
    protected String tipoCalculo;
    protected String mensagem;
    protected String resposta;
    protected Double valorTemperatura;
    protected Double resultado;

    public absPropriedades(String valor, String tipoCalculo)
    {
        this.valor = valor;
        this.tipoCalculo = tipoCalculo;
        Executar();
    }

    public absPropriedades(String valor)
    {
        this.valor = valor;
    }

    public absPropriedades(Double valorTemperatura)
    {
        this.valorTemperatura = valorTemperatura;
    }

    public String getResposta()
    {
        return resposta;
    }

    @Override
    public String toString()
    {
        return this.mensagem;
    }
    
    
}
