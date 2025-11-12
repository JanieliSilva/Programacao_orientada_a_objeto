package ListaAbstrata;

public class DemoMain {
    public static void main(String[] args){

        Circulo c1 = new Circulo("Janda de uma bicicleta infantil", 45);
        c1.Descrever();
        Quadrado q1 = new Quadrado("Tabuleiro de um jogo de xadrez", 30);
        q1.Descrever();
        Thiangulo t1 = new Thiangulo("Tela de uma barraca de camping", 120, 80);
        t1.Descrever();
    }
}
