package com.omkaar.CovidSmsSender;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class CovidStats {
    private static String website = "https://api.covidindiatracker.com/state_data.json";
    private static String result = "";
    public static String outputString = "";

    public static int[] getCovidStats(String citi) throws JSONException, IOException, MalformedURLException{
        URL url = new URL(website); // URL to Parse
        URLConnection yc = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

        result = in.readLine();
        result = result.substring(1, result.length() - 1);

        JSONObject states = new JSONObject(result.trim());;
        JSONArray citiesArray = states.getJSONArray("districtData");
        JSONObject city = citiesArray.getJSONObject(0);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        outputString = String.format("COVID-19 Data Maharashtra as of " + dtf.format(LocalDateTime.now()) + "\nActive Cases: %d\nDeaths: %d\nRecovered: %d\nChange in Active Cases: %d\n", states.get("active"), states.get("deaths"), states.get("recovered"), states.get("aChanges"));
        for(int i = 0; i < citiesArray.length(); i++){
            city = citiesArray.getJSONObject(i);
            if(city.get("id").toString().toLowerCase().equals(citi.toLowerCase())){
                outputString = outputString.concat(String.format("\nConfirmed Cases in %s: %d\n", city.get("id").toString(), city.get("confirmed")));
                break;
            }
        }
        System.out.println(outputString);
        int[] ret = {Integer.parseInt(states.get("active").toString()), Integer.parseInt(states.get("deaths").toString()), Integer.parseInt(states.get("recovered").toString()), Integer.parseInt(states.get("aChanges").toString()), Integer.parseInt(city.get("confirmed").toString())};
        return ret;
    }

    public static int[] getCovidStats() throws JSONException, IOException, MalformedURLException{
        URL url = new URL(website); // URL to Parse
        URLConnection yc = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

        result = in.readLine();
        result = result.substring(1, result.length() - 1);

        JSONObject states = new JSONObject(result.trim());
        JSONObject city;
        JSONArray statesArray = states.getJSONArray("districtData");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        outputString = String.format("COVID-19 Data Maharashtra as of " + dtf.format(LocalDateTime.now()) + "\nActive Cases: %d\nDeaths: %d\nRecovered: %d\nChange in Active Cases: %d\n", states.get("active"), states.get("deaths"), states.get("recovered"), states.get("aChanges"));
        System.out.println(outputString);

        int[] ret = {Integer.parseInt(states.get("active").toString()), Integer.parseInt(states.get("deaths").toString()), Integer.parseInt(states.get("recovered").toString()), Integer.parseInt(states.get("aChanges").toString())};
        return ret;
    }
}
