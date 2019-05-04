package Modelo;

public class Validacao extends absPropriedades implements intMetodos
{

    public Validacao(String numero)
    {
        super(numero);
        Executar();
    }

    
    @Override
    public void Executar()
    {
        try
        {
            this.num = Integer.parseInt(this.numero);
        }
        catch (Exception e)
        {
            Estaticos.mensagem = "Número inválido";
        }
    }

}
