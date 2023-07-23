class Palindrome {
    public boolean isPalindrome(int x) {
    int digit = 0;
    int number = x;
    boolean status = false;
    if(x<0)
        return status;
    if(x>0 && x<10)
        status = true;
    while(x>0){
        digit = digit * 10 + x % 10;
        x = x/10;
    }
    if(digit == number)
        status = true;
    return status;
    }
}