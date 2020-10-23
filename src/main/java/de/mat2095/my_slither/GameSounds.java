package de.mat2095.my_slither;

import javax.sound.sampled.*;
import java.io.*;

public class GameSounds {

    /**
     * Plays a death sound
     */
    public static void deathSound()
    {
        try
        {
            //File pathway for the selected file
            File deathSound = new File("src/main/java/de/mat2095/Sounds/DeathSound.wav");

            //Create Audio input stream for
            AudioInputStream as = AudioSystem.getAudioInputStream(deathSound);
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            clip.start();


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /**
     * Sound for when the player's slither eats food
     */
    public static void eatFood()
    {

        try
        {
            //File pathway for the selected file
            File deathSound = new File("src/main/java/de/mat2095/Sounds/FoodSound.wav");

            AudioInputStream as = AudioSystem.getAudioInputStream(deathSound);
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            clip.start();


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }




}
