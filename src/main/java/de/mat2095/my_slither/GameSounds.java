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
            File deathSound = new File("src/main/java/de/mat2095/Sounds/DeathSound.wav");
            System.out.println(deathSound.getAbsolutePath()+deathSound.getCanonicalPath());
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
     * Sound for when the player's slither eats good food
     */
    public static void eatFood()
    {
        try
        {
            try
            {
                File deathSound = new File("src/main/java/de/mat2095/Sounds/FoodSound.wav");
                System.out.println(deathSound.getAbsolutePath()+deathSound.getCanonicalPath());
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
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }




}
