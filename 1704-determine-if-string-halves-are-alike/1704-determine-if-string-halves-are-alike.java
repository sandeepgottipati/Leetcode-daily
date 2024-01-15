class Solution {
    public boolean halvesAreAlike(String s) {
        String lowercaseStr=s.toLowerCase();
        int vowelCountOne=0;
        int vowelCountTwo=0;
        int n=s.length()-1;
        for(int i=0;i<lowercaseStr.length()/2;i++){
            if(containsVowel(lowercaseStr.charAt(i))){
                vowelCountOne++;
            }
            if(containsVowel(lowercaseStr.charAt(n-i))){
                vowelCountTwo++;
            }
        }

        return vowelCountOne==vowelCountTwo;
        
    }
    private boolean containsVowel(char c){
            if(c =='a'|| c=='e'||c=='i'||c=='o'||c=='u'){
                return true;
            }
            return false;
        }
}