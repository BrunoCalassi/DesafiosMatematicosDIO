package DesafiosMatematicos;

public class test {
   /*    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int total = a+b; // Altere o valor da variável com o cálculo esperado
        System.out.println("X = " + total);
    }*/
  public static void main (String [] args){

            Scanner sc = new Scanner(System.in);
            int a, b;

            System.out.println("Recebe o valor do pimentão amarelo");
            a = sc.nextInt();
            System.out.println("Recebe o valor do pimentão vermelho");
            b = sc.nextInt();
            int total = a+b;;
            System.out.println("X = " + total);
        }

}
