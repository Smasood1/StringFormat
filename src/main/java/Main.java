public class Main {

        public static String printReceipt(String product, int qty, double price, float miles){
            //Given the qty and price, we need to figure out the total

            double fee;
            double total = qty * price;
            //We need to figure out delivery fee
            //-Check a set of conditions that uses the miles to charge custom fee
            if(miles <= 4){
                //charge them $2
                fee = 2.0f;
                //calculate total
                total = total + fee;
            } else if (miles >= 5 && miles <= 15){
                fee = 5.0f;
                total = total + fee;
            } else if (miles >= 16 && miles <= 25){
                fee = 10.0f;
                total = total + fee;
            } else if (miles >= 26 && miles <= 50){
                fee = 15.0f;
                total = total + fee;
            } else {
                fee = 20.0f;
                total = total + fee;
            }

            //return "Product: " + product + "\n" + "Qty: " + qty + "\n" + "Price: $" + price + "\n" + "Miles: " + miles + "\n" + "===================" + "\n" + "Total: $" + total;
            /*
            * WRITE A PROGRAM THAT CALCULATES TOTAL COST OF USER'S ITEMS
         YOUR OUTPUT SHOULD BE FORMATTED AS SEEN BELOW!!
         ________________________________________________



			line1 Product      Qty      Price       Miles      Total
			line 2 ----         ---      -----      -----      -----
			line 3Rice          20        5.0       10.0      105.0

					      Thank you. Come Again!!!

            */


            String variables = String.format("%6s %6s %7s %7s %7s","Product","Qty","Price","Miles","Total");
            String dashes = String.format("%6s %8s %6s %6s %8s", "-----","-----","-----","-----","-----");
            String results = String.format("%5s %7s %7.1f %8.1f %8.1f",product,qty,price,miles,total);

            return variables + "\n"+ dashes + "\n" + results + "\n      Thank you. Come Again!!!";





        }

        public static void main(String[] args) {

            //String product = printReceipt("Rice", 20, 5.00, 10.0f);

            System.out.println(printReceipt("Rice",20, 5.00, 10.0f));






        }





}
