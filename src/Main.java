import com.formacom.INumeros;
import com.formacom.Numeros;
import com.formacom.Numeros2;

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
        int menuSeleccionado;
        String menu= """
                1. Nuevo alumno
                2. Consultar notas.
                ...
                10. Salir
                """;
        do{
            System.out.println(menu);
            menuSeleccionado=leer.nextInt();
    


        }while(menuSeleccionado!=10);


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

