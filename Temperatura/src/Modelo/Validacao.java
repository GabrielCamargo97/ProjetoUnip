package Modelo;
//@author d518615
public class Validacao extends absPropriedades
{

    public Validacao(String valor)
    {
        super(valor);
    }
    
    @Override
    public void Executar()
    {
        mensagem = "";
        try
        {
            this.valorTemperatura = Double.parseDouble(this.valor);
        }
        catch (NumberFormatException e)
        {
            this.mensagem = "Número inválido";
        }
    }
    
}
