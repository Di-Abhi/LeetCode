class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solve("",0,0,n,res);
        return res;
    }
    private void solve(String curr,int open,int closed,int total,List<String> ans){
        if(curr.length()==2*total){
            ans.add(curr);
            return;
        }
        if(open<total){
            solve(curr+"(",open+1,closed,total,ans);
        }
        if(closed<open){
            solve(curr+")",open,closed+1,total,ans);
        }
    }
}