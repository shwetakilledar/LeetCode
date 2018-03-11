import java.util.*;

public class Keyboard {

    public String[] findWords(String[] words) {
        String[] line1 = {"QWERTYUIOPqwertyuiop","ASDFGHJKLasdfghjkl","ZXCVBNMzxcvbnm"};
        ArrayList<String> result = new ArrayList<String>();

        for(int i=0;i< words.length;i++){
            int k=0,l=0,m=0;
            char[] letterList=words[i].toCharArray();
            for(int j=0;j<letterList.length;j++){
               if(line1[0].contains(String.valueOf(letterList[j]))){
                   k++;
               } else if(line1[1].contains(String.valueOf(letterList[j]))){
                   l++;
               }else if(line1[2].contains(String.valueOf(letterList[j]))){
                   m++;
               }

            }
            if(k==letterList.length || l==letterList.length || m==letterList.length ){
                result.add(words[i]);
            }
        }
        String[] obj = result.toArray(new String[0]);
        return obj;
    }

    public static void main(String args[]){
        Keyboard ky=new Keyboard();
        String[] arr={"Aasdfghjkl","Qwertyuiop","zZxcvbnm"};
        String[] result=ky.findWords(arr);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }


}
