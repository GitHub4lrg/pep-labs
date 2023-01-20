package com.revature;

import org.eclipse.jetty.server.Authentication.User;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.javalin.Javalin;

/**
 * Background: A json string representing a song will be sent in this POST request with the following fields: 
 *      songName, artistName
 */
public class JavalinSingleton {

    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        /**
         * problem1: retrieve the song object from the request body and return the artist name.
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/problem1", ctx -> {
            //retrieve the json string from the request body
            String jsonString = ctx.body();
                //implement logic here
            //utilize jackson to convert the json string to a user object
            ObjectMapper om = new ObjectMapper();
            Song song = om.readValue(jsonString, Song.class);
            //we need to let the request know we will send back json in the body
            ctx.contentType("application/json");
            //get the artist name
            //song.getArtistName();
            //utilize jackson convert back the user object to a json string
            //String jsonStringToBeReturned = song.getArtistName();
            //return the json string in the response body
            ctx.result(song.getArtistName());

        });

        /**
         * problem2: retrieve the song object from the request body...
         *      1. update the artist in the song object to "Beatles"
         *      2. return the updated song object in the response body
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/problem2", ctx -> {
               //implement logic here
               //retrieve the json string from the request body
               String jsonString = ctx.body();
               //utilize jackson to convert the json string to a user object
               ObjectMapper om = new ObjectMapper();
               Song artistName = om.readValue(jsonString, Song.class);
                //we need to let the request know, we will send back json in the body
               ctx.contentType("application/json");
               //update the artist name
               artistName.setArtistName("Beatles");
               //utilize jackson convert back the user object to a json string
               String jsonStringtoBeReturned = om.writeValueAsString(artistName);
               //return the json string in the response body
               ctx.result(jsonStringtoBeReturned);
        });


        return app;
    }
    
}
