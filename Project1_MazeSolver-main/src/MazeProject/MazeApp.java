package MazeProject;
import javax.swing.*;
import java.awt.*;
//GUI
public class MazeApp {
    // Initilize JSwing components
    JFrame frame;

    JLabel noMaze;
    JLabel mazeLoaded;
    JLabel workingSolution;
    JLabel correctSolution;
    JLabel failedSolution;


    JTextField fileInput;

    JButton load;
    JButton start;  // start animation
    JButton step;   // go through the solution step-by-step
    JButton clear;  // clear loaded file and prepare for new file


    /**
     * Maze layout
     * Open squares = white
     * Walls/Unused spots = black
     * Visited squares = "medium-grey"
     * 
     */
    
    // Construct all UI components
    public MazeApp() {
        // Frames
        frame = new JFrame("Maze Solver");

        // Labels
        noMaze = new JLabel("No maze");
        mazeLoaded = new JLabel("Maze loaded");
        workingSolution = new JLabel("Solution in progress");
        correctSolution = new JLabel("Solution complete: exit reachable at {X},{Y} in {N} moves");
        failedSolution = new JLabel("Solution complete: exit not reachable");

        // Buttons
        load = new JButton("Load");
        start = new JButton("Start");
        step = new JButton("Step Through");
        clear = new JButton("Clear");

        // Text Fields
        fileInput = new JTextField(20);
    }

    // Add components to the frame
    private void addComponents() {
        frame.setLayout(new GridLayout(2,3));
        frame.add(noMaze);
        frame.add(mazeLoaded);
        frame.add(workingSolution);
        frame.add(correctSolution);
        frame.add(failedSolution);
    }

    // Close GUI
    private void disposeFrame() {
        frame.dispose();
    }

    public static void main(String[] args) {
        // Run GUI
        MazeApp maze = new MazeApp();
        maze.addComponents();
    }
}
