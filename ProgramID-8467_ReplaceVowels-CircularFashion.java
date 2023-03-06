import java.util.Scanner;
class Program{
    public static int isvwl(char ch){
        char[] ch_arr = {'a','e','i','o','u'};
        for(int i=0;i<ch_arr.length;i++){
            if(ch==ch_arr[i])
                return 1;
        }
        return 0;
    }
    public static char rotate(int cnt){
        char[] ch = {'a','e','i','o','u'};
        return ch[cnt];
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int i,len,cnt=0;
        String str = new String();
        str = sc.next();
        char[] ch = str.toCharArray();
        for(i=0;i<ch.length;i++){
            if(isvwl(ch[i])==1){
                ch[i]=rotate(cnt++);
                if(cnt==5)
                    cnt=0;
            }
            System.out.print(ch[i]);
        }
    }
}