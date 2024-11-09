package cn.matrizes;

public class Matrizes {
    public static void main(String[] args) {
     //   problema2();
      //  problema3();
        problema7();
    }

    public static void  problema2(){
        int m[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i= 0; i < m.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(m[i][j] + "-");
            }
            System.out.println();
        }
    }

    public static void problema3(){
        int m[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int i = 0; i < m.length; i++) {
            for (int j = i; j < m[i].length; j++) {
                System.out.printf("%d ", m[i][j]);
            }
            System.out.println();
        }
    }

    public static void problema4(){
        int m[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int i = 0; i < m.length; i++) {
            for (int j = i+1; j < m[i].length; j++) {
                System.out.printf("%d ", m[i][j]);
            }
            System.out.println();
        }
    }
    public static void problema5(){
        int m[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int i = 0; i < m.length; i++) {
            for (int j = i; j == i; j++) {
                System.out.printf("%d ", m[i][j]);
            }
            System.out.println();
        }
    }
    public static void problema6(){
        int m[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
    public static void problema7(){
        int m[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}
