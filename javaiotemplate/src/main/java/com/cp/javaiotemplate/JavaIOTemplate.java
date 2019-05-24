package com.cp.javaiotemplate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class JavaIOTemplate {

    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);

        int T=0;
        try{
            T = Integer.parseInt(br.readLine().trim());
        }
        catch (Exception e){

        }
        for(int t_i=0; t_i<T; t_i++)
        {
            int N=0;
            int M=0;

            try{
                N = Integer.parseInt(br.readLine().trim());
                M = Integer.parseInt(br.readLine().trim());
            }
            catch (Exception e){

            }
            int[][] A = new int[N][M];
            for(int i_A=0; i_A<N; i_A++)
            {
                String[] arr_A = null;
                try{
                    arr_A = br.readLine().split(" ");
                }
                catch (Exception e){

                }
                for(int j_A=0; j_A<arr_A.length; j_A++)
                {
                    A[i_A][j_A] = Integer.parseInt(arr_A[j_A]);
                }
            }

        }

        wr.close();
    }
}
