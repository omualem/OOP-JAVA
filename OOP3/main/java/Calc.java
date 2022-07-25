public class Calc {
    //חיבור חיסור כפל מודולו שורש
    //בדיקה חיובית על כל פונקציה

    int add(int a, int b)
    {
        return a+b;
    }

    int sub(int a, int b)
    {
        return a-b;
    }

    int multiply(int a, int b)
    {
        return a*b;
    }
    int div(int a, int b)
    {
        if(b!=0)
            return a/b;
        else
            return -1;
    }

    int modulo(int a, int b)
    {
        return a%b;
    }

    double sqrt(int a){
        return Math.sqrt(a);
    }


}
