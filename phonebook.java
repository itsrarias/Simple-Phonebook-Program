import java.util.Scanner; 
import java.io.*;  

public class phonebook {
    public static void main(String[] args) throws Exception {
        String[] stringArray = new String[10000];
        int N = 0;
        try {
            File input = new File("input.txt");
            Scanner myReader = new Scanner(input);
            while (myReader.hasNextLine()) {
              stringArray[N] = myReader.nextLine();
              N++;
              //System.out.println(data);
            }
            
            myReader.close();
            } 
            catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          
          try{
            //BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            for(int i = 0; i < N; i++){
                for(int k = 0; k < N + 1; k++){
                    if(stringArray[k + 1] == null){
                        System.exit(0);
                    }
                    else{
                        if(stringArray[k + 1].startsWith(stringArray[i])){
                          BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
                            writer.write("0");
                            writer.close();
                        }
                        else{
                          BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
                            writer.write("1");
                            writer.close();
                        }
                    }
                }
            }
          }
            catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        }
    }
