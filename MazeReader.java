import java.io.*;
import java.util.ArrayList;

public class MazeReader {
    private char[][] maze;

    public MazeReader(String fileName) throws IOException{

        ArrayList<ArrayList<Character>> tempMaze = new ArrayList<>();
         fileName = System.getProperty("user.dir") + "/" + fileName;
        System.out.println(fileName);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        try {
            String line = bufferedReader.readLine();
            while(line != null) {
                ArrayList<Character> chars = new ArrayList<>();
                for (char c : line.toCharArray()) {
                    chars.add(c);
                }
                tempMaze.add(chars);
                line = bufferedReader.readLine();
            }

        } catch(Exception e) {
            System.err.println("Error encountered");
        } finally {
            bufferedReader.close();
        }

        maze = new char[tempMaze.size()][tempMaze.get(0).size()];
        for (int i = 0; i < tempMaze.size(); i++) {
            for (int j = 0; j < tempMaze.get(i).size(); j++) {
                maze[i][j] = tempMaze.get(i).get(j);
            }
        }
        
     for(int i=0;i<maze.length;i++){
        for(int j=0;j<maze[0].length;j++){
            System.out.print(maze[i][j]);
        }
            System.out.println();
     }

    }

public static void main(String[] args)
{
try {
       MazeReader ob=new MazeReader("maze-1.txt");
    } catch (IOException ioe) {
        System.out.println("Trouble reading from the file: " + ioe.getMessage());
    } 
}


}
