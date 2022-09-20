package homework;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class ReplitPractice {

    public static void main(String[] args) {

        String str = "breadjam";



        String firstBread = str.substring(0,5);


        int indexOfSecondBread = str.lastIndexOf("b");
        String secondBread = str.substring(indexOfSecondBread);

        String inside = str.substring(5,indexOfSecondBread);

        if(str.contains("bread")){}


  

    }
}
