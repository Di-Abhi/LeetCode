class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solve("",0,0,n,res);
        return res;
    }
    public List<String> solve(String curr,int open,int close,int total,List<String> ans){
        if(curr.length()==2*total){
            ans.add(curr);
            return ans;
        }
        if(open<total){
            solve(curr+"(",open+1,close,total,ans);
        }
        if(close<open){
            solve(curr+")",open,close+1,total,ans);
        }
        return ans;
    }
}