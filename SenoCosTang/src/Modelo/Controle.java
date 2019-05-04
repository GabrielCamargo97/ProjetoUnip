package Modelo;
//@author d518615
public class Controle extends absPropriedades
{

    public Controle(String numero)
    {
        super(numero);
    }
    
    @Override
    public void Executar()
    {
        absPropriedades validacao = new Validacao (this.numero);
        this.mensagem = validacao.mensagem;
        if (this.mensagem.equals("")) 
        {
            absPropriedades calcular = new Calcular (validacao.n1);
            this.resposta = calcular.toString();            
        }
    }
}
