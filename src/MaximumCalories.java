import java.io.*;

public class MaximumCalories {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Aswin\\IdeaProjects\\AdventOfCode\\src\\MaximumCaloriesInput.txt");
        BufferedReader br = new BufferedReader((new FileReader(file)));

        String st;
        Long currentCalorie = 0L, maxCalorie = 0L;
        while((st = br.readLine()) != null){
            if(!st.isEmpty())
                currentCalorie += Long.valueOf(st);
            else{
                if(maxCalorie == 0 || maxCalorie < currentCalorie)
                    maxCalorie = currentCalorie;
                currentCalorie = 0L;
            }
        }
        System.out.println(maxCalorie);
    }
}
