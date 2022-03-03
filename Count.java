public class Count {

    static int cc=0;
    final int x;
    Count()
    {   
        x=cc++;
    }
 public static void main(String[] args)
 {
    String s="Krishreddy460";
    Count c2=new Count();
    Count c3=new Count();


    int lower=0,Upperr=0,digit=0;
    for(int i=0;i<s.length();i++){
        char c = s.charAt(i);

        if('a'<=c && c<='z')
        lower++;
        else if('A'<=c && c<='Z')
        Upperr++;
        else
        digit++;
    }
    System.out.println(c2.x +"   "+c3.x);




    
 }   

}
