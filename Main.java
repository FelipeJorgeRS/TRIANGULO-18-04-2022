import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    // ENTRADAS DO USÁRIO
    System.out.print("Digite o valor do lado A :  ");
    int ladoA = leitor.nextInt();

    System.out.print("Digite o valor do lado B :  ");
    int ladoB = leitor.nextInt();

    System.out.print("Digite o valor do lado C :  ");
    int ladoC = leitor.nextInt();

    // PROCESSAMNTO
  
    if (ladoA ==ladoB && ladoB ==ladoC)
    { System.out.println("Triangulo Equilátero");
      
    } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC )
    { System.out.println("Triangulo Isosceles");
      
    } else  { 
      // se (ladoA != ladoB && ladoB!= ladoC && LadoC"= ladoA )
      System.out.println("Triangulo Escaleno");
    }// Fim do if else
    

  }// FIM DO MÉTO main
}// FIM DA CLASSE Main