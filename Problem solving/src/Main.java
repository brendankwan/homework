public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        //your code here
        int length = s.length();
        String aeiou = "aeiou";
        for(int i = 0 ; i < length; i ++)  {
            String letter = s.substring(i,i+1);
            if(aeiou.contains(letter)){
                answer = answer + 1;
            }
        }
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
        //your code here
        String bob = "bob";
        int length = s.length();
        for(int i = 0; i <length-2; i ++){
            String letter = s.substring(i,i+3);
            if(letter.equals(bob)){
                answer++;
            }
        }
        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        //your code here
        int num = 0;
        for(int i = 0; i<s.length()-1;i++){
            if(s.charAt(i)>s.charAt(i+1)){
                num = i;
            }
            else

        }
        return s;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s;
    }
}
