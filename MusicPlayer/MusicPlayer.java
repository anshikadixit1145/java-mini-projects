⭐ MUSIC PLAYER 🎶
*******************************************************************************************

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        //How to PLAY AUDIO with Java (.wav, .au, .aiff)

        String filePath = "src\\The Reins - Blue Deer.wav";

        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            //* Clip is like a music or sound player, it allows you to load an audio file and then play, pause, stop or reset the audio.


            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);


            String response= "";

            while(!response.equals("Q")){

                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice!");
                }
            }
            

        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file!");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported!");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch(IOException e){       //SAFETY NET
            System.out.println("Something is wrong!");
        }
        finally{
            System.out.println("BYE!");

        }

    }
}

*******************************************************************************************