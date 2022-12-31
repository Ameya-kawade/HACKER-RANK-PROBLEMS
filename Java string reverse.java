public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
       /* Enter your code here. Print output to STDOUT. */
       String d="";
       char ch[]=A.toCharArray();
       for(int i=ch.length-1;i>-1;i--){
           d+=ch[i];
           
       }
       if(d.equals(A)){
        System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }
       
       
    }
}
