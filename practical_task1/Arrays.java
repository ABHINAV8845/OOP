package practical_task1;

public class Arrays {

		    public static void main(String[] args) {
		        int[] numbers = {6,3,0,5,3,4,1,8};
		        System.out.println("Array elements:" );
		        for (int i = 0; i < numbers.length; i++) {
		            System.out.println("Element at index " + i + ": " + numbers[i]);
		        }
		        int sum = 0;
		        for (int num : numbers) {
		            sum += num;
		        }
		        System.out.println("Sum of array elements: " + sum);
		        numbers[6] = 8;
		        System.out.println("new  element added  at the  index 6 is : " + numbers[6]);
		    }
		}