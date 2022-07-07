
public class PrintPyramidService {
    private Integer getLength(int n) {
        return (n+1)/2;
    }

    public void printPyramidOdd(int n) {
        int length = getLength(n);
        for (int i = 0; i< length; i++) {
            int firstPos = n/2 - i;
            int lastPos = n/2 + i;
            for (int j=0;j<n;j++) {
                if (j>=firstPos && j<=lastPos) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void printPyramidEven(int n) {
        int length = getLength(n);
        for (int i = 0; i<length; i++) {
            for (int j=0;j<n;j++) {
                if (j>=i && j<n-i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public String pyramidOdd(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = getLength(n);
        for (int i = 0; i< length; i++) {
            int firstPos = n/2 - i;
            int lastPos = n/2 + i;
            for (int j=0;j<n;j++) {
                if (j>=firstPos && j<=lastPos) {
                    stringBuilder.append("*");
                } else {
                    stringBuilder.append(" ");
                }
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public String pyramidEven(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = getLength(n);
        for (int i = 0; i<length; i++) {
            for (int j=0;j<n;j++) {
                if (j>=i && j<n-i) {
                    stringBuilder.append("*");
                } else {
                    stringBuilder.append(" ");
                }
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
