package com.testing;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        String inputString = "aaabbaanjkkllaajjaaabbnj";
//output:{aaa=2, bb=2, aa=2, kk=1, ll=1, jj=1, j=1, n=2}

        ArrayList<String> arr = new ArrayList<>();
        int n= inputString.length();
        int c=0,i=0;
        while(i<n){
            c=0;
            while(inputString.charAt(i)==inputString.charAt(i+1))
            {
                c++;i++;
            }
            arr.add(inputString.substring(i,c));
        }
        HashMap<String, Integer> hm= new HashMap<>();
        for(int i1=0;i1<arr.size();i1++){
            if(hm.containsKey(arr.get(i1)))
                hm.put(arr.get(i1),hm.get(arr.get(i1)+1));
            else
                hm.put(arr.get(i1),1);
       }
       System.out.print(hm);
    }
}
