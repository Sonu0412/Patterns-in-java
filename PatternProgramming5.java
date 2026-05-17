public class PatternProgramming5 {
    public static void main(String[] args){
        int num = 5;
        for(int i = 1;i<=num;i++) {
            System.out.println();
            for (int j = 5; j >= 1; j--) {
                System.out.print(Integer.toString(j).repeat(1));
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