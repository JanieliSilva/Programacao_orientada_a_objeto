package Lista2;

public class DemoEquipamento {
    public static void main(String[] args){
        Equipamento e1 = new Equipamento("Logitech", "Logitech", "Samsung");
        Computador c1 = new Computador("Logitech", "Logitech", "Samsung", "Intel i5", 8);

        System.out.println(e1);
        System.out.println(c1);
    }
}
