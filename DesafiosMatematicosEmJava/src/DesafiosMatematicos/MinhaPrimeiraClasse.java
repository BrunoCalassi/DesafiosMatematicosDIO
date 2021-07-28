package DesafiosMatematicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MinhaPrimeiraClasse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = "11 -11 11 10";
        String b = "7 6 -2 7";
        StringTokenizer st = new StringTokenizer(a, " ");
        StringTokenizer sk = new StringTokenizer(b, " ");
        for(int i=0;i<4;i++){
            int a1 = Integer.parseInt((st.nextToken()));
            int b1 = Integer.parseInt((sk.nextToken()));
            int total = a1+b1; // Altere o valor da variável com o cálculo esperado
            System.out.println("X = " + total);
        }
    }

}
