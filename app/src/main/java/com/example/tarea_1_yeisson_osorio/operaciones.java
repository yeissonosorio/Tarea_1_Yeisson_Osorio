package com.example.tarea_1_yeisson_osorio;

public class operaciones {

    private int num1,num2;

    public operaciones(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int suma(){
        int rsuma = num1 + num2;
        return rsuma;
    }

    public int resta(){
        int rresta = num1 - num2;
        return rresta;
    }

    public int multi(){
        int rmult = num1 * num2;
        return rmult;
    }

    public float divi(){
        float rdivi = (float) num1 / num2;
        float res=(float) Math.round(rdivi * 100)/100;
        return res;
    }
}
