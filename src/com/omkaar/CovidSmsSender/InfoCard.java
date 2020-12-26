package com.omkaar.CovidSmsSender;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class InfoCard {
    public static String FOLDERPATH = "//Users//Omkaar//Downloads//Numbers//";

    public void setFolderPath(String fp){
        FOLDERPATH = fp;
    }

    public static void display(int[] stats){
        File inputf = new File(FOLDERPATH); //Add more to the folderpath
    }
}
