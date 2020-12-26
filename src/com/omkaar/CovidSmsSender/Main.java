package com.omkaar.CovidSmsSender;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    //Plan
    /*
    * 0) This is originally planned to send SMSs to my grandmother who lives alone in India. This will help her decide-
    *    if she can go outside that week, or call in favors from our neighbours (who are very helpful). The least I could
    *    do from another country is something like this.
    * 1) Get JSON data from api and process it : DONE
    * 2) Send SMS of data to indian phone : DONE
    * 3) Use image manipulation to generate an image with all the statistics*** (very time consuming)
    *   3.1) Image template with colors is present, the algorithm has to add text manually to the image, without the use of
    *   and libraries which add text to image. This feature should work like a word processor.
    * 4) Be able to send image by SMS to a smartphone
    * 5) Potentially, make this a non-profit feature, where user sends a specefic SMS to a specefic number, and gets 
    *    subscribed to the messages.
    * */

    public static void main(String[] args) throws JSONException, IOException{
        int[] stats = CovidStats.getCovidStats("Mumbai");
        System.out.println(stats);
        SMS.send(CovidStats.outputString);
        //InfoCard.display(stats);
    }
}