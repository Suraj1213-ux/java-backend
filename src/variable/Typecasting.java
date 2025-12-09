package variable;

public class Typecasting {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		double x = 1000000000;
//		
//		int k = (int)x;
//		System.out.println("x = " + x);
//		System.out.println("k = " + k);
//		
//
//	}
	
	public static void main(String[] args) {
//        String sentence = "java is fun";
//        
//        String reversed=new StringBuilder(sentence).reverse().toString();
//        System.out.println(reversed);
		
		int[] arr = {1, 2, 3, 2, 4, 5, 1, 6};

        System.out.print("Unique values: ");

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
	}

}

//avaj si nuf