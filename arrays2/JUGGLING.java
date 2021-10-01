import java.util.*;
public class Solution {  
    public static void rotate(int[] arr, int d) {
		int i, j, k, temp,n=arr.length; 
 		for (i = 0; i < gcd(d, n); i++){ 
 		temp = arr[i]; 
 		j = i; 
 		while(true){ 
 			k = j + d; 
 			if (k >= n)
 			k = k - n; 
 			if (k == i)
 				break; 
 			arr[j] = arr[k]; 
 			j = k; 
 			} 
 		arr[j] = temp; 
 		}
    } 
    
    public static int gcd(int a, int b){ 
 		if (b == 0) 
 			return a; 
 		else
 			return gcd(b, a % b); 
 	}
}


