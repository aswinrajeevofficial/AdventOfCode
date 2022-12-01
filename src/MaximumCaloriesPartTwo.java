import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MaximumCaloriesPartTwo {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Aswin\\IdeaProjects\\AdventOfCode\\src\\MaximumCaloriesInput.txt");
        BufferedReader br = new BufferedReader((new FileReader(file)));

        String st;
        Long currentCalorie = 0L, maxCalorie1 = 0L, maxCalorie2 = 0L, maxCalorie3 = 0L;

        while((st = br.readLine()) != null){
            if(!st.isEmpty())
                currentCalorie += Long.valueOf(st);
            else {
                if(maxCalorie1 == 0)
                    maxCalorie1 = currentCalorie;
                else if(maxCalorie1 < currentCalorie){
                    Long temp = maxCalorie1;
                    maxCalorie1 = currentCalorie;
                    maxCalorie2 = temp;
                }
                else if(maxCalorie2 == 0){
                    maxCalorie2 = currentCalorie;
                }
                else if(maxCalorie2 < currentCalorie){
                    Long temp = maxCalorie2;
                    maxCalorie2 = currentCalorie;
                    maxCalorie3 = temp;
                }
                else if(maxCalorie3 == 0) {
                    maxCalorie3 = currentCalorie;
                }
                else if(maxCalorie3 < currentCalorie){
                    maxCalorie3 = currentCalorie;
                }
                currentCalorie = 0L;
            }
        }
        System.out.println(maxCalorie1);
        System.out.println(maxCalorie2);
        System.out.println(maxCalorie3);
        System.out.println(maxCalorie1 + maxCalorie2 + maxCalorie3);
    }

}
