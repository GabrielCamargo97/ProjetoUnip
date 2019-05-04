package Modelo;

public class Fatorial extends absPropriedades implements intMetodos
{

    public Fatorial(int numero)
    {
        super(numero);
        Executar();
    }

    @Override
    public void Executar()
    {
        for (int i = this.numero - 1; i > 0; i--)
        {
            this.numero *= i;
        }
    }
}
