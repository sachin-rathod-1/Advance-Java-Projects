package Exams;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CandidateCode {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the number of animals and available capacity
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

//        int N = Integer.parseInt(br.readLine().trim());
//        int X = Integer.parseInt(br.readLine().trim());
        
        // Read the energy levels of the animals
        long[] energyLevels = new long[N];
        //st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            energyLevels[i] = Long.parseLong(br.readLine().trim());
        }

        // Sort the energy levels in ascending order
        Arrays.sort(energyLevels);

        // Find the minimum energy level P
        //long minEnergyLevel = energyLevels[N - X];
        long minEnergyLevel = energyLevels[N - X];
        int count=0;
        int i=energyLevels.length-1;
        
        // Check if it is possible to save exactly X animals
//        for (int i = N - X + 1; i < N; i++) {
//            if (energyLevels[i] != minEnergyLevel) {
//                minEnergyLevel = 2; // Not possible to save exactly X animals
//                break;
//            }
//        }

//        for(int i=energyLevels.length-1; i>=0; i--) {
//        	
//        }
        while (count != X && i>=0) {
			minEnergyLevel=energyLevels[i];
			count++;
			i--;
		}
        // Print the minimum energy level P
        minEnergyLevel=energyLevels[i--];
        if(energyLevels[i-1] <=  minEnergyLevel) {
        	System.out.println(-1);
        }else {
        	 System.out.println( "Output is: "+minEnergyLevel);
		}
        
       
       
    }
}
