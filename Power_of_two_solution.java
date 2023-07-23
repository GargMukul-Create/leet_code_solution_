class Power_of_two_solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
    return (n & n-1) == 0;         // no. of set bits of power of 2 is onnly 1  and it gives zero when we do & operation. 

    }
}