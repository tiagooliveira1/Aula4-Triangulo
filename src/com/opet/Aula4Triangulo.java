package com.opet;

public class Aula4Triangulo
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int quantidadeX = 1;
        int espacosEmBranco = 0;
        String xis = "";
        for(int i=1; i<=9;i++) {
            xis = "";
            if(i>1)
                quantidadeX = quantidadeX+2;
            for(int j=1;j<=quantidadeX;j++) {
                xis = xis + "X";
            }
            espacosEmBranco = (17-quantidadeX)/2;
            for(int j=1;j<=espacosEmBranco;j++) {
                xis = " "+xis;
            }
            System.out.println(xis);
        }
    }

}
