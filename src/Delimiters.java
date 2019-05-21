import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close){
        openDel=open;
        closeDel=close;
    }
    public ArrayList<String> getDelimiterList(String[] tokens){
        ArrayList<String> arr= new ArrayList<String>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals(openDel) || tokens[i].equals(closeDel)){
                arr.add(tokens[i]);
            }
        }
        return arr;
    }

    public boolean isBalanced(ArrayList<String> delimiters){
        boolean a=true;
        if(delimiters.size()%2==0){
            int o=0;
            int c=0;
            for(int i=0;i<delimiters.size();i++){
                if(delimiters.get(i).equals(openDel)){
                    o++;
                } else{
                    c++;
                }
                if(c>o){
                    a=false;
                }
            }
            if(o!=c){
                a=false;
            }
        }
        return a;
    }

}
