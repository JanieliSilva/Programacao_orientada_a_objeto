package LISTA;

public class Matriz {
    private float[][] valores;


public Matriz(float a11, float a12, float a21, float a22){
    valores = new float[2][2];
    valores[0][0] = a11;
    valores[0][1] = a12;
    valores[1][0] = a21;
    valores[1][1] = a22;
}

public float determinante(){
    return (valores[0][0] * valores[1][1]) - (valores[0][1] * valores[1][0]);
}

public void imprimir(){
    System.out.println("MATRIZ: \n");
    System.out.println("[" + valores[0][0] + "  "+ valores[0][1]+ "]");
    System.out.println("[" + valores[1][0] + "  " + valores[1][1]+ "]");
}
}
