import com.formacom.Numeros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner leer=new Scanner(System.in);
        List<Integer> numeros=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número");
            numeros.add(leer.nextInt());
        }
        Numeros listaNumeros=new Numeros(numeros);

        System.out.println("El menor es: "+listaNumeros.menor());
        System.out.println("Numeros pares");
        System.out.println(listaNumeros.pares());



    }

    private static   Integer menor(List<Integer> listaNumeros){
        Integer menor=listaNumeros.get(0);
        for (Integer numero : listaNumeros) {
            if(menor>numero){
                menor=numero;
            }
        }

        return menor;
    }
}

