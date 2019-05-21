import java.util.ArrayList;

public class Delimiters_Runner {
    public static void main(String[] args){
        Delimiters delim= new Delimiters("(",")");
        String[] tokens= {"(","x+y",")","*5"};
        ArrayList<String> arr=delim.getDelimiterList(tokens);
        System.out.println(delim.getDelimiterList(tokens));
        System.out.println(delim.isBalanced(arr));
    }
}
