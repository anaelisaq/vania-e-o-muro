import java.util.*;
    public class prova6{
    public static void main(String[] args){
        int numeroAmigos, alturaMuro, alturaAmigos, larguraCalcada = 0;
        Scanner leitura = new Scanner(System.in);

        do {
            System.out.println("Digite a quantidade de amigos entre 1 e 1000: ");
            numeroAmigos = leitura.nextInt();
            System.out.println("Digite a altura do muro entre 1 e 1000: ");
            alturaMuro = leitura.nextInt();
        }
        while (numeroAmigos < 1 & numeroAmigos > 1000);
                
        while (alturaMuro < 1 & alturaMuro > 1000);

        int[] alturas = new int[numeroAmigos];
        
        for (int n=0; n<alturas.length; n++){
            System.out.println("Digite a altura do amigo: ");
            alturaAmigos = leitura.nextInt();
            if (alturaAmigos >= alturaMuro){
            
                larguraCalcada += 2;
    
            } else {
    
                larguraCalcada += 1;
            }
        }
            System.out.println("A largura mínima possível é de: " + larguraCalcada);

        leitura.close();
    }
        }
    