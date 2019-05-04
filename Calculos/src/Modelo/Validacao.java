package Modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String numero1, String numero2, String numero3)
    {
        super(numero1, numero2, numero3);
        Validar(this.numero1, this.numero2, this.numero3);
    }

    public Validacao(String numero1)
    {
        super(numero1);
        Validar(this.numero1);
    }
    
    private void Validar(String numero1)
    {
        Estaticos.mensagem = "";
        try
        {
            this.numero = Integer.parseInt(numero1);
        }
        catch (Exception e)
        {
            Estaticos.mensagem = "Número Inválido.";
        }
    }
    
    private void Validar(String numero1, String numero2, String numero3)
    {
        Estaticos.mensagem = "";
        try
        {
            this.lado1 = Double.parseDouble(numero1);
            this.lado2 = Double.parseDouble(numero2);
            this.lado3 = Double.parseDouble(numero3);
            if ((this.lado1 + this.lado2) > this.lado3 && (this.lado1 + this.lado3) > this.lado2 && (this.lado2 + this.lado3) > this.lado1)
            {
                Estaticos.mensagem = "";
            }
            else
            {
                Estaticos.mensagem = "Triângulo Inválido";
            }
        }
        catch (Exception e)
        {
            Estaticos.mensagem = "Número Inválido";
        }
    }
}
