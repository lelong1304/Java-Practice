import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class Pyramid {
    // create a function that takes the input a number n (int) and print the pyramid by n
    // calling the PrintPyramidService with the methods printPyramidOdd(int n) and printPyramidEven(int n)
    private final PrintPyramidService printPyramidService;

    public void pyramidSolve(int n) {
        if (n % 2 == 0) {
            this.printPyramidService.printPyramidEven(n);
        } else {
            this.printPyramidService.printPyramidOdd(n);
        }
    }
    public String getPyramidSolve(int n) {
        return n % 2 == 0 ? this.printPyramidService.pyramidEven(n) : this.printPyramidService.pyramidOdd(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pyramid pyramid = new Pyramid(new PrintPyramidService());
        System.out.println("Please input : ");
        int number = scanner.nextInt();
        System.out.println("Here is the pyramid : ");
        //pyramid.pyramidSolve(number);
        System.out.println(pyramid.getPyramidSolve(number));

    }
}
