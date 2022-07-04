import java.util.HashMap;
public class Solution {
    public void main(String[] args){
        isPalindrome(1000021);
    }
    public boolean isPalindrome(int x) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        if(x<0){
            return false;
        }else{
            for(int i=1;x>0;i++){
                map.put(i,x%10);
                x=x/10;
            }
            for(int j=1;j<map.size();j++){
                if(map.get(j)!=map.get(map.size()+1-j)){
                    return false;
                }
                return true;
            }
            return true;
        }
    }
}
