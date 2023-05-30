package org.aula;

public class MedNota{
    float n1;
    float n2;
    float proj;

     public float getN1(){
        return n1;
    }

     public float getN2(){
        return n2;
    }

    public float getProj(){
        return proj;
    }

    public void setN1(float n1){
        this.n1 = n1;
    }
    public void setN2(float n2){
        this.n2 = n2;
    }
    public void setProj(float proj){
        this.proj = proj;
    }

    public float CalcMedia(){
        return (this.n1+this.n2+this.proj)/3;
    }

}
