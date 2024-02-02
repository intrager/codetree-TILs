import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int Y = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        int D = Integer.parseInt(arr[2]);

        String answer = "";        
        if(isExistDate(Y, M, D)) {
            answer = findSeasonCorrespondDate(Y, M, D);
        } else {
            answer = "-1";
        }
        System.out.print(answer);
    }

    private static String findSeasonCorrespondDate(int y, int m, int d) {
        String season = "";
        
        if(m >= 3 && m <= 5) {
            season = "Spring";
        } else if(m >= 6 && m <= 8) {
            season = "Summer";
        } else if(m >= 9 && m <= 11) {
            season = "Fall";
        } else {
            season = "Winter";
        }
        return season;
    }

    private static boolean isExistDate(int y, int m, int d) {
        
        if(m == 4 || m == 6 || m == 9 || m == 11) {
            if(d > 30) {
                return false;
            } else {
                return true;
            }
        } else if(m == 2) {
            if(isLeapYear(y)) {
                if(d > 29) {
                    return false;
                } else {
                    return true;
                }
            } else {
                if(d > 28) {
                    return false;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    private static boolean isLeapYear(int y) {
        if(y % 4 == 0) {
            if(y % 100 == 0) {
                if(y % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}