class Solution {
    public String intToRoman(int num) {
        int[] val={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C"); 
        map.put(90,"XC");
         map.put(50,"L");
          map.put(40,"XL");
           map.put(10,"X");
         map.put(9,"IX");
          map.put(5,"V");
         map.put(4,"IV");
          map.put(1,"I");
          StringBuilder s=new StringBuilder();
          int i=0;
          while(num>0)
          {
            if(num>=val[i])
            {
                num=num-val[i];
                s.append(map.get(val[i]));
            }
            else{
                i++;
            } 
          }
        String s1=new String(s);
    return s1;
    }
}
