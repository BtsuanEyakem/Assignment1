

import java.util.*;

    /**
     *  This class keeps hold of an instance of Random and guarantees
     *  that the same instance will be used over and over (so the cost
     *  of re-seeding the random number generator is avoided).
     *  Each time the getRandomInt() method is called, the next integer
     *  from this Random instance is returned.
     */
    public class RandomNumbers {
         short shortMaxVal = Short.MAX_VALUE;
         short shortMinVal = Short.MIN_VALUE;
         int intMaxVal = Integer.MAX_VALUE;
         int intMinVal = Integer.MIN_VALUE;
         Long LongMaxVal = Long.MAX_VALUE;
         Long LongMinVal = Long.MIN_VALUE;
          byte byteMaxVal = Byte.MAX_VALUE;
         byte byteMinVal = Byte.MIN_VALUE;

        static Random randomNum = new Random();

        static long randNum = RandomNumbers.getRandomInt(0,2000000000);
        static Random random;


        String name;

        private RandomNumbers() {
            random = new Random();
        }

       //RandomNumbers rand = new RandomNumbers();



        public String getRandNum(){

                 if (randNum < byteMaxVal && randNum > byteMinVal)
                     name = "byte";
                 else if (randNum < shortMaxVal && randNum > shortMinVal)
                     name ="short";
                 else if (randNum < intMaxVal && randNum > intMinVal)
                     name= "integer";
                 else if(randNum < LongMaxVal && randNum >LongMinVal)
                     name = "long";

            return name;
        }

        /**
         *  Use this method to get a random integer, with a call like this:
         *     int myInt = RandomNumbers.getRandomInt();
         */
        public static int getRandomInt() {
            if(random == null) new RandomNumbers();
            return random.nextInt();
        }
        /**
         * Returns a random integer x satisfying
         * lower <= x <= upper. If lower > upper, returns 0.
         * @param lower
         * @param upper
         * @return
         */
        public static int getRandomInt(int lower, int upper) {
            if(lower > upper) return 0;
            if(lower == upper) return lower;
            int difference = upper - lower;
            int start = getRandomInt();

            //nonneg int in the range 0..difference - 1
            start = Math.abs(start) % (difference+1);

            start += lower;
            return start;
        }

        public static void main(String[] args){
            Random r = new Random();
            RandomNumbers newone = new RandomNumbers();
            String Name = newone.getRandNum() + " Number";
            //System.out.println(" Random number "+ r.nextInt()+ "is "+ Name );
            //System.out.println("X Random Number : " + Math.random() + " is " + Name);


            System.out.println("Random number "+ randNum +" is "+Name);


        }





    }

