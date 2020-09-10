public class PlusOne {

    public static void main(String[] args) {
        int inputs[][] = {{9}, {9,9}};
        int outputs[][] = new int[2][];

        for(int i = 0; i < inputs.length;i++){
            outputs[i] = plusOne(inputs[i]);
        }

        for(int[] list: outputs){
            for (int item:list){
                System.out.print(item + ", ");
            }
            System.out.println();
        }

    }

    public static int[] plusOne(int[] digits){
        int swaps = 1;
        int lastItemIndex = (digits.length -1);

        // Increment last digit
        digits[lastItemIndex] += 1;

        while(swaps > 0){
            swaps = 0;

            for (int i = 0; i < digits.length; i++){
                // Handle a ten within the class without resizing array
                if(digits[i] == 10 && i != 0){
                    swaps += 1;
                    digits[i -1] += 1;
                    digits[i] = 0;
                }
                if (digits[i] == 10 && i == 0) {
                    swaps += 1;
                    int newDigits[] = new int[digits.length + 1];
                    newDigits[0] = 1;
                    newDigits[1] = 0;

                    for(int j = 2; j < digits.length; j++){
                        newDigits[j] = digits[j];
                    }
                    digits = newDigits;
                    //lastItemIndex = digits.length -1;
                }
            }

        }
        return digits;
//        if(digits[digits.length -1] == 9){
//            if(digits.length > 1){
//                digits[digits.length - 2] = digits[digits.length -2] + 1;
//                digits[digits.length - 1] = 0;
//            } else {
//                digits = new int[2];
//                digits[0] = 1;
//                digits[1] = 0;
//            }
//        } else {
//            digits[digits.length -1] = digits[digits.length -1] + 1;
//        }
    }
}
