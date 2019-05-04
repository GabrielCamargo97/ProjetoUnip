package Modelo;

public class Triangulos extends absPropriedades implements intMetodos
{

    public Triangulos(Double lado1, Double lado2, Double lado3)
    {
        super(lado1, lado2, lado3);
        Executar();
    }
    

    @Override
    public void Executar()
    {
        if (this.lado1.equals(this.lado2) && this.lado2.equals(this.lado3))
        {
            this.resposta = "O triângulo é Equilátero!";
        }
        else if (this.lado1.equals(this.lado2) || this.lado2.equals(this.lado3) || this.lado1.equals(this.lado3))
        {
            this.resposta = "O triângulo é Isósceles!";
        }
        else
        {
            this.resposta = "O triângulo é Escaleno!";
        }
    }
    
}
