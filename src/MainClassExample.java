import java.util.Scanner;

public class MainClassExample {
    public static void main(String[] args){
        String texto = "";
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        Integer numInteiro = 2341;
        Float numFloat = 1.2F;
        Double numDouble = 2.2;
        boolean bool = false;
        ObjectOrientationExample dildo = new ObjectOrientationExample();
        ObjectOrientationExample dildo1 = new ObjectOrientationExample("Tortão pa esquerda","Quartzo");

        dildo.about();
        dildo1.about();

        /*
        System.out.println("Escreva alguma coisa");
        texto = scanner.nextLine();
        System.out.println("O que você escreveu foi: " + texto);
        */
        //transformaInt(1234);
        //imprimeNumeros(5);

    }

    public static void transformaInt(Integer numInteiro){
        System.out.println(numInteiro);
        numInteiro = numInteiro + 2;
        System.out.println(numInteiro);
        numInteiro = numInteiro - 2;
        System.out.println(numInteiro);
        numInteiro = numInteiro * 2;
        System.out.println(numInteiro);
        numInteiro = numInteiro / 2;
        System.out.println(numInteiro);
        numInteiro = numInteiro % 2;
        System.out.println(numInteiro);
    }


    public static void imprimeNumeros(Integer limite){
        for(
            //Inicializa o laço For
            Integer interador = 0;
            //Define a condição de parada do laço
            interador < limite;
            //Caso não bata a condição acima, reliza uma incrementação do numero
            interador++
        )
        {
            transformaInt(interador * (limite + 2));
        }

        // '=' pra definir uma variavel
        // '==' pra comparar
        /*
        if("aaa" == "aaa"){

        }

        while(true){

        }
         */
    }
}
