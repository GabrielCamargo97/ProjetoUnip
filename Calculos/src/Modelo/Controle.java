package Modelo;

public class Controle extends absPropriedades
{
    public void CalcularFatorial(String numero1)
    {
        Validacao validacao = new Validacao(numero1);
        if (Estaticos.mensagem.equals(""))
        {
            Fatorial fatorial = new Fatorial(validacao.getNumero());
            this.numero = fatorial.getNumero();
        }
    }        
    
    public void VerificarPrimo(String numero1)
    {
       Validacao validacao = new Validacao(numero1);
        if (Estaticos.mensagem.equals(""))
        {
            Primo primo = new Primo(validacao.getNumero());
            this.resposta = primo.getResposta();
        }
    }
    
    public void VerificarTriangulo(String numero1, String numero2, String numero3)
    {
        Validacao validacao = new Validacao(numero1, numero2, numero3);
        if (Estaticos.mensagem.equals(""))
        {
            Triangulos triangulos = new Triangulos(validacao.lado1, validacao.lado2, validacao.lado3);
            this.resposta = triangulos.getResposta();
        }
    }        
}
