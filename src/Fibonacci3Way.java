public class Fibonacci3Way {



    int fibonacciRecursion(int n){
        if (n<=1) return n;
        return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
    }

    int fibonacciMemonization(int n){


        int[] fiboArray = new int[n+2];
        fiboArray[0]=0;
        fiboArray[1]=1;
        for(int i=2; i<=n ;i++){

            fiboArray[i] = fiboArray[i-1] + fiboArray[i-2];
        }
        return fiboArray[n];
    }

    int fibonacciOptimized(int n){

        int a=0,b=1,c;
        if(n==0) return a;
        for (int i=2; i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }

    public static void main(String[] args){

        Fibonacci3Way fib3Way = new Fibonacci3Way();
        System.out.println(fib3Way.fibonacciRecursion(9));
        System.out.println(fib3Way.fibonacciMemonization(9));
        System.out.println(fib3Way.fibonacciOptimized(9));

    }

}


