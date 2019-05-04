package Modelo;
//@author d518615
public class Validacao extends absPropriedades
{

    public Validacao(String numero)
    {
        super(numero);
    }
    
    @Override
    public void Executar()
    {
        this.mensagem = "";
        try
        {
            this.n1 = Double.parseDouble(this.numero);
            if (this.n1 > 360 || this.n1 < 0)
            {
                this.mensagem = "Número inválido";
            }
        }
        catch (NumberFormatException e)
        {
            this.mensagem = "Número inválido";
        }
    }
}
