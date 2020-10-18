package de.mat2095.my_slither;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.io.*;

public class GameSounds {

    /**
     * Plays a death sound
     */
    public static void deathSound()
    {
        try
        {
            String deathSound = "DeathSound.mp3";
            InputStream in = new FileInputStream(deathSound);
            AudioStream as = new AudioStream(in);

            AudioPlayer.player.start(as);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


    }

    /**
     * Sound for when player eats bad food
     */
    public static void badFood()
    {

    }

    /**
     * Sound for when the player's slither eats good food
     */
    public static void goodFood()
    {

    }




}
