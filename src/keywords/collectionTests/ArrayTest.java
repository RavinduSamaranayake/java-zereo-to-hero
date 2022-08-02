package keywords.collectionTests;

/**
 * @author Ravindu
 * 8/1/2022
 */
public class ArrayTest {
    private final int[][] array1 = {{1,3,5},{3,4,9},{2,1,5},{12,11,15}};
    private final Integer[][] array2 = {{1,3,5},{3,4,9,8},{2,1,5},{12,11,15}};

    public void printArray1(){
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printArray2(){
        for(int i=0;i<array2.length;i++){
            for(int j=0;j<array2[i].length;j++){
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public <T> void print2DArray(T[][] array2d){
        for(T[] rowArray : array2d){
            for(T element : rowArray){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayTest arrayTest = new ArrayTest();
        arrayTest.printArray1();
        System.out.println("*******************************************************");
        arrayTest.printArray2();
        System.out.println("*******************************************************");
        arrayTest.print2DArray(arrayTest.array2);
    }

}
