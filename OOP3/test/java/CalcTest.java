import org.junit.Assert;
import org.junit.Test;

public class CalcTest
{
        Calc c = new Calc();

        @Test
        public void test_add_p(){
            int a = 10,b=5,expected = 15,actual= c.add(a,b);
            Assert.assertEquals(expected,actual);
        }

        @Test
        public void test_sub_p(){
            int a = 10,b=5,expected = 5,actual= c.sub(a,b);
            Assert.assertEquals(expected,actual);
        }

        @Test
        public void test_multiply_p(){
            int a = 10,b=5,expected = 50,actual= c.multiply(a,b);
            Assert.assertEquals(expected,actual);
        }


        @Test
        public void test_div_positive() {
            int inputA = 8;
            int inputB = 2;
            int expected = 4;
            int actual = c.div(inputA,inputB);
            Assert.assertEquals(expected,actual);
        }

       @Test
        public void test_div_negative() {
            int inputA = 8;
            int inputB = 0;
            int expected = -1;
            int actual = c.div(inputA,inputB);
            Assert.assertEquals(expected,actual);
        }
        @Test
        public void test_modulu_p(){
            int a = 10,b=5,expected = 0,actual= c.modulo(a,b);
            Assert.assertEquals(expected,actual);
        }

        @Test
        public void test_sqrt_p(){
            int a = 25,expected = 5;
            double actual= c.sqrt(a);
            Assert.assertEquals(expected,actual);
        }



}


