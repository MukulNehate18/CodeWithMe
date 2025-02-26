package corejava.array;
import java.util.Arrays;
//Problem Statement: Maximum population year
public class MaxPopulation {
    public static void main(String[] args) {
        int[][] logs = {
                {2008,2026},
                {2004,2008},
                {2034,2035},
                {1999,2050},
                {2049,2050},
                {2011,2035},
                {1966,2033},
                {2044,2049}
        };
        System.out.println(maxPopulationYear(logs));
    }

    private static int maxPopulationYear(int[][] logs) {
//        int[][] year = new int[logs.length*2][2];
//        int[] population=new int[year.length];
//        int k=0;
//        for (int[] log : logs) {
//            for (int j = 0; j < log.length; j++) {
//                if (j == 0) {
//                    year[k][0] = log[j];
//                    year[k][1] = 1;
//                    k++;
//                } else if (j == 1) {
//                    year[k][0] = log[j];
//                    year[k][1] = -1;
//                    k++;
//                }
//            }
//        }
//        System.out.println(Arrays.deepToString(year));
//        Arrays.sort(year, (a, b)-> Integer.compare(a[0], b[0])) ;
//        System.out.println(Arrays.deepToString(year));
//        for (int i=0;i<year.length-1;i++){
//            for (int j=1;j<year[i].length;j++){
//                if (i==0){
//                    population[i]= 1;
//                }else if ((year[i][0]==year[i+1][0] && year[i][1]!=year[i+1][1])){
//                    population[i+1]=population[i]=population[i-1];
//                    i++;
//                }else if (year[i][j]==1){
//                    population[i]= population[i-1]+1;
//                }else{
//                    population[i]= population[i-1]-1;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(population));
//        int max=0, index=0;
//        for (int i=0;i<population.length;i++){
//            if (max<population[i]){
//                max=population[i];
//                index=i;
//            }
//        }
//        return year[index][0];


        int[] year = new int[2051];

        for(int[] log: logs){
            year[log[0]] += 1;
            year[log[1]] -= 1;
        }

        int maxNum = year[1950], maxYear = 1950;

        for(int i = 1951; i < year.length; i++){
            year[i] += year[i - 1];
            if(year[i] > maxNum){
                maxNum = year[i];
                maxYear = i;
            }
        }
        return maxYear;
    }
}
