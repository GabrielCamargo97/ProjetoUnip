package Modelo;

public abstract class absPropriedades
{
    protected String numero1;
    protected String numero2;
    protected String numero3;
    protected Double lado1;
    protected Double lado2;
    protected Double lado3;
    protected int numero;
    protected String resposta;

    public absPropriedades(Double lado1, Double lado2, Double lado3)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public absPropriedades(String numero1, String numero2, String numero3)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public absPropriedades(String numero1)
    {
        this.numero1 = numero1;
    }

    public absPropriedades(int numero)
    {
        this.numero = numero;
    }

    public absPropriedades()
    {
    }

    public int getNumero()
    {
        return numero;
    }

    public String getResposta()
    {
        return resposta;
    }
}
