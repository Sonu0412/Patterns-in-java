public class PatternProgramming4 {
    public static void main(String[] args){
        int num = 5;
        for(int i = 5;i>=1;i--) {
            System.out.println();
            for (int j = 5; j >= 1; j--) {
                System.out.print(i);
            }
        }
    }
}
//output
/*
5 5 5 5 5
4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1
 */