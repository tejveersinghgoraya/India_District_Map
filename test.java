class Solution {
    public int repeatedStringMatch(String A, String B) {
        if(A==null || B==null)
            return -1;
     
        StringBuilder temp = new StringBuilder();
        int count = 0;
        while(temp.length()<B.length()){
            temp.append(A);
            count++;
        }
        if(isFound(temp, B))
            return count;
        if(isFound(temp.append(A), B))
            return count+1;
        return -1;
    }
    
    private boolean isFound(StringBuilder A, String B){
        for(int i=0; i<A.length() ; i++){
            int start = i;
            int j=0;
            while(start<A.length() && j<B.length() && A.charAt(start) == B.charAt(j)){
                start++;
                j++;
      
            }
            if(j==B.length())
                return true;
        }
        return false;
    }
}
