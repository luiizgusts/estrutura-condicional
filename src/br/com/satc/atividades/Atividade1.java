
package br.com.satc.atividades;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        /* Fazer programa para calcular a média de 3 notas, perguntar qual a
        nota mínima para aprovação e se tem direito a recuperação. Se tiver,
        perguntar a nota de recuperação e refazer a média.
          Mostrar média e situação do aluno final.
        */
       Scanner entrada = new Scanner (System.in);
       float nota , nota2 , nota3 , aprovacao , notapro , fim , profinal;
       String prov = "";
       System.out.println ("Digite sua nota do primeiro trimestre:");
       nota = entrada.nextFloat();
       System.out.println("Digite a do segundo trimestre:");
       nota2 = entrada.nextFloat();
       System.out.println("Digite a nota do ultimo trimestre:");
       nota3 = entrada.nextInt();
       System.out.println("Qual a média mínima para ser aprovado?");
       aprovacao = entrada.nextFloat();
       fim = (nota+nota2+nota3)/3;
       if (fim >= aprovacao) { 
          fim = (nota+nota2+nota3)/3;
          System.out.println("Você foi aprovado!E sua média final é "+ fim);
       } else {      
        System.out.println("Na sua escola tem prova final?");
        prov = entrada.next();
       }
        if (prov.equals("sim")) {
          System.out.println("Qual a nota que você tirou na prova?");
          notapro = entrada.nextInt();
          profinal = (notapro+fim)/2;
          if (profinal >= 7) { 
             System.out.println("Você foi aprovado!E sua média foi "+profinal);    
          } else if (profinal < 7) {
              System.out.println("Você foi reprovado.Com média "+profinal);
          }
       } else if (prov.equals("nao")) {
          System.out.println("Você foi reprovado.Com média "+fim);
       }
        
       }
       
}
