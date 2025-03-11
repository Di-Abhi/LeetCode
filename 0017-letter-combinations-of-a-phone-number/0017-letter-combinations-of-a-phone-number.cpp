class Solution {
    private:
    void solve(string digits,string s,int ind,vector<string>& ans,string mapping[]){
        if(ind==digits.length()){
            ans.push_back(s);
            return;
        }
        int num = digits[ind]-'0';
        string value = mapping[num];
        for(int i=0;i<value.length();i++){
            s.push_back(value[i]);
            solve(digits,s,ind+1,ans,mapping);
            s.pop_back();
        }
    }
public:
    vector<string> letterCombinations(string digits) {
        vector<string> ans;
        string s;
        if(digits==""){
            return ans;
        }
        int ind=0;
        string mapping[10]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(digits,s,ind,ans,mapping);
        return ans;
    }
};