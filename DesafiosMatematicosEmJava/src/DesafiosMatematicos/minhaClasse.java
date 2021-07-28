package DesafiosMatematicos;

import java.io.IOException;
import java.util.Scanner;

public class minhaClasse {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int Par =0;
        int Impar =0;
        int Pos =0;
        int Neg =0;
        int x;

//continue a solução
        for (int i =0;i<5;i++) {
            x= leitor.nextInt();
            if (x % 2 ==0){
                Par++;
            }else{
                Impar++;
            }
            if (x>0){
                Pos++;
            }else if(x<0){
                Neg++;
            }
        }
//insira suas variaveis corretamente
        System.out.println(Par +" valor(es) par(es)");
        System.out.println(Impar +" valor(es) impar(es)");
        System.out.println(Pos +" valor(es) positivo(s)");
        System.out.println(Neg +" valor(es) negativo(s)");
    }
}
