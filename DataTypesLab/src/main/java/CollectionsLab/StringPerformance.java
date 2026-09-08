/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionsLab;
/**
 *
 * @author Wholly Solly Store
 */
public class StringPerformance {

    public static String buildString(int n) {
        String s = "";
        for (int i = 0; i <= n; i++) {
            s = s + i;
        }
        return s;
    }

    public static String buildStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            sb.append(i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 10000;

        long startTime1 = System.currentTimeMillis();
        buildString(n);
        long endTime1 = System.currentTimeMillis();

        long startTime2 = System.currentTimeMillis();
        buildStringBuilder(n);
        long endTime2 = System.currentTimeMillis();

        System.out.println("String Time: " + (endTime1 - startTime1) + " ms");
        System.out.println("StringBuilder Time: " + (endTime2 - startTime2) + " ms");
    }
}
