package at.mma.basics;

import java.util.Random;

public class If1 {
        public void ControlStruckturs3(){
        }

        public static void main(String[]args){
        Random random=new Random();

        int randomNumber=random.nextInt(100);
        System.out.println(randomNumber);

        if(randomNumber<20){
        System.out.println("Mini");

        }else if((randomNumber>20) && (randomNumber<50)){
        System.out.println("Medium");

        }else if(randomNumber==69) {
        System.out.println("nice");

        }else{
        System.out.println("Large");
        }

        }
        }
