package triangle;

import java.util.ArrayList;
import java.util.List;

public class FindPascalsTriangleFunction {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0; i < numRows; i++){
            // Reset a brand new row.
            List<Integer> currentRow = new ArrayList<>();
            
            // j < i + 1 since i starts from 0 and each row should have the same number of j 
            for(int j = 0; j < i + 1; j++){
                // First element of row is 1 and last element of row is 1
                if(j == 0 || j == i){
                    currentRow.add(1);
                } else {
                    // i - 1 will get the previous result element
                    
                    // j - 1 will get left element
                    int left = result.get(i - 1).get(j - 1);
                    
                    // j is the right element
                    int right = result.get(i - 1).get(j);
                    
                    // Add left and right and add it to the list
                    currentRow.add(left + right);
                }
            }
            
            // Add each row to the result
            result.add(currentRow);
        }
        
        return result;
    }
}
