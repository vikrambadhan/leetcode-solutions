#include <stack>
#include <string>
#include <iostream>
#include <algorithm>
using namespace std;

class Solution {
public:
    bool isValid(string s) {
        stack<char> st;

        for(char val :s){
            if(val == '(' || val == '[' || val == '{'){
                st.push(val);
            }else{
                if(st.empty()){
                    return false;
                }

                if (val == ')' && st.top() == '('){
                    st.pop();
                }else if(val == ']' && st.top() == '[' ){
                    st.pop();
                }else if(val == '}' && st.top() == '{'){
                    st.pop();
                }else{
                    return false;
                }
            }
        }

        return st.empty();
    }
};