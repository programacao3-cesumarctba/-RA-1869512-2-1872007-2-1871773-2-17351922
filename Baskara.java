package br.edu.unicesumar.main;

public class Baskara {
    public int A;
    public int B;
    public int C;
    public float result;


    public void Baskara(int num1,int num2,int num3) {
        this.A = num1;
        this.B = num2;
        this.C = num3;

        this.calcdelta();
    }


    public float calcdelta(){
        result=(this.B)*2-4*this.A*this.C;
        return  result;
    }

    public float calcx(int x){ ;
        if(x==1){

            float result2= (-(this.B)+this.calcdelta())/2*this.A;

        }else{
            float result2=(-(this.B)-this.calcdelta())/2*this.A;

        }

        return result2;

    }



}
